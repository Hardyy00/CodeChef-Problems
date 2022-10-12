
import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();

        while (t-- > 0) {

            int n = cin.nextInt();
            int a = cin.nextInt();

            System.out.println(Math.min(n - a, a));
        }

        cin.close();
    }
}
