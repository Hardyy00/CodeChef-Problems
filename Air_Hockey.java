import java.util.Scanner;

public class Air_Hockey {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        while (t > 0) {
            int a = cin.nextInt();
            int b = cin.nextInt();
            if (7 - a < 7 - b) {
                System.out.println(7 - a);
            } else {
                System.out.println(7 - b);
            }
            t--;
        }
        cin.close();
    }
}