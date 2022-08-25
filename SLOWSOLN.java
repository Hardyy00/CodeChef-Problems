
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner cin = new Scanner(System.in);

        int t = cin.nextInt();

        while (t-- > 0) {

            int maxT = cin.nextInt();
            int maxN = cin.nextInt();
            int sumN = cin.nextInt();

            long ans = 0L;

            while (maxT != 0 && sumN != 0) {
                int min = Math.min(maxN, sumN);
                ans += (min * min);

                sumN -= min;
                maxT--;
            }

            System.out.println(ans);
        }
        cin.close();
    }
}
