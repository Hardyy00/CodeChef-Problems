
import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();

        while (t-- > 0) {

            int n = cin.nextInt();
            int[] a = new int[n];
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                a[i] = cin.nextInt();

                if (a[i] > max)
                    max = a[i];
            }

            int[] b = new int[max + 1];
            for (int i = 0; i < n; i++) {
                b[a[i]]++;
            }

            int highestFrequency = -1;
            for (int i = 0; i < max + 1; i++) {

                if (b[i] > highestFrequency)
                    highestFrequency = b[i];
            }

            System.out.println(n - highestFrequency);

        }
        cin.close();
    }
}
