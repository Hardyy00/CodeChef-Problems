import java.util.Scanner;

class CBSPEED{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        
        int x = cin.nextInt();
        int y = cin.nextInt();
        
        String answer = (y<=x) ? "NO" : "YES" ;
        
        System.out.println(answer);
        cin.close();
    }
}