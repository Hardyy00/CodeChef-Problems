import java.util.*;

class CodeChef {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        int t = cin.nextInt();

        while (t > 0) {

            int x = cin.nextInt();
            int y = cin.nextInt();
            int p = cin.nextInt();
            int q = cin.nextInt();

            int chefPenalty = x + p * 10;
            int chefinaPenalty = y + q * 10;

            String ans;

            if (chefinaPenalty < chefPenalty)
                ans = "Chefina";
            else if (chefPenalty < chefinaPenalty)
                ans = "Chef";
            else
                ans = "Draw";

            System.out.println(ans);

            t--;
        }

        cin.close();
    }
}