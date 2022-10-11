
import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();

        while (t-- > 0) {

            int n = cin.nextInt();
            cin.nextLine();

            String s = cin.nextLine();

            int countPresent = 0;
            for (int i = 0; i < n; i++) {

                if (s.charAt(i) == '1')
                    countPresent++;
            }

            String ans = "NO";

            double presentDays = countPresent + 120 - n;
            if (presentDays / 120 >= 0.75d)
                ans = "YES";

            System.out.println(ans);
        }

        cin.close();
    }
}
