package PART5;

public class TimerUsage {
    public static void main(String[] args) {
        Timer timer = new Timer();

        while (true) {
            timer.advance();
            System.out.println(timer);
            try {
                Thread.sleep(10);
            } catch (Exception e) {

            }
        }
    }
}
