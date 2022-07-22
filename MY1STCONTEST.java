import java.util.Scanner;
class Solution{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        
        int n = cin.nextInt();
        int a = cin.nextInt();
        int b = cin.nextInt();
        
        System.out.print((n-a)+ " " + (n-a-b));
    
        cin.close();
    }
    
}