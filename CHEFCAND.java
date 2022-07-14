import java.util.Scanner;

class CodeChef{
    
    public static void main(String[] args){
        
        Scanner cin = new Scanner(System.in);
        
        int t = cin.nextInt();
        
        while(t>0){
            
            int n = cin.nextInt();
            int x = cin.nextInt();
            
            int a = n-x;
            
            int ans = a<=0 ? 0 : (a % 4 ==0 ? a/4 : (a/4) + 1 );
            
            System.out.println(ans);
            t--;
        }
        
        cin.close();
    }
}