
import java.util.*;

class Codechef {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        long n = cin.nextLong();

        int digit = (int) Math.log10((double) n) + 1;

        if (digit >= 1 && digit <= 3)
            System.out.println(digit);
        else
            System.out.println("More than 3 digits");

        cin.close();
    }

}
