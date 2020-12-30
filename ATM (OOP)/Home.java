import java.util.Scanner;


public class Home {
    
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
    
        Account chequing = new Account(0, "chequing");
        Account savings = new Account(0, "savings");

        boolean sitting = true;


        while(sitting){

            System.out.print("\nATM Home Menu: \n \n"
            + "1. Deposit \n"
            + "2. Withdraw \n"
            + "3. Transfer Funds \n"
            + "4. Check Account Balance\n"
            + "5. Exit\n \n"
            + "Enter Choice: ");

            int choice = sc.nextInt();


            switch(choice){

                case 1:
                    System.out.print("Enter Chequing (1) or Savings (2):  ");
                    int selectAccount = sc.nextInt();

                    if (selectAccount == 1) {
                        System.out.println("Your current Chequing balance is:   $" + chequing.getBalance());
                        System.out.print("Enter amount to deposit:   ");
                        int depositAmount = sc.nextInt();
                        chequing.deposit(depositAmount);
                        System.out.printf("Your Chequing balance is now:   $%d%n", chequing.getBalance());
                    
                    } else if (selectAccount == 2) {
                        System.out.println("Your current Savings balance is:   $" + savings.getBalance());
                        System.out.print("Enter amount to deposit:   ");
                        int savingsDeposit = sc.nextInt();
                        savings.deposit(savingsDeposit);
                        System.out.printf("Your Chequing balance is now:   $%d%n", savings.getBalance());
                    }

                    break;
                
                
                
                case 2:
                    System.out.print("Enter Chequing (1) or Savings (2):  ");
                    selectAccount = sc.nextInt();

                    if (selectAccount == 1) {
                        System.out.println("Your current Chequing balance is:   $" + chequing.getBalance());
                        System.out.print("Enter amount to withdraw:   ");
                        int withdrawAmount = sc.nextInt();
                        chequing.withdraw(withdrawAmount);
                        System.out.printf("Your Chequing balance is now:   $%d%n", chequing.getBalance());
                    
                    } else if (selectAccount == 2) {
                        System.out.println("Your current Savings balance is:   $" + savings.getBalance());
                        System.out.print("Enter amount to deposit:   ");
                        int withdrawAmount = sc.nextInt();
                        savings.withdraw(withdrawAmount);
                        System.out.printf("Your Savings balance is now:   $%d%n", savings.getBalance());
                    }
                    break;


                case 3:
                    System.out.print("Which account do you wish to tranfer funds from; Chequing (1) or Savings (2):   ");
                    selectAccount = sc.nextInt();
                    
                    if(selectAccount == 1){
                        System.out.println("Your current Chequing balance is:   $" + chequing.getBalance());
                        System.out.print("Enter amount to transfer to Savings account:   ");
                        int transferAmount = sc.nextInt();
                        
                        chequing.withdraw(transferAmount);
                        savings.deposit(transferAmount);

                        System.out.println("Your Chequing balance:  " + chequing.getBalance());
                        System.out.println("Your Savings balance:  " + savings.getBalance());

                    } else if (selectAccount == 2){
                        System.out.println("Your current Savings balance is:   $" + savings.getBalance());
                        System.out.print("Enter amount to transfer to Chequing account:   ");
                        int transferAmount = sc.nextInt();
                        
                        savings.withdraw(transferAmount);
                        chequing.deposit(transferAmount);

                        System.out.println("Your Savings balance:  " + savings.getBalance());
                        System.out.println("Your Chequing balance:  " + chequing.getBalance());
                    }

                    break;


                case 4:
                    System.out.println("Your current Chequing balance is:   $" + chequing.getBalance());
                    System.out.println("Your current Savings balance is:   $" + savings.getBalance());
                    break;


                default:
                    sitting = false;
                    break;

            }


            
        }

        System.out.println("Thank you for banking with us! Good day.");
        System.exit(0);
    }


}
