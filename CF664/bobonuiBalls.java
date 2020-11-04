import java.util.*;

public class bobonuiBalls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int T = sc.nextInt();
            while (T-- > 0) {
                int r = sc.nextInt();
                int g = sc.nextInt();
                int b = sc.nextInt();
                int w = sc.nextInt();

                if (check(r, g, b, w)) {
                    System.out.println("Yes");
                } else if (r > 0 && g > 0 && b > 0 && check(r - 1, g - 1, b - 1, w + 1)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        } catch (Exception ignored) {

        }
    }

    static boolean check(int r, int g, int b, int w) {
        boolean flag;
        flag = r % 2 + g % 2 + b % 2 + w % 2 <= 1;
        return flag;
    }
}