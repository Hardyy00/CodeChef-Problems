import java.util.Scanner;

class CodeChef {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        int t = cin.nextInt();

        while (t > 0) {

            int a = cin.nextInt();
            int b = cin.nextInt();
            int c = cin.nextInt();
            int d = cin.nextInt();

            int max1 = a > b ? a : b;
            int max2 = c > d ? c : d;

            System.out.println(max2 + max1);

            t--;
        }
        cin.close();
    }
}