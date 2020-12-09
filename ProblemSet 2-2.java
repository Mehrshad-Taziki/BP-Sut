import java.util.Scanner;
public class help {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] A = new int[n];
        String[] chair = new String[n];
        for (int i = 0; i < n; i++) {
            chair[i] = scanner.next();
            A[i] = i;
        }
        int[] value = new int[n];
        for (int i = 0; i < n; i++) {
            value[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (value[A[j]] > value[A[j + 1]]) {
                    int help = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = help;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            String[] help = new String[n];
            for (int j = 0; j < n; j++) {
                help[j] = chair[A[j]];
            }
            for (int j = 0; j < n; j++) {
                chair[j] = help[j];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(chair[i]+ " ");
        }
    }
}
