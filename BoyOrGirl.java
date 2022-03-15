import java.util.Scanner;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = input.next();
        String letters = "";
        
        for (int i = 0; i < s.length(); ++i) {
           if (!found(letters, s.charAt(i))) {
               letters += s.charAt(i);
           }
        }
        
        if (letters.length()%2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
        
        input.close();
    }


    private static boolean found(String l, char c) {
        boolean found = false;
        for (int i = 0; i < l.length(); ++i) {
            if (l.charAt(i) == c) {
                found = true;
                break;
            }
        }


        return found;
    }
}
