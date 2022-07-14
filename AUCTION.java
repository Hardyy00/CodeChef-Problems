import java.util.Scanner;

class CodeChef {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        int t = cin.nextInt();

        while (t > 0) {

            int a = cin.nextInt();
            int b = cin.nextInt();
            int c = cin.nextInt();

            String ans = a > b && a > c ? "Alice" : (b > a && b > c ? "Bob" : "Charlie");

            System.out.println(ans);
            t--;
        }

        cin.close();
    }
}