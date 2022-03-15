import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = input.next();
        String exp = "";
        for (int i = 0; i < s.length(); ++i) {
            if (Character.isDigit(s.charAt(i))) {
                exp += s.charAt(i);
            }
        }

        exp = ordena(exp);
        String expFinal = "";
        expFinal += exp.charAt(0);
        for (int i = 1; i < exp.length(); ++i) {
            expFinal += "+";
            expFinal += exp.charAt(i);
        }
        
        System.out.println(expFinal);
        input.close();
    }


    private static String ordena(String str) {
        char[] st = str.toCharArray();
        Arrays.sort(st);

        return new String(st);
    }
}
