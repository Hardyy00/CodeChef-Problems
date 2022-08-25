import java.util.Scanner;

class CodeChef {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        long r = cin.nextLong();

        int scholarship = 0;

        if (r < 51)
            scholarship = 100;
        else if (r < 101)
            scholarship = 50;

        System.out.println(scholarship);

        cin.close();
    }
}