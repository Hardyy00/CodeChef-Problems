
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {

        Scanner cin = new Scanner(System.in);

        int t = cin.nextInt();

        while (t-- > 0) {
            int n = cin.nextInt();

            int max = n + 1;

            for (int i = n; i > 0; --i)
                System.out.print(i + " ");

            System.out.println();

        }
        cin.close();
    }
}
