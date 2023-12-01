import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
            double sum = 0;
            double itemPrice = 0;
            boolean done = false;
            boolean YN = false;


        do {
            itemPrice = InputHelper.getRangedDouble(scan, "Please enter the price of your item",0.0,10.0);
            sum += itemPrice;
            YN = InputHelper.getYNConfirm(scan,"Do you want to continue Y/N");
            if (!YN) {
                done = true;
            }
        } while (!done);

        System.out.println("Your total price is: " + sum);




    }
}
