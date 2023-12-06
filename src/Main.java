import java.util.InputMismatchException;
import java.util.Scanner;
import Service.WalletService;
import dao.walletDao;

public class Main {
    public static void main(String[] args) {
        WalletService walletService = new WalletService();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\nOPTIONS:");
            System.out.println("1. Create wallet");
            System.out.println("2. Transfer Amount");
            System.out.println("3. Account Statement");
            System.out.println("4. Overview");
            System.out.println("5. Exit");
            try {
                switch (sc.nextInt()) {
                    case 1:
                        System.out.println("You have selected create wallet");
                        System.out.println("Enter name:");
                        String name = sc.next();
                        System.out.println("Enter amount:");
                        double amount = sc.nextDouble();
                        walletService.createAccount(name, amount);

                        break;
                    case 2:
                        System.out.println("You have selected to transfer amount");
                        System.out.println("Enter the acc num from:-");
                        int from = sc.nextInt();
                        System.out.println("Enter the acc num to:-");
                        int to = sc.nextInt();
                        System.out.println("Enter amount for transfer");
                        int am = sc.nextInt();
                        walletService.transaction(from, to, am);
                        break;
                    case 3:
                        System.out.println("You have selected to see account statement");
                        break;
                    case 4:
                        System.out.println("You have selected to see the overview");
                        walletService.overview();
                        break;
                    case 5:
                        System.out.println("You have selected to exit from system");
                        break;
                    default:
                        System.out.println("Wrong input");
                        break;

                }
            }catch (InputMismatchException e){
                System.out.println("Enter a valid digit from the list");
                throw new InputMismatchException("Enter valid");
            }

        }while (sc.nextInt() !=5);
    }
}