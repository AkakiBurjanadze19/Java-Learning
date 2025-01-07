package PART5;

public class SimpleDate {
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof SimpleDate)) {
            return false;
        }

        SimpleDate comparedSimpleDate = (SimpleDate) compared;

        boolean dayEqual = this.day == comparedSimpleDate.day;
        boolean monthEqual = this.month == comparedSimpleDate.month;
        boolean yearEqual = this.year == comparedSimpleDate.year;

        return dayEqual && monthEqual && yearEqual;
    }

    public boolean before(SimpleDate compared) {
        // compare years
        if (this.year < compared.year) {
            return true;
        }

        // if years are the same, compare months
        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        // if years and months are the same, compare days
        if (this.year == compared.year && this.month == compared.month && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance() {
        if (this.day == 30 && this.month == 12) {
            this.day = 1;
            this.month = 1;
            this.year = this.year + 1;
        } else if (this.day == 30) {
            this.month = this.month + 1;
            this.day = 1;
        } else {
            this.day = this.day + 1;
        }
    }

    public void advance(int howManyDays) {
        for (int i = 0; i < howManyDays; i++) {
            this.advance();
        }
    }

    public SimpleDate afterNumberOfDays(int days) {
        this.advance(days);

        return new SimpleDate(this.day, this.month, this.year);
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }
}
