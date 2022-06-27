import java.util.Scanner;
public class How_Many_Unattempted_problems{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int x = cin.nextInt();
        int y= cin.nextInt();

        System.out.println(x-y);
        cin.close();
    }
}