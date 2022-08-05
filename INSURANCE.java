import java.util.Scanner;

class CodeChef{
    
    public static void main(String[] args){
        
        Scanner cin =  new Scanner(System.in);
        
        int t= cin.nextInt();
        
        while(t>0){
            
            int x = cin.nextInt();
            int y = cin.nextInt();
            
            int ans = y<=x ? y : x ;
            
            System.out.println(ans);
            
            t--;
        }
        cin.close();
    }
}