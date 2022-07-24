/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int t = cin.nextInt();

        while (t > 0) {

            int g = cin.nextInt();
            int c = cin.nextInt();

            int h = (c * c) / (2 * g);

            System.out.println(h);

            t--;
        }

        cin.close();

    }
}
