import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1 = input.next();
        String s2 = input.next();
        input.close();

        s1 = s1.toUpperCase();
        s2 = s2.toUpperCase();

        int diferenca = 0;

        for (int i = 0; i < s1.length(); ++i) {
            diferenca = (int)(s1.charAt(i)) - (s2.charAt(i));
            if (diferenca != 0)
                break;
        }



        if (diferenca < 0) {
            System.out.println("-1");
        } else if (diferenca > 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
