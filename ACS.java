import java.util.Scanner;

class ACS {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        while (t > 0) {
            int num = cin.nextInt();
            int count = num / 100;
            count += num % 100;
            if (count > 10) {
                System.out.println(-1);
            } else {
                System.out.println(count);
            }
            t--;
        }
        cin.close();
    }
}