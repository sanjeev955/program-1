public class Bank_Transaction {
    String accountName;
    String accountHolderName;
    String accountType;
    long accountNumber;
    double balance;

    public Bank_Transaction(String accountName, String accountHolderName, String accountType, long accountNumber, double balance) {
        this.accountName = accountName;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayTransactionInfo() {
        System.out.println("Account Name: " + accountName);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

public class BankSystem {
    public static void main(String[] args) {
        // Creating objects for both classes
        Bank_Customer customer = new Bank_Customer("Sanjeev", 101, "Hubballi, India");
        Bank_Transaction transaction = new Bank_Transaction("Canara Bank", "Sanjeev", "Savings", 1234567890L, 50000.00);

        // Display details
        customer.displayCustomerInfo();
        transaction.displayTransactionInfo();
    }
}

