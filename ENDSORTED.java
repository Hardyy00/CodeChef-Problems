import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();

        while (t-- > 0) {

            int n = cin.nextInt();
            int[] a = new int[n];
            int p1 = -1;
            int pn = -1;
            ;
            for (int i = 0; i < n; i++) {

                int temp = cin.nextInt();
                a[i] = temp;
                if (temp == 1)
                    p1 = i;
                if (temp == n)
                    pn = i;
            }

            int swap1 = p1;
            int swap2 = (n - 1) - pn + (pn < p1 ? -1 : 0);

            System.out.println(swap1 + swap2);

        }
        cin.close();
    }
}
