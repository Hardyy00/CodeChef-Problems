
import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();

        while (t-- > 0) {

            int n = cin.nextInt();

            int max = Integer.MIN_VALUE;

            int[] a = new int[n];

            for (int i = 0; i < n; i++) {

                int temp = cin.nextInt();
                a[i] = temp;

                if (temp > max)
                    max = temp;
            }

            int[] b = new int[max + 1];
            for (int i = 0; i < n; i++) {
                b[a[i]]++;
            }

            int count = 0;
            for (int i = 0; i < max + 1; i++) {
                if (b[i] > 0)
                    count++;
            }

            System.out.println(count);
        }
        cin.close();
    }
}
