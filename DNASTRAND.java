import java.util.Scanner;

class DNASTRAND {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();

        while (t > 0) {
            int n = cin.nextInt();
            String s = cin.next();
            String st = "";
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == 'A') {
                    st += "T";
                } else if (s.charAt(i) == 'T') {
                    st += "A";
                } else if (s.charAt(i) == 'C') {
                    st += "G";
                } else if (s.charAt(i) == 'G') {
                    st += "C";
                }
            }
            System.out.println(st);
            t--;
        }
        cin.close();
    }
}