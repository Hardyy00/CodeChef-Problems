import java.util.Scanner;

class CodeChef{
    
    public static void main(String[] args){
        
        Scanner cin = new Scanner(System.in);
        
        int t = cin.nextInt();
        
        while(t-->0){
            
            int a = cin.nextInt();
            int b = cin.nextInt();
            
            int count = 0;
            
            while(a%3 !=0 && b%3 !=0){
                
                int copy = a;
                a = Math.abs(a-b);
                b = Math.abs(copy - b);
                
                count++;
                
            }
            System.out.println(count);
        }
        cin.close();
    }
}