import java.util.Scanner;

public class DominoPiling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int m = Integer.parseInt(input.next());
        int n = Integer.parseInt(input.next());
        int area = n*m;
        int quant = area/2;

        System.out.println(quant);
        
        input.close();
    }
}
