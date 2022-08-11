import java.util.Scanner;

class CodeChef {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        int t = cin.nextInt();

        while (t-- > 0) {

            int n = cin.nextInt();
            int a = cin.nextInt();
            int b = cin.nextInt();

            int countA = 0, countB = 0;

            for (int i = 0; i < n; i++) {

                int value = cin.nextInt();

                if (value == a)
                    countA++;

                if (value == b)
                    countB++;
            }

            double probab = ((double) countA / n) * ((double) countB / n);

            System.out.printf("%.10f", probab);
            System.out.println();
        }
        cin.close();
    }
}