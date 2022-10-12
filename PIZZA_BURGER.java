
import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();

        while (t-- > 0) {

            int x = cin.nextInt();
            int y = cin.nextInt();
            int z = cin.nextInt();

            String ans = "NOTHING";

            if (y <= x)
                ans = "PIZZA";
            else if (z <= x)
                ans = "BURGER";

            System.out.println(ans);
        }

        cin.close();
    }
}
