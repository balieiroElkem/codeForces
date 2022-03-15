import java.util.Scanner;

public class WaterMelon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int w = Integer.parseInt(input.next());
        input.close();

        if (w > 2 && w%2 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}