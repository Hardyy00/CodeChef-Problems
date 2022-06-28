import java.util.Scanner;
public class  FIT{
    public static void main(String[] args){
        Scanner cin= new Scanner(System.in);
        int t = cin.nextInt();
        while(t>0){
            int num = cin.nextInt();
            System.out.println(2*num*5);
            t--;
        }
        cin.close();
    }
}