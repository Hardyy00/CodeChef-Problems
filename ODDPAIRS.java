
import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {

        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();

        while (t-- > 0) {

            int n = cin.nextInt();

            long odd = (n + 1) / 2;
            long even = (n / 2);
            long numbers = 2 * odd * even;

            System.out.println(numbers);
        }

        cin.close();
    }
}
