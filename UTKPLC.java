import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner cin = new Scanner(System.in);

        int t = cin.nextInt();

        while (t > 0) {

            ArrayList<Integer> pref = new ArrayList<>();
            for (int i = 0; i < 3; i++)
                pref.add((int) cin.next().charAt(0));

            int x = cin.next().charAt(0);
            int y = cin.next().charAt(0);

            char ans = (char) ((pref.indexOf(x) < pref.indexOf(y)) ? x : y);

            System.out.println(ans);

            t--;
        }

        cin.close();
    }
}
