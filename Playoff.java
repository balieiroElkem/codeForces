import java.util.Scanner;

public class Playoff {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.next());
        
        while (n > 0) {
            int t = Integer.parseInt(input.next());
            int result = 1;

            if (t > 1) {
                result = (int) Math.pow(2, t) - 1;
            }

            System.out.println(result);
            
            n--;
        }

        input.close();
    }
}
