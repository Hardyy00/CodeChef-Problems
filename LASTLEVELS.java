import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        int t = cin.nextInt();

        while (t > 0) {

            int x = cin.nextInt();
            int y = cin.nextInt();
            int z = cin.nextInt();

            int sum = x * y;

            sum += x > 3 ? (x % 3 != 0 ? (x / 3) * z : ((x / 3) - 1) * z) : 0;

            System.out.println(sum);

            t--;
        }

        cin.close();
    }
}
