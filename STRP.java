
import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();

        while (t-- > 0) {

            int n = cin.nextInt();
            cin.nextLine();

            String s = cin.nextLine();

            int count = 0;
            int i = 0;
            while (i < n) {

                char currentChar = s.charAt(i);

                if (i < n - 1) {
                    if (currentChar == s.charAt(i + 1)) {
                        i += 2;
                        count++;
                        continue;
                    }
                }

                i++;
                count++;

            }

            System.out.println(count);
        }
        cin.close();
    }
}
