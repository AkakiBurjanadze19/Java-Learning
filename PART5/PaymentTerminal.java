package PART5;

public class PaymentTerminal {
    private double money;
    private int affordableMeals;
    private int heartyMeals;

    public PaymentTerminal() {
        this(1000, 0, 0);
    }

    public PaymentTerminal(double money, int affordableMeals, int heartyMeals) {
        this.money = money;
        this.affordableMeals = affordableMeals;
        this.heartyMeals = heartyMeals;
    }

    public double eatAffordably(double payment) {
        double mealPrice = 2.50;
        this.money = this.money + mealPrice;
        this.affordableMeals++;
        if (payment >= mealPrice) {
            return payment - mealPrice;
        }
        return payment;
    }

    public double eatHeartily(double payment) {
        double mealPrice = 4.30;
        this.money = this.money + mealPrice;
        this.heartyMeals++;
        if (payment >= mealPrice) {
            return payment - mealPrice;
        }
        return payment;
    }

    public boolean eatAffordably(PaymentCard card) {
        double mealPrice = 2.50;
        return card.takeMoney(mealPrice);
    }

    public boolean eatHeartily(PaymentCard card) {
        double mealPrice = 4.30;
        return card.takeMoney(mealPrice);
    }

    public String toString() {
        return "money: " + this.money + ", number of sold afforable meals: " + this.affordableMeals + ", number of sold hearty meals: " + this.heartyMeals;
    }
}
