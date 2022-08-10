
import java.util.Scanner;

class codeChef{

    public static void main(String[] args){

        Scanner cin = new Scanner(System.in);

        int t = cin.nextInt();

        while(t-->0){

            long num = cin.nextLong();
            int numberOfFour = 0;
            
            while(num != 0){
                
                if(num % 10 == 4 )
                    numberOfFour++;
                    
                num /= 10;
            }

            System.out.println(numberOfFour);
        }

        cin.close();
    }
}