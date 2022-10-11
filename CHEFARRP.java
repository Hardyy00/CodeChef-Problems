
import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();

        while (t-- > 0) {

            int n = cin.nextInt();

            int[] a = new int[n];

            for (int i = 0; i < n; i++)
                a[i] = cin.nextInt();

            int count = 0;
            for (int i = 0; i < n; i++) {
                int sum = 0;
                int prod = 1;
                for (int j = i; j < n; j++) {

                    sum += a[j];
                    prod *= a[j];

                    if (sum == prod)
                        count++;
                }
            }

            System.out.println(count);
        }

        cin.close();
    }
}
