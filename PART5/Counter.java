package PART5;

public class Counter {
    private int value;

    public Counter() {
        this.value = 0;
    }

    public Counter(int startValue) {
        this.value = startValue;
    }

    public void increase() {
        this.increase(1);
    }

    public void decrease() {
        this.decrease(1);
    }

    public void increase(int increaseBy) {
        if (increaseBy >= 0) {
            this.value = this.value + increaseBy;
        }
    }

    public void decrease(int decreaseBy) {
        if (decreaseBy >= 0) {
            this.value = this.value - decreaseBy;
        }
    }

    public int value() {
        return this.value;
    }
}
