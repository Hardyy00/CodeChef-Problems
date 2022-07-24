import java.util.Scanner;

class CodeChef {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        int t = cin.nextInt();

        while (t > 0) {
            long n = cin.nextLong();

            long y = 0;
            long z = n - (7 * y);
            String ans = "NO";
            while (z >= 0) {

                if (z % 2 == 0) {
                    ans = "YES";
                    break;
                }
                y++;

                z = n - (7 * y);
            }

            System.out.println(ans);
            t--;
        }

        cin.close();
    }
}