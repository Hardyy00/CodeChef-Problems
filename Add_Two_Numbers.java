import java.util.Scanner;

public class Add_Two_Numbers {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();

        while (t > 0) {
            int a = cin.nextInt();
            int b = cin.nextInt();

            System.out.println(a + b);
            t--;
        }
        cin.close();
    }
}