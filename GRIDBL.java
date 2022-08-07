import java.util.Scanner;

class CodeChef{
    
    public static void main(String[] args){
        
        Scanner cin = new Scanner(System.in);
        
        int t = cin.nextInt();
        
        while(t-->0){
            
            int n = cin.nextInt();
            int m = cin.nextInt();
            
            if(!(n>=2 && m>=2)){
                
               System.out.println(n*m); 
            } else{
                
                int titles = ((n%2)*m) + ((m%2)*n) - 1;
                
                if(n%2 == 0 && m%2 != 0){
                    titles = (m%2)*n;
                }else if(m%2 == 0 && n%2 != 0){
                    titles = (n%2)*m;
                }else if(m%2==0 && n%2==0){
                    titles+=1;
                }
                
                System.out.println(titles);
            }
        }
        cin.close();
    }
}