package PART5;

public class SimpleDateUsage {
    public static void main(String[] args) {
//        SimpleDate date1 = new SimpleDate(1, 12, 2024);
//
//        date1.advance();
//        date1.advance(29);
//
//        date1.advance(6);
//
//        System.out.println(date1);

        SimpleDate date2 = new SimpleDate(13, 2, 2015);
        System.out.println("Friday of the examined week is " + date2);

        SimpleDate newDate = date2.afterNumberOfDays(7);
        int week = 1;
        while (week <= 7) {
            System.out.println("Friday after " + week + " weeks is " + newDate);
            newDate = newDate.afterNumberOfDays(7);

            week = week + 1;
        }


        System.out.println("The date after 790 days from the examined Friday is...");
            System.out.println(date2.afterNumberOfDays(790));
    }
}
