import java.util.Scanner;

class CodeChef {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        int t = cin.nextInt();

        while (t-- > 0) {

            int n = cin.nextInt();
            long[] time = new long[n + 1];
            long previousValue = 0;

            time[0] = previousValue;

            for (int i = 1; i <= n; i++) {

                long currentValue = cin.nextLong();
                time[i] = Math.abs(currentValue - previousValue);

                previousValue = currentValue;

            }
            int valid = 0;

            for (int i = 1; i <= n; i++) {

                long currentValue = cin.nextLong();

                if (currentValue <= time[i])
                    valid++;

            }

            System.out.println(valid);

        }
        cin.close();
    }
}