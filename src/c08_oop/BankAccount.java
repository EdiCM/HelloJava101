package c08_oop;

public class BankAccount {
    private int balance;
    private int card = 345;

    public BankAccount(int balance) {
        this.setBalance(balance);
    }

    public void deposit() {
        card += balance;
        System.out.println("El monto total en su banco es de: " + card + ", se depositaron: " + balance + " pesos.");
    }

    public void setBalance(int balance) {
        if (isValidBalance(balance)) {
            this.balance = balance;
        }
        else {
            System.out.println("El dato no es valido");
        }
    }

    private boolean isValidBalance(int balance) {
        return balance >= 0; // Java 11+
    }
}
