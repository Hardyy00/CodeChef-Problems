import java.util.Scanner;

class CodeChef {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        int t = cin.nextInt();

        while (t-- > 0) {

            long a = cin.nextLong();
            long b = cin.nextLong();

            long sum = a + b;
            int sticks = 0;

            while (sum != 0) {
                sticks += getSticks((int) sum % 10);
                sum /= 10;
            }

            System.out.println(sticks);
        }
        cin.close();

    }

    public static int getSticks(int num) {

        switch (num) {

            case 0:
                return 6;
            case 1:
                return 2;
            case 2:
                return 5;
            case 3:
                return 5;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 3;
            case 8:
                return 7;
            case 9:
                return 6;
        }

        return 0;
    }
}