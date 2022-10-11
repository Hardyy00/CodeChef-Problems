
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {

        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();

        while (t-- > 0) {

            int a = cin.nextInt();
            int b = cin.nextInt();
            int c = cin.nextInt();
            String ans = null;
            boolean foundAny = false;

            if (a > 50) {
                foundAny = true;
                ans = "A";
            } else if (b > 50) {
                foundAny = true;
                ans = "B";
            } else if (c > 50) {
                foundAny = true;
                ans = "C";
            }

            if (foundAny)
                System.out.println(ans);
            else
                System.out.println("NOTA");
        }

        cin.close();

    }
}
