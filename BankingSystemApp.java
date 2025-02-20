import java.util.*;

class BankingSystem {
    private Map<Integer, Double> accountMap = new HashMap<>();
    private TreeMap<Double, List<Integer>> sortedBalanceMap = new TreeMap<>();
    private Queue<Integer> withdrawalQueue = new LinkedList<>();

    public void addAccount(int accountNumber, double balance) {
        accountMap.put(accountNumber, balance);
        sortedBalanceMap.putIfAbsent(balance, new ArrayList<>());
        sortedBalanceMap.get(balance).add(accountNumber);
    }

    public void deposit(int accountNumber, double amount) {
        if (accountMap.containsKey(accountNumber)) {
            double newBalance = accountMap.get(accountNumber) + amount;
            updateBalance(accountNumber, newBalance);
        }
    }

    public void requestWithdrawal(int accountNumber) {
        if (accountMap.containsKey(accountNumber)) {
            withdrawalQueue.add(accountNumber);
        }
    }

    public void processWithdrawals() {
        while (!withdrawalQueue.isEmpty()) {
            int accountNumber = withdrawalQueue.poll();
            System.out.println("Processing withdrawal for Account: " + accountNumber);
        }
    }

    public void displaySortedBalances() {
        System.out.println("Accounts Sorted by Balance:");
        for (Map.Entry<Double, List<Integer>> entry : sortedBalanceMap.entrySet()) {
            for (int account : entry.getValue()) {
                System.out.println("Account " + account + " -> $" + entry.getKey());
            }
        }
    }

    private void updateBalance(int accountNumber, double newBalance) {
        double oldBalance = accountMap.get(accountNumber);
        sortedBalanceMap.get(oldBalance).remove((Integer) accountNumber);
        if (sortedBalanceMap.get(oldBalance).isEmpty()) {
            sortedBalanceMap.remove(oldBalance);
        }
        accountMap.put(accountNumber, newBalance);
        sortedBalanceMap.putIfAbsent(newBalance, new ArrayList<>());
        sortedBalanceMap.get(newBalance).add(accountNumber);
    }
}

public class BankingSystemApp {
    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();

        bank.addAccount(101, 5000);
        bank.addAccount(102, 3000);
        bank.addAccount(103, 7000);

        System.out.println();
        bank.displaySortedBalances();

        System.out.println();
        bank.deposit(102, 2000);
        bank.displaySortedBalances();

        System.out.println();
        bank.requestWithdrawal(101);
        bank.processWithdrawals();
    }
}
