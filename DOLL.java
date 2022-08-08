import java.util.Scanner;

class CodeChef {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        int t = cin.nextInt();

        while (t-- > 0) {

            int n = cin.nextInt();
            long k = cin.nextLong();

            int playersToShot = 0;

            for (int i = 0; i < n; i++) {

                long playerHeight = cin.nextLong();

                if (playerHeight > k)
                    playersToShot++;
            }

            System.out.println(playersToShot);
        }
        cin.close();
    }
}