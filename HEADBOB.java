
import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();

        while (t-- > 0) {

            int n = cin.nextInt();

            cin.nextLine();

            String s = cin.nextLine();

            String ans = "NOT SURE";

            for (int i = 0; i < n; i++) {

                char currentValue = s.charAt(i);
                if (currentValue != 'N') {

                    if (currentValue == 'I')
                        ans = "INDIAN";
                    else
                        ans = "NOT INDIAN";

                    break;
                }
            }

            System.out.println(ans);
        }

        cin.close();
    }
}
