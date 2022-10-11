
import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();

        while (t-- > 0) {

            int n = cin.nextInt();

            int countOdd = 0;

            while (n-- > 0) {

                if (cin.nextInt() % 2 != 0)
                    countOdd++;
            }

            String ans = "NO";
            if (countOdd % 2 != 0)
                ans = "YES";

            System.out.println(ans);
        }
        cin.close();
    }
}
