import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = InputHelper.getRangedInt(scan, "Enter your birth year", 1950, 2010);
        int month = InputHelper.getRangedInt(scan, "Enter your birth month", 1, 12);
        int hour = InputHelper.getRangedInt(scan, "Enter your birth hour", 1, 24);
        int minute = InputHelper.getRangedInt(scan, "Enter your birth minute", 1, 59);
        int day;

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            day = InputHelper.getRangedInt(scan, "Enter your birth day", 1, 31);
        } else if (month == 2) {
            day = InputHelper.getRangedInt(scan, "Enter your birth day", 1, 28);
        }
        else {
            day = InputHelper.getRangedInt(scan, "Enter your birth day", 1, 30);
        }
        System.out.printf("\n%-10s%5d", "Year:", year);
        System.out.printf("\n%-10s%5d", "Month:", month);
        System.out.printf("\n%-10s%5d", "Day:", day);
        System.out.printf("\n%-10s%5d", "Hour:", hour);
        System.out.printf("\n%-10s%5d", "Minute:", minute);

    }
}
