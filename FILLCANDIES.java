import java.util.Scanner;

class CodeChef {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        int t = cin.nextInt();

        while (t > 0) {

            int n = cin.nextInt();
            int k = cin.nextInt();
            int m = cin.nextInt();

            int va = k * m;

            int ans = n % va == 0 ? n / va : (n / va) + 1;

            System.out.println(ans);

            t--;
        }
        cin.close();
    }
}