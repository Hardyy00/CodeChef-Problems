import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        while (t > 0) {
            int s = cin.nextInt();
            int x = cin.nextInt();
            int y = cin.nextInt();
            int z = cin.nextInt();

            if (s - x - y >= z) {
                System.out.println(0);
            } else {
                if ((s - x >= z) || (s - y >= z)) {
                    System.out.println(1);
                } else {
                    System.out.println(2);
                }
            }
            t--;
        }
        cin.close();

    }
}