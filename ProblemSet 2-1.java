import java.util.Scanner;

public class help {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();
        int intervals = scanner.nextInt();
        int orders = scanner.nextInt();
        int[] number = new int[numbers];
        for (int i = 0; i < numbers; i++) {
            number[i] = scanner.nextInt();
        }
        int[] interval1 = new int[intervals];
        int[] interval2 = new int[intervals];
        for (int i = 0; i < intervals; i++) {
            interval1[i] = scanner.nextInt();
            interval2[i] = scanner.nextInt();
        }
        long[] values = new long[intervals];
        long[] sums = new long[numbers + 1];
        sums[0] = 0L;
        for (int i = 0; i < numbers; i++) {
            sums[i + 1] = sums[i] + number[i];
        }
        for (int i = 0; i < intervals; i++) {
            values[i] = sums[interval2[i]] - sums[interval1[i] - 1];
        }
        for (int j = 0; j < orders; j++) {
            int help = scanner.nextInt();
            if (help == 1) {
                int i = scanner.nextInt();
                int l = scanner.nextInt();
                int r = scanner.nextInt();
                values[i - 1] = sums[r] - sums[l - 1];
                interval1[i - 1] = l;
                interval2[i - 1] = r;
            } else {
                int first = scanner.nextInt();
                int last = scanner.nextInt();
                long ans = 0L;
                for (int i = first - 1; i < last; i++) {
                    ans += values[i];
                }
                System.out.println(ans);
            }
        }
    }
}