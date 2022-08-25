import java.util.Scanner;
import java.util.Arrays;

class CodeChef {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        int t = cin.nextInt();

        while (t-- > 0) {
            cin.nextLine();

            int n = cin.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = cin.nextInt();
            }

            Arrays.sort(arr);

            int previous = 0;

            for (int i = 0; i < n; i++) {

                if (i % 2 == 0) {
                    previous = arr[i];
                } else {
                    if (previous != arr[i]) {
                        System.out.println(previous);
                        break;
                    }
                }

                if (i == n - 1)
                    System.out.println(previous);

            }

        }
        cin.close();
    }
}