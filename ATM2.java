
import java.util.Scanner;

class CodeChef{

    public static void main(String[] args){

        Scanner cin = new Scanner(System.in);

        int t = cin.nextInt();

        while(t-->0){

            int n = cin.nextInt();
            long k = cin.nextLong();

            String ans = "";

            while(n>0){

                long money = cin.nextLong();

                if(money<=k) {
                    ans += "1";
                    k -= money;
                }else
                    ans+="0";


                n--;

            }

            System.out.println(ans);

        }

        cin.close();

    }

}