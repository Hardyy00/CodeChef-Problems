import java.util.Scanner;

class CodeChef {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        int t = cin.nextInt();

        while (t > 0) {

            int n = cin.nextInt();
            double x = cin.nextDouble();
            double y = cin.nextDouble();
            double a = cin.nextDouble();
            double b = cin.nextDouble();

            double petrolAmount = (n / a) * x;
            double dieselAmount = (n / b) * y;

            String ans = "ANY";

            if (petrolAmount < dieselAmount)
                ans = "PETROL";
            else if (dieselAmount < petrolAmount)
                ans = "DIESEL";

            System.out.println(ans);

            t--;
        }
        cin.close();
    }
}