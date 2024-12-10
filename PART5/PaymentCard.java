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
        if (increase >= 0) {
            this.balance = this.balance + increase;
        }
    }

    public boolean takeMoney(double amount) {
        double balance = this.balance();
        if (balance >= amount) {
            this.balance = this.balance - amount;
            return true;
        } else {
            return false;
        }
    }
}
