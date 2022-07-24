import java.util.*;

class CodeChef{
    public static void main (String[] args) {
        
        Scanner cin = new Scanner(System.in);
        
        int t = cin.nextInt();
        
        while(t>0){
            
            int a = cin.nextInt();
            int b = cin.nextInt();
            
            String ans = (a+b)%2 == 0 ? "Bob" : "Alice";
            
            System.out.println(ans);
            
            t--;
        }
        
        cin.close();
        
    }
}