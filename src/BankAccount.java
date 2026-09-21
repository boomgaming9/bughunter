/* Skriv en klasse til at håndtere bankkonti */

void main() {
    Account konto = new Account(1000);
    konto.withdraw(1200);
    konto.deposit(100);
    IO.println(konto.balance);
}

public class Account {
    private double balance = 0;

    public Account (double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) {
        balance -= amount;
    }

    void deposit(double amount) {
        balance += amount;
    }
}