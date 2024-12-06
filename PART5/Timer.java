package PART5;

public class Timer {
    private int seconds;
    private int hundredths;

    public Timer() {
        this.seconds = 0;
        this.hundredths = 0;
    }

    public void advance() {
        hundredths++;
        if (hundredths > 99) {
            hundredths = 0;
            seconds++;
            if (seconds > 59) {
                seconds = 0;
            }
        }
    }

    public String toString() {
        String secondsStr = seconds < 10 ? "0" + seconds : "" + seconds;
        String hundredthsStr = hundredths < 10 ? "0" + hundredths : "" + hundredths;
        return secondsStr + ":" + hundredthsStr;
    }
}
