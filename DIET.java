import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        

        while (t-->0) {
            
            cin.nextLine();

            int n = cin.nextInt();
            int k = cin.nextInt();
            int sum = 0;
            boolean willFullill = true;

            for (int i = 1; i <= n; i++) {

                int temp = cin.nextInt();

                sum += temp;
                sum -= k;
                if (sum < 0) {
                    willFullill = false;
                    System.out.println("NO " + i);
                    break;
                }

            }

            if (willFullill) {
                System.out.println("YES");

            }

           
        }

        cin.close();

    }
}
