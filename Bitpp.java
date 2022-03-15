import java.util.Scanner;

public class Bitpp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.next());
        int x = 0;

        while (n > 0) {
            String op = input.next();

            if (op.charAt(1) == '+') {
                x++;
            } else {
                x--;
            }
            
            n--;
        }

        input.close();
        System.out.println(x);
    }
}
