import java.util.Scanner;

class CodeChef {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        int t = cin.nextInt();

        while (t > 0) {

            int a = cin.nextInt();
            int b = cin.nextInt();
            int c = cin.nextInt();

            int sum = a + b + c;

            String ans = a >= 10 && b >= 10 && c >= 10 && sum >= 100 ? "PASS" : "FAIL";

            System.out.println(ans);

            t--;
        }

        cin.close();
    }
}