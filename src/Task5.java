import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ssn;
        String mNumber;
        String menu;

        ssn = InputHelper.getRegExString(scan, "Enter your social security number here", "\\d{3}-\\d{2}-\\d{4}");
        System.out.println("Your ssn is; " + ssn);
        mNumber = InputHelper.getRegExString(scan, "Enter your student M number here", "(M|m)\\d{5}");
        System.out.println("Your M number is: " + mNumber);
        System.out.printf("%-6s%-10s%-10s%-10s%-10s", "Menu: ", "O - Open", "S - Save", "V - View", "Q - Quit");
        menu = InputHelper.getRegExString(scan, "", "[OoSsVvQq]");
        menu = menu.toUpperCase();
        System.out.println("You chose: " + menu);
    }
}
