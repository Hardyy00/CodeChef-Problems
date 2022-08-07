import java.util.Scanner;

class CodeChef {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        int t = cin.nextInt();
        cin.nextLine();

        while (t > 0) {

            int barcelonaGoals = 0;
            int malagaGoals = 0;
            int realmadridGoals = 0;
            int eibarGoals = 0;

            for (int i = 0; i < 4; i++) {

                String team = cin.next();

                int goals = cin.nextInt();

                if (team.equals("Barcelona"))
                    barcelonaGoals = goals;
                else if (team.equals("Malaga"))
                    malagaGoals = goals;
                else if (team.equals("RealMadrid"))
                    realmadridGoals = goals;
                else if (team.equals("Eibar"))
                    eibarGoals = goals;

            }

            String ans = (barcelonaGoals > eibarGoals) && (realmadridGoals < malagaGoals)
                    ? "Barcelona"
                    : "RealMadrid";

            System.out.println(ans);

            t--;
        }
        cin.close();
    }
}