import java.util.Scanner;

public class Burgers {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        while (t > 0) {
            int a = cin.nextInt();
            int b = cin.nextInt();

            if (a < b) {
                System.out.println(a);
            } else {
                System.out.println(b);
            }
            t--;
        }
        cin.close();
    }
}
