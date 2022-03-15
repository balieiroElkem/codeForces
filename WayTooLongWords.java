import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.next());

        while (n > 0) {
            String word = input.next();

            if (word.length() > 10) {
                String resp = "";
                resp += word.charAt(0);
                resp += (word.length() - 2);
                resp += word.charAt(word.length()-1);
                System.out.println(resp);
            } else {
                System.out.println(word);
            }

            n--;
        }

        input.close();
    }
}
