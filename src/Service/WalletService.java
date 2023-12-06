package Service;
import Pojo.Account;
import Pojo.User;
import dao.walletDao;

import java.time.temporal.TemporalAmount;

public class WalletService {
    private walletDao walletDao;

    public WalletService(){
        walletDao = new walletDao();
    }


    public void createAccount(String name, double amount){
        User user = new User(name);
        Account acc = new Account(name, amount);
        walletDao.getAccountMap().put(acc.getId(), acc);
        System.out.println("Account created for "+user.getName()+"with acc id:-"+acc.getId());
    }

    public void overview(){
        for(int num : walletDao.getAccountMap().keySet()){
            Account acc = walletDao.getAccountMap().get(num);
            System.out.println("here are the details-");
            System.out.println("User- "+acc.getUser().getName()+"accountNum- "+acc.getId()+" with balance - "+acc.getAmount());
        }
    }

    private boolean isValid(int amount, Account acc1, Account acc2){
        if(acc1.getAmount() < amount) {
            System.out.println("Your acc. balance is insufficient");
            return false;
        }
        else if(amount < 0.0001){
            System.out.println("Min. tranferrable amount is 0.0001");
            return false;
        }
        else if(acc1.getId() == acc2.getId()){
            System.out.println("Sender and receiver cannot be same");
            return false;
        }
        else if(!walletDao.getAccountMap().containsKey(acc1.getId())){
            System.out.println("Invalid Sender's account number");
            return false;
        }
        else if(!walletDao.getAccountMap().containsKey(acc2.getId())){
            System.out.println("Invalid Receiver's account number");
            return false;
        }
        else return true;
    }


    public void transaction(int from, int to, int amount){
        Account acc1 = walletDao.getAccountMap().get(from);
        Account acc2 = walletDao.getAccountMap().get(to);

        if(isValid(amount, acc1, acc2)){
            acc1.setAmount(acc1.getAmount() - amount);
            acc2.setAmount(acc2.getAmount() + amount);
            System.out.println("Transfer successful");
        }else{
            System.out.println("Try again :)");
        }
    }



}
