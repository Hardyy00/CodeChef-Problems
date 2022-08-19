import java.util.Scanner;

class CodeChef{

    public static void main(String[] args){

        Scanner cin = new Scanner(System.in);

        int t = cin.nextInt();

        while(t-->0){
            cin.nextLine();

            int a = cin.nextInt();
            int b = cin.nextInt();

            int language = 0;
            int count = 0;

            for(int i=1;i<=4;i++){
                int value = cin.nextInt();

                if(i==1){
                    language = 1;


                }else if(i==3){
                    language = 2;
                    count =0;
                }

                if( (value == a) || (value == b)){
                    count++;
                }


                if(count == 2)
                    break;

            }

            int lang  = count >= 2 ? language : 0;

            System.out.println(lang);

        }

        cin.close();
    }
}