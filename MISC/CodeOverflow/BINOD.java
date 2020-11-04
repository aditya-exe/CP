import java.util.*;

public class BINOD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            long N = sc.nextLong();
            long K = sc.nextLong();
            long S = sc.nextLong();
            long[] arr = new long[(int) N];
            while (N-- > 0) {
                arr[(int) N] = sc.nextInt();
            }
            Map<Long, Long> ans = new HashMap<>();
            for (int i = (int) (K + 1); i <= arr.length; i++) {
                for (int j = 0; j <= arr.length - K; j++) {
                    long sum = 0;
                    for (long o = j; o < i + j; o++) {
                        sum += arr[(int) o];
                    }
                    System.out.println(sum);

                    /*if (sum > S) {
                        System.out.println(sum + " "+ i);
                        ans.put(sum, (long) i);
                        break;
                    }*/
                }
            }
            System.out.println(ans);
            System.out.println(ans.get(ans.keySet().toArray()[0]));
        } catch (Exception ignored) {

        }
    }
}
