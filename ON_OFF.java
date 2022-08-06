import java.util.Scanner;

class CodeChef{
    
    public static void main(String[] args){
        
        Scanner cin = new Scanner(System.in);
        
        int t = cin.nextInt();
        
        while(t>0){
            
            int n = cin.nextInt();
            cin.nextLine();
            
            String s = cin.nextLine();
            String r = cin.nextLine();
            
            int stateChange = 0;
            
            for(int i=0;i<n;i++){
                if(s.charAt(i) != r.charAt(i))
                    stateChange++ ;
            }
            
            int ans = stateChange % 2 == 0 ? 1 : 0;
            
            System.out.println(ans);
            
            t--;
        }
        cin.close();
    }
}