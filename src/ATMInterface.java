import java.util.Scanner;

class BankAccount{
  static int accountBalance;
}

class  ATMMachine extends BankAccount{
    static int amount;
    public static void withdraw(int amount){
        if(amount>accountBalance){
            System.out.println("Sorry. You do not have enough money in your account to withdraw this amount");
        }
        else{
            accountBalance-=amount;
            System.out.println("Transaction successful! You have withdrawn "+amount+". Your new account balance is $"+accountBalance);
        }
    }
    public static void deposit(int amount){
        if(amount<1){
            System.out.println("No amount has been deposited");
        }
        else{
            accountBalance+=amount;
            System.out.println("Transaction successful! You have deposited "+amount+". Your new account balance is $"+accountBalance);
        }
    }
    public static void checkBalance(){
      System.out.println("Your account balance is: $"+accountBalance);
      }
}

public class ATMInterface extends ATMMachine{
    public static void main(String[] args) {
        int yesno;
        System.out.println("Welcome to your bank account");
        do{
          System.out.println("Kindly select any of the following options to proceed: ");
          System.out.println("1.Deposit");
          System.out.println("2.Withdraw");
          System.out.println("3.Check Balance");
          Scanner sc=new Scanner(System.in);
          while(true){
            int option=sc.nextInt();
            if(option==1){
              System.out.println("Enter the amount you wish to deposit into your account");
              int depositedamount=sc.nextInt();
              deposit(depositedamount);
              break;
            }
            else if(option==2){
              System.out.println("Enter the amount you wish to withdraw into your account");
              int wtihdrawnamount=sc.nextInt();
              withdraw(wtihdrawnamount);
              break;
            }
            else if(option==3){
              checkBalance();
              break;
            }
            else{
              System.out.println("Selected option does not exist. Kindly select from the following options to proceed: ");
              System.out.println("1.Deposit");
              System.out.println("2.Withdraw");
              System.out.println("3.Check Balance");
            }
          }
          System.out.println("Would you like to perofrm another transaction?");
          System.out.println("1.Yes");
          System.out.println("2.No");
          yesno=sc.nextInt();
          if(yesno==2){
            System.out.println("Thank you for banking with us. Have a nice day!");
          }        
        }while(yesno==1);
    }
}
