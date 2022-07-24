import java.util.Scanner;

class CodeChef{
    public static void main(String[] args){
        
        Scanner cin = new Scanner(System.in);
        
        int l = cin.nextInt();
        int b = cin.nextInt();
        
        int area = l*b;
        int peri = 2*(l+b);
        
        if(area > peri){
           
            System.out.println("Area");
            System.out.println(area);
        
            
        }else if(peri > area){
           
            System.out.println("Peri");
            System.out.println(peri);
        
            
        }else{
          
            System.out.println("Eq");
            System.out.println(area);
        }
        
        cin.close();
    }
}