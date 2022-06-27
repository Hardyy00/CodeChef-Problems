import java.util.Scanner;
public class Age_Limit{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        while(t>0){
            int x = cin.nextInt();
            int y = cin.nextInt();
            int a = cin.nextInt();
            if(a>=x && a<y){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            t--;
        }
        cin.close();
    }
}