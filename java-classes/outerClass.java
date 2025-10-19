
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

class SenderAccount extends ReciverMoneyAccount{
    void transferMoney(){
        int transferAmount = 2000;
        System.out.println("Transfer money using sender account");
        if(AMOUNT >= transferAmount){
            System.out.println("Remaining balance: " + (AMOUNT - transferAmount));
            System.out.println("Money transferred successfully");
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public static void main(String[] args){
        SenderAccount sa = new SenderAccount();
        sa.showAccountDetails();
        sa.transferMoney();
    }

}
