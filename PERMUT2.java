import java.util.*;

class CodeChef {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        while (true) {

            int n = cin.nextInt();

            if (n == 0)
                break;

            int[] arr1 = new int[n];
            int[] arr2 = new int[n];

            for (int i = 0; i < n; i++) {
                int num = cin.nextInt();

                arr1[i] = num;
                arr2[num - 1] = i + 1;
            }

            if (Arrays.toString(arr1).compareTo(Arrays.toString(arr2)) == 0) {
                System.out.println("ambiguous");
            } else {
                System.out.println("not ambiguous");
            }

        }

        cin.close();
    }
}