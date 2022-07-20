import java.util.Scanner;

class PRIZEPOOL {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int t = cin.nextInt();

        while (t > 0) {
            long x = cin.nextLong();
            long y = cin.nextLong();

            System.out.println((x * 10) + (y * 90));
            t--;
        }

        cin.close();
    }
}