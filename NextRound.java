import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.next());
        int k = Integer.parseInt(input.next());
        int numParts = 0;
        int notas[] = new int[n];
        int j = 0;

        while (n > 0) {
            int nota = Integer.parseInt(input.next());
            notas[j] = nota;

            ++j;
            n--;
        }

        for (int i = 0; i < notas.length; ++i) {
            if (notas[i] >= notas[k-1] && notas[i] > 0) {
                numParts++;
            }
        }

        input.close();

        System.out.println(numParts);
    }
}
