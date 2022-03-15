import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = input.next();
        s = capitalizer(s);

        System.out.println(s);
        
        input.close();
    }

    private static String capitalizer(String str) {
        char[] s = str.toCharArray();
        s[0] = Character.toUpperCase(s[0]);

        return new String(s);
    }
}
