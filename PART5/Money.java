package PART5;

public class Money {
    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {
        return new Money(this.euros + addition.euros, this.cents + addition.cents);
    }

    public Money minus(Money decrease) {
        int newEuros = Math.max(this.euros - decrease.euros, 0);
        int newCents = Math.max(this.cents - decrease.cents, 0);

        return new Money(newEuros, newCents);
    }

    public boolean lessThan(Money compared) {
        return this.euros < compared.euros;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + cents + "e";
    }
}
