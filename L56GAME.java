import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();

        while (t-- > 0) {

            int n = cin.nextInt();
            int evenCount = 0;
            int oddCount = 0;
            for (int i = 0; i < n; i++) {

                int temp = cin.nextInt();

                if (temp % 2 == 0)
                    evenCount++;
                else
                    oddCount++;
            }

            int extractedEven = evenCount % 2;
            int extractedOdd = oddCount % 2;

            int elements = (evenCount / 2 > 0 || oddCount / 2 > 0) ? 1 : 0;
            elements = (elements > 0 || extractedEven > 0) ? 1 : 0;
            elements += extractedOdd;

            System.out.println(elements);
        }
        cin.close();
    }
}
