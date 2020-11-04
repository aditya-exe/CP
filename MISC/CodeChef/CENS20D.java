import java.util.*;

public class CENS20D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int T = sc.nextInt();
            while (T-- > 0) {
                int n = sc.nextInt();
                int[] nums = new int[n];
                for (int i = 0; i < n; i++) {
                    nums[i] = sc.nextInt();
                }
                int pairs = 0;
                for (int i = 0; i < n; i++) {
                    for (int j = i + 1; j < n; j++) {
                        if ((nums[i] & nums[j]) == nums[i]) {
                            pairs += 1;
                        }
                    }
                }

                System.out.println(pairs);
            }
        } catch (Exception ignored) {
        }
    }
}
