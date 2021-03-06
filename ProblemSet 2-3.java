import java.util.Scanner;

public class help {
    public static void squarecreate(int n, int len, char[][] a) {
        for (int i = (n - len) / 2; i < (n - len) / 2 + len; i++) {
            a[i][(n - len) / 2] = '#';
            a[(n - len) / 2][i] = '#';
            a[(n - len) / 2 + len - 1][i] = '#';
            a[i][(n - len) / 2 + len - 1] = '#';
        }
    }

    public static void rhombuscreate(int n, int len, char[][] a) {
        int help1 = n / 2;
        int help2 = n / 2;
        for (int i = (n - len) / 2; i <= n / 2; i++) {
            a[i][help1] = '#';
            a[i][help2] = '#';
            help1++;
            help2--;
        }
        help1 = n / 2;
        help2 = n / 2;
        for (int i = n / 2 + len / 2; i >= n / 2; i--) {
            a[i][help1] = '#';
            a[i][help2] = '#';
            help1--;
            help2++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int square = (int) Math.pow(2, n / 2 + 2) - 1;
        int size = square;
        int rhombus = square - 2;
        char[][] ans = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                ans[i][j] = '.';
            }
        }
        for (int i = 0; i < (n+1)/2; i++) {
            squarecreate(size, square, ans);
            square /= 2;
        }
        for (int i = 0; i < n / 2; i++) {
            rhombuscreate(size, rhombus, ans);
            rhombus = ((rhombus + 2) / 2) - 2;
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(ans[i][j]);
            }
            System.out.print("\n");
        }
    }
}