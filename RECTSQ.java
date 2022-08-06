import java.util.Scanner;

class CodeChef {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        int t = cin.nextInt();

        while (t > 0) {

            int n = cin.nextInt();
            int m = cin.nextInt();

            int gcd = gcd(n, m);

            long total = (n / gcd) * (m / gcd);

            System.out.println(total);

            t--;
        }

        cin.close();
    }

    public static int gcd(int n, int m) {
        while (n != m) {
            if (n > m) {
                n -= m;
            } else {
                m -= n;
            }
        }
        return n;
    }
}public class RECTSQ {
    
}
