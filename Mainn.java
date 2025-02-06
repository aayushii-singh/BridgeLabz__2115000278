class Bank {
    private String name;

    public Bank(String name) {
        this.name = name;
    }

    public void openAccount(Customer customer, double balance) {
        customer.setAccount(new Account(this, customer, balance));
    }

    public String getName() {
        return name;
    }
}

class Customer {
    private String name;
    private Account account;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void viewBalance() {
        if (account != null) {
            account.display();
        } else {
            System.out.println(name + " has no account.");
        }
    }
}

class Account {
    private Bank bank;
    private Customer customer;
    private double balance;

    public Account(Bank bank, Customer customer, double balance) {
        this.bank = bank;
        this.customer = customer;
        this.balance = balance;
    }

    public void display() {
        System.out.println("Bank: " + bank.getName() + ", Customer: " + customer.getName() + ", Balance: " + balance);
    }
}

public class Mainn {
    public static void main(String[] args) {
        Bank bank1 = new Bank("Bank1");
        Bank bank2 = new Bank("Bank2");

        Customer cust1 = new Customer("Ayu");
        Customer cust2 = new Customer("Dev");

        bank1.openAccount(cust1, 5000);
        bank2.openAccount(cust2, 3000);

        cust1.viewBalance();
        cust2.viewBalance();
    }
}
