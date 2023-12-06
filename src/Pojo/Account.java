package Pojo;

import java.util.UUID;
import util.AccNumGenerator;
public class Account {
    private double amount;
    private int accNum;
    private User user;

    public Account(String name, double amount){
        this.user = new User(name);
        this.amount = amount;
        this.accNum = AccNumGenerator.generateAccNum();
    }


    public int getId() {
        return accNum;
    }

    public double getAmount() {
        return amount;
    }

    public User getUser() {
        return user;
    }

    public void setId(int accNum) {
        this.accNum = accNum;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setUser(User user) {
        this.user = user;
    }


}
