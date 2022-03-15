import java.util.Scanner;

public class StonesOnTheTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.next());
        String stones = input.next();
        input.close();

        int quant = n-1;
        for (int i = 0; i < n-1; ++i) {
            if (stones.charAt(i) != stones.charAt(i+1)) {
                quant--;
            }
        }

        System.out.println(quant);

    }
}
