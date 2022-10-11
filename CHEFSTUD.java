
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {

        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        cin.nextLine();

        while (t-- > 0) {

            String s = cin.nextLine();

            int count = 0;
            int length = s.length();

            for (int i = 0; i < length - 1; i++) {

                if (s.charAt(i) == '<' && s.charAt(i + 1) == '>')
                    count++;
            }

            System.out.println(count);
        }

        cin.close();
    }
}
