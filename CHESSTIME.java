import java.util.Scanner;

class CodeChef {
    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        int t = cin.nextInt();

        while (t > 0) {

            int n = cin.nextInt();

            System.out.println((n * 60) / 20);

            t--;
        }

        cin.close();
    }
}