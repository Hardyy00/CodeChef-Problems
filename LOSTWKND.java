
import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();

        while (t-- > 0) {

            int[] a = new int[5];
            int p = 0;
            int sum = 0;

            for (int i = 0; i < 5; i++) {
                a[i] = cin.nextInt();
                sum += a[i];
            }

            p = cin.nextInt();
            sum *= p;
            int targetHours = 5 * 24;

            String ans = sum <= targetHours ? "No" : "Yes";

            System.out.println(ans);

        }
        cin.close();
    }
}
