import java.util.Scanner;

class CodeChef {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        int t = cin.nextInt();

        while (t > 0) {

            int n = cin.nextInt();
            int k = cin.nextInt();

            String ans = k >= (n + 1) ? "YES" : "NO";

            System.out.println(ans);

            t--;
        }
        cin.close();
    }
}