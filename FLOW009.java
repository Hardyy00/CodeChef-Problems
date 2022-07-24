import java.util.Scanner;

class CodeChef {
    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        int t = cin.nextInt();

        while (t > 0) {

            double quantity = cin.nextDouble();
            double price = cin.nextDouble();
            int discount = 0;

            if (quantity > 1000)
                discount = 10;

            double netPrice = (quantity * price);

            double totalPrice = netPrice - (netPrice * discount) / 100;

            System.out.println(String.format("%.6f", totalPrice));

            t--;
        }

        cin.close();
    }
}