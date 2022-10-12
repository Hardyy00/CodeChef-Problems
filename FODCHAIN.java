
import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();

        while (t-- > 0) {

            int e = cin.nextInt();
            int k = cin.nextInt();

            int level = 0;
            while (e != 0) {
                e /= k;
                level++;
            }

            System.out.println(level);
        }

        cin.close();
    }
}
