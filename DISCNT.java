import java.util.Scanner;

class CodeChef {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        int t = cin.nextInt();

        while (t > 0) {

            int x = cin.nextInt();

            System.out.println(100 - x);

            t--;
        }

        cin.close();
    }
}