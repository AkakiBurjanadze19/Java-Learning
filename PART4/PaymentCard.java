package PART4;

public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public void eatAffordably() {
        boolean validBalance = this.balance >= 2.60;
        if (validBalance) {
            this.balance -= 2.60;
        }
    }

    public void eatHeartily() {
        boolean validBalance = this.balance >= 4.60;
        if (validBalance) {
            this.balance -= 4.60;
        }
    }

    public void addMoney(double amount) {
        boolean negativeAmount = amount < 0;
        if (this.balance < 150 && !negativeAmount) {
            this.balance += amount;
            if (this.balance > 150) {
                double more = this.balance - 150;
                this.balance -= more;
            }
        }
    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }
}
