import java.util.Scanner;

class CodeChef {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        int t = cin.nextInt();

        while (t > 0) {

            int n = cin.nextInt();
            int m = cin.nextInt();

            System.out.println(n * m);

            t--;
        }

        cin.close();
    }
}