
import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();

        while (t-- > 0) {

            int n = cin.nextInt();
            int[] a = new int[n];
            int min = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                int temp = cin.nextInt();
                a[i] = temp;
                if (temp < min && temp != 0)
                    min = temp;
            }

            int foundNumber = 1;

            for (int i = 2; i <= min; i++) {
                boolean areDivisible = true;

                for (int j = 0; j < n; j++) {

                    if (a[j] % i != 0) {
                        areDivisible = false;
                    }
                }

                if (areDivisible) {
                    foundNumber = i;
                }

            }

            for (int i : a) {

                System.out.print(i / foundNumber + " ");

            }

            System.out.println();
        }
        cin.close();
    }
}
