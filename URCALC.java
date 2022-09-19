
import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        int b = cin.nextInt();
        cin.nextLine();
        String s = cin.nextLine();

        switch (s) {

            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println((double) a / b);

        }

        cin.close();
    }
}
