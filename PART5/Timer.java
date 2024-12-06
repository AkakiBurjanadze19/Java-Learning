package PART5;

public class Timer {
    private int seconds;
    private int hundredths;

    public Timer() {
        this.seconds = 0;
        this.hundredths = 0;
    }

    public void advance() {
        this.hundredths++;
        if (this.hundredths > 99) {
            this.hundredths = 0;
            this.seconds++;
            if (this.seconds > 59) {
                this.seconds = 0;
            }
        }
    }

    public String toString() {
        String secondsStr = this.seconds < 10 ? "0" + this.seconds : "" + this.seconds;
        String hundredthsStr = this.hundredths < 10 ? "0" + this.hundredths : "" + this.hundredths;
        return secondsStr + ":" + hundredthsStr;
    }
}
