
import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {

        Scanner cin = new Scanner(System.in);

        int t = cin.nextInt();

        while (t > 0) {

            int x1 = cin.nextInt();
            int y1 = cin.nextInt();
            int x2 = cin.nextInt();
            int y2 = cin.nextInt();

            int p1 = x1 + y1;
            int p2 = x2 + y2;

            int ans = p1 < p2 ? p1 : p2;

            System.out.println(ans);

            t--;
        }

        cin.close();
    }
}
