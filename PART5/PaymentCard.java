package PART5;

public class PaymentCard {
    public double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }

    public void addMoney(double increase) {
        this.balance = this.balance + increase;
    }

    public boolean takeMoney(double amount) {
        if (this.balance >= amount) {
            this.balance = this.balance - amount;
            return true;
        } else {
            return false;
        }
    }
}
