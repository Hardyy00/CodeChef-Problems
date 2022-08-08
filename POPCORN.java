import java.util.Scanner;

class CodeChef {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        int t = cin.nextInt();

        while (t-- > 0) {

            long a1 = cin.nextLong();
            long a2 = cin.nextLong();
            long b1 = cin.nextLong();
            long b2 = cin.nextLong();
            long c1 = cin.nextLong();
            long c2 = cin.nextLong();

            long satisfaction1 = a1 + a2;
            long satisfaction2 = b1 + b2;
            long satisfaction3 = c1 + c2;

            long max = Math.max(satisfaction1, satisfaction2);
            max = Math.max(satisfaction3, max);

            System.out.println(max);
        }

        cin.close();
    }
}