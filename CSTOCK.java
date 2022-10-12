
import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();

        while (t-- > 0) {

            int s = cin.nextInt();
            int a = cin.nextInt();
            int b = cin.nextInt();
            int c = cin.nextInt();

            double price = s + ((c / 100.0) * s);

            String ans = price <= b && price >= a ? "Yes" : "No";

            System.out.println(ans);
        }

        cin.close();
    }
}
