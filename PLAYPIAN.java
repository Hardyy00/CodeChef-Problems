import java.util.Scanner;

class CodeChef{

    public static void main(String[] args){

        Scanner cin = new Scanner(System.in);

        int t = cin.nextInt();
        cin.nextLine();
       

        while(t-->0){

            String s = cin.nextLine();
            String ans = "yes";
            int length = s.length();

            if(length % 2 != 0)
                ans = "no";
            else{

                for(int i=0;i<length-1;i++){

                    if(s.charAt(i)=='A'){

                        if(s.charAt(i+1) != 'B'){
                            ans = "no";
                            break;
                        }

                    } else if(s.charAt(i) == 'B'){

                        if(s.charAt(i+1) != 'A'){
                            ans = "no";
                            break;
                        }
                    }
                    
                    i++;

                }
            }
            System.out.println(ans);

        }
        cin.close();
    }
}