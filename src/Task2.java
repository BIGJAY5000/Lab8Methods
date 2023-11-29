import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    int favInt = InputHelper.getInt(scan,"Please enter your favorite Integer");
    double favDouble = InputHelper.getDouble(scan,"Please enter your favorite Double");
        System.out.println("Your favorite Integer is " + favInt + ", and your favorite Double is " + favDouble);
    }
}