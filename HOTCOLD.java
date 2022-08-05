import java.util.Scanner;

class CodeChef {
    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        int t = cin.nextInt();

        while (t > 0) {

            int temp = cin.nextInt();

            String ans = temp > 20 ? "HOT" : "COLD";

            System.out.println(ans);

            t--;
        }

        cin.close();
    }
}