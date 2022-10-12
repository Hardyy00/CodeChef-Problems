
import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();

        while (t-- > 0) {

            int n = cin.nextInt();
            int v1 = cin.nextInt();
            int v2 = cin.nextInt();

            double stairsTime = (1.414 * n) / v1;
            double elevetorTime = (double) (2 * n) / v2;

            String ans = stairsTime < elevetorTime ? "Stairs" : "Elevator";

            System.out.println(ans);
        }

        cin.close();
    }
}
