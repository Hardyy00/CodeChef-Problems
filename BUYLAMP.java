import java.util.Scanner;

class CodeChef{
    
    public static void main(String[] args){
        
        Scanner cin = new Scanner(System.in);
        
        int t = cin.nextInt();
        
        while(t>0){
            
            long n = cin.nextLong();
            int k = cin.nextInt();
            int x = cin.nextInt();
            int y = cin.nextInt();
            
            int min = Math.min(x,y);
            
            long amount = (k*x) + (n-k)*min;
            
            System.out.println(amount);
            
            t--;
        }
        cin.close();
    }
}