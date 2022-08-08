import java.util.Scanner;

class CodeChef {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        int t = cin.nextInt();

        while (t-- > 0) {

            long a = cin.nextInt();
            long b = cin.nextInt();
            long c = cin.nextInt();

            long max = Math.max(a, b);
            max = Math.max(max, c);

            String ans = max == (a + b + c - max) ? "YES" : "NO";

            System.out.println(ans);
        }
        cin.close();
    }
}