import java.util.*;

class CodeChef {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int t = cin.nextInt();

        while (t > 0) {

            int n = cin.nextInt();
            int[] frames = new int[n];
            int noOfFrames = 1;

            for (int i = 0; i < n; i++) {
                int currentValue = cin.nextInt();
                frames[i] = currentValue;

                if (i > 0) {
                    if (currentValue != frames[i - 1])
                        noOfFrames++;
                }
            }

            System.out.println(noOfFrames);

            t--;
        }
        cin.close();
    }
}