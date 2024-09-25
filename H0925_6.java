class BankAccount {
    private int balance = 0;

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public int getBalance() {
        return balance;
    }
}

class Customer {
    private BankAccount account;

    public Customer(BankAccount account) {
        this.account = account;
    }

    public void makeDeposit(int amount) {
        account.deposit(amount);
    }

    public void makeWithdrawal(int amount) {
        account.withdraw(amount);
    }
}

public class H0925_6 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        Customer customer = new Customer(account);

        customer.makeDeposit(1000);
        customer.makeWithdrawal(500);
        System.out.println("Balance: " + account.getBalance());
    }
}