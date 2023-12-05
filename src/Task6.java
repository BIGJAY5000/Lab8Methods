import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

    }
     public static void prettyHeader(String msg){
        String x = "";
        int y = msg.length();
        int z = (54 - y)/2;
        int a = 0;
        for (int i = 0; i <= 60; i++) {
            x += "*";
        }
        System.out.println(x);
        x = "";

        for (int j = 0; j <=60; j++) {
            if (j < 3 || j > 57) {
                x += "*";
            } else if (j > z+3 && j < 57-z) {
                x += (msg.substring(a, a + 1));
                a++;
            }
            else {
                x += " ";
            }
        }
        System.out.println(x);

        x = "";
        for (int k = 0; k <= 60; k++) {
            x += "*";
        }
        System.out.println(x);
    }
}
