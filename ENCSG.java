import java.util.Scanner;

class Codechef
{
    public static void main (String[] args) throws Exception
    {
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();

        while(t-->0){

            int n = cin.nextInt();
            cin.nextLine();
            String s = cin.nextLine();
            int iterations = n%2==0 ? n : n-1;
            String newString = "";

            for(int i=0; i<iterations ; i++){

                int ref = i%2==0 ? i+1 : i-1;

                newString += s.charAt(ref);
            }

            if(n%2!=0)
                    newString += s.charAt(n-1);

            String answer = "";

            for (int i = 0; i <n; i++) {

                char value = newString.charAt(i);
                answer += (char)(97 + (122-value));

            }
            
            System.out.println(answer);

        }
        cin.close();
    }
}
