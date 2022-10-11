
import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {

        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        while (t-- > 0) {

            int a = cin.nextInt();
            int b = cin.nextInt();
            String ans = "";

            for (int i = 1; true; i++) {

                if (i % 2 != 0)
                    a -= i;
                else
                    b -= i;

                if (a < 0) {
                    ans = "Bob";
                    break;
                } else if (b < 0) {
                    ans = "Limak";
                    break;
                }

            }

            System.out.println(ans);

        }
        cin.close();
    }
}
