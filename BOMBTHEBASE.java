import java.util.Scanner;

class CodeChef {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        int t = cin.nextInt();

        while (t-- > 0) {

            int n = cin.nextInt();
            long x = cin.nextLong();

            int pos = 0;
            for (int i = 0; i < n; i++) {

                long strength = cin.nextLong();

                if (strength < x)
                    pos = i + 1;
            }

            System.out.println(pos);
        }

        cin.close();
    }
}