import java.util.Scanner;

class codeChef {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        int t = cin.nextInt();
        cin.nextLine();

        while (t-- > 0) {

            String s = cin.nextLine();

            int amber = 0, brass = 0;

            for (int i = 0; i < s.length(); i++) {

                switch (s.charAt(i)) {

                    case 'a':
                        amber++;
                        break;
                    case 'b':
                        brass++;
                        break;
                }
            }

            System.out.println(Math.min(amber, brass));
        }
        cin.close();

    }
}