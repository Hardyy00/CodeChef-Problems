
import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {

        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();

        while (t-- > 0) {

            int a = cin.nextInt();
            int b = cin.nextInt();
            int c = cin.nextInt();
            int d = cin.nextInt();
            int e = cin.nextInt();

            String ans = "NO";

            if (((a + b) <= d && c <= e) || (a + c <= d && b <= e) || (b + c <= d && a <= e))
                ans = "YES";

            System.out.println(ans);
        }
        cin.close();
    }
}
