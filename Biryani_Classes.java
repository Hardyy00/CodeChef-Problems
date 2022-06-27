import java.util.Scanner;
public class Biryani_Classes{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        while(t>0){

            int x = cin.nextInt();
            int y = cin.nextInt();
            System.out.println(x*y);

            t--;
        }

        cin.close();
    }
}