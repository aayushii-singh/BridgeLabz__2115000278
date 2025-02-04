class BankAccount {
    private static String bankName = "ABC Bank";
    private static int totalAccounts = 0;
    private final int accountNumber;
    private String accountHolderName;
    
    public BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }
    
    public static int getTotalAccounts() {
        return totalAccounts;
    }
    
    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank: " + bankName + ", Holder: " + accountHolderName + ", Account: " + accountNumber);
        }
    }
    
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("John", 1001);
        BankAccount acc2 = new BankAccount("Jane", 1002);
        acc1.displayAccountDetails();
        acc2.displayAccountDetails();
        System.out.println("Total Accounts: " + getTotalAccounts());
    }
}
