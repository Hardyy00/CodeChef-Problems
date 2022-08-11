import java.util.Scanner;

class CodeChef {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        int t = cin.nextInt();

        while (t-- > 0) {

            int x = cin.nextInt();
            int y = cin.nextInt();
            int k = cin.nextInt();

            String ans = "NO";

            if (x % k == 0 && y % k == 0)
                ans = "YES";

            System.out.println(ans);
        }
        cin.close();
    }
}