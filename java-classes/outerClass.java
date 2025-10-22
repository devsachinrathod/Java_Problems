import java.util.Scanner;


abstract  interface acountDetails{
    // void showAccountDetails();
    int ACCOUNT = 272632;
    int AMOUNT = 50000;
} 

class ReciverMoneyAccount implements acountDetails{
    // @Override
    public void showAccountDetails(){
        System.out.println("Account number is: " + ACCOUNT);
        System.out.println("Amount in account is: " + AMOUNT);
    }

    void fetchBanlance(){
        System.out.println("Fetch balance using reciver money account");
        System.out.println("Current balance is: " + AMOUNT);
    }

    public static void main(String[] args){
        ReciverMoneyAccount rma = new ReciverMoneyAccount();
        rma.showAccountDetails();
        rma.fetchBanlance();
    }
}

interface senderAccount{
    int acountNumber = 123456;
    String acountHolderName = "Ravi Kumar";
    int balance = 20000;

}
class outerClass extends ReciverMoneyAccount implements senderAccount{

    void senderAccountDetail(){

        System.out.println("Reciver Account detaills :");
        System.out.println();
        System.out.println("Account number is: " + acountNumber);
        System.out.println("Account holder name is: " + acountHolderName);
        System.out.println("Balance in account is: " + balance );
        
    }

     void transferMoneyTo() {
        Scanner scan = new Scanner(System.in);  // create scanner object
System.out.println();
        System.out.print("Please enter amount to pay: ");
        int amount = scan.nextInt();  // read integer input

        System.out.println("You entered amount: " + amount);
            System.out.println("Remaining balance: " + (AMOUNT - amount));
                  if(AMOUNT >= amount){

            System.out.println("Money transferred successfully");
        } else {
            System.out.println("Insufficient balance");
        }
        scan.close(); // optional but good practice
    }
    void fetchReciversBalance(){
        System.out.println("Fetch balance using sender money account");
        System.out.println("Current balance is: " + balance);
    }
  
   
    public static void main(String[] args){
        outerClass sa = new outerClass();
        sa.senderAccountDetail();
        sa.showAccountDetails();
        sa.transferMoneyTo();
        sa.fetchReciversBalance();
    }

}
