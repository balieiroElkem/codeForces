import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.next());
        int resp = 0;

        while (n > 0) {
            int n1, n2, n3;

            n1 = Integer.parseInt(input.next());
            n2 = Integer.parseInt(input.next());
            n3 = Integer.parseInt(input.next());

            if ((n1 + n2 + n3) >= 2) {
                resp++;
            }

            n--;
        }
        input.close();

        System.out.println(resp);
    }
}
