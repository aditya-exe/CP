import java.util.*;

public class LINCHESS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            ArrayList<Integer> pawns = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                pawns.add(sc.nextInt());
            }
            int min = 1000000000;
            int ans = 0;
            for (int i = 0; i < n; i++) {
                if (k % pawns.get(i) == 0) {
                    if (k / pawns.get(i) < min) {
                        min = k / pawns.get(i);
                        ans = pawns.get(i);
                    }
                }
            }
            System.out.println(ans>0? ans : -1);
        }
    }
}
