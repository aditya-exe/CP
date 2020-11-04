import java.util.*;

public class bobonuiChess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int Sx = sc.nextInt();
            int Sy = sc.nextInt();
            System.out.println(Sx + " " + Sy);
            for (int i = 1; i <= n; i++) {
                if (i != Sx) {
                    System.out.println(i + " " + Sy);
                }
            }
            int dir = 0;
            for (int i = 1; i <= m; i++) {
                if (i == Sy) continue;

                if (dir == 0) {
                    for (int j = n; j > 0; j--) {
                        System.out.println(j + " " + i);
                    }
                    dir = 1;
                } else {
                    for (int j = 1; j <= n; j++) {
                        System.out.println(j + " " + i);
                        dir=0;
                    }
                }
            }
        } catch (Exception ignored) {

        }
    }
}
