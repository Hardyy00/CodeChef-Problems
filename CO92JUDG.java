import java.util.Scanner;

class CodeChef {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        int t = cin.nextInt();

        while (t-- > 0) {

            int n = cin.nextInt();

            int aliceTime = 0;
            int maxAliceTime = 0;
            int bobTime = 0;
            int maxBobTime = 0;

            for (int i = 0; i < n; i++) {

                int value = cin.nextInt();
                aliceTime += value;

                maxAliceTime = Math.max(value, maxAliceTime);
            }

            aliceTime -= maxAliceTime;

            for (int i = 0; i < n; i++) {

                int value = cin.nextInt();
                bobTime += value;

                maxBobTime = Math.max(value, maxBobTime);
            }

            bobTime -= maxBobTime;

            String ans = "Draw";

            if (aliceTime < bobTime)
                ans = "Alice";
            else if (bobTime < aliceTime)
                ans = "Bob";

            System.out.println(ans);

        }
        cin.close();
    }
}