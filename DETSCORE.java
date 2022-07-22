import java.util.Scanner;
class Solution{
    public static void main(String[] args){
        Scanner cin =  new Scanner(System.in);
        int t= cin.nextInt();
        
        while(t>0){
            int x = cin.nextInt();
            int n = cin.nextInt();
            
            System.out.println((x/10)*n);
            
            t--;
        }
        
        cin.close();
    }
}