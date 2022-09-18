
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {

        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();

        while (t-- > 0) {

            int n = cin.nextInt();
            long m = cin.nextInt();

            long maxDistance = 0;
            while (n-- > 0l) {
                long temp = cin.nextInt();
                long var1 = Math.abs(temp - 1);
                long var2 = Math.abs(temp - m);

                maxDistance += var1 >= var2 ? var1 : var2;

            }

            System.out.println(maxDistance);
        }

        cin.close();
    }
}
