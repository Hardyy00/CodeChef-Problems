import java.util.Scanner;

class CodeChef {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        int t = cin.nextInt();

        while (t-- > 0) {

            long a = cin.nextLong();
            long b = cin.nextLong();
            long c = cin.nextLong();
            long d = cin.nextLong();

            if (b > a)
                a += c;
            else
                b += c;

            if (b > a)
                a += d;
            else
                b += d;

            char ans = b > a ? 'S' : 'N';

            System.out.println(ans);
        }
        cin.close();
    }

}