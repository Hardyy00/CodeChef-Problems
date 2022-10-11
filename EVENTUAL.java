
import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {

        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();

        while (t-- > 0) {
            int n = cin.nextInt();
            cin.nextLine();
            String s = cin.nextLine();

            if (n % 2 == 0) {
                boolean canBeDeleted = true;

                for (int i = 0; i < n; i++) {
                    int count = 0;
                    char main = s.charAt(i);
                    for (int j = 0; j < n; j++) {

                        if (s.charAt(j) == main) {
                            count++;
                        }
                    }

                    if (count % 2 != 0) {
                        canBeDeleted = false;
                        System.out.println("NO");
                        break;
                    }
                }

                if (canBeDeleted) {
                    System.out.println("YES");
                }

            } else {
                System.out.println("NO");
            }

        }
        cin.close();
    }
}
