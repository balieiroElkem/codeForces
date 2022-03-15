import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);

        char[][] s = new char[5][5];
        int movimentos = 0;

        for (int i = 0; i < s.length; ++i) {
            for (int j = 0; j < s[i].length; j++) {
                s[i][j] = input.next().charAt(0);
                if (s[i][j] == '1') {
                    if (i > 2) {
                        movimentos += (i - 2);
                    } else {
                        movimentos += (2 - i);
                    }
                    if (j > 2) {
                        movimentos += (j - 2);
                    } else {
                        movimentos += (2 - j);
                    }
                    break;
                }
            }
        }
        input.close();

        System.out.println(movimentos);
    }
}
