
import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();

        while (t-- > 0) {

            int n = cin.nextInt();
            int b = cin.nextInt();

            long maxSize = 0l;
            boolean foundAny = false;

            while (n-- > 0) {

                int w = cin.nextInt();
                int h = cin.nextInt();
                int p = cin.nextInt();

                long size = w * h;

                if (p <= b && maxSize < size) {
                    foundAny = true;
                    maxSize = size;
                }

            }

            if (foundAny)
                System.out.println(maxSize);
            else
                System.out.println("no tablet");
        }

        cin.close();

    }
}
