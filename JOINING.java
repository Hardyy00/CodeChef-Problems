import java.util.Scanner;

class CodeChef{

    public static void main(String[] args){

        Scanner cin = new Scanner(System.in);

        int t = cin.nextInt();

        while(t-->0){

            int n = cin.nextInt();
            int k = cin.nextInt();

            int changedDatesStudents = 0;

            if(n<=5){
                // Do nothing
            }else{

                for(int i=k; i<=n; i++){
                    
                    if(i%5 == 0 && i!=n)
                        changedDatesStudents++;
                }

            }
            System.out.println(changedDatesStudents);
        }

        cin.close();
    }
}