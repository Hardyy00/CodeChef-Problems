
import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();

        while (t-- > 0) {

            int m = cin.nextInt();
            int n = cin.nextInt();

            for (int i = m; i <= n; i++) {

                if (isPrime(i))
                    System.out.println(i);
            }

            if (t != 0)
                System.out.println();
        }

        cin.close();
    }

    private static boolean isPrime(int n) {

        if (n == 1)
            return false;

        int i = 2;
        int comp = (int) Math.sqrt(n);

        while (i <= comp) {
            if (n % i == 0)
                return false;

            i++;
        }

        return true;
    }
}
