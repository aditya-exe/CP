import java.util.*;

public class Boxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int N, K;
        while (T-- > 0) {
            N = sc.nextInt();
            K = sc.nextInt();
            int rounds = 0;
            int sum = 0;

            ArrayList<Integer> weight = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                weight.add(sc.nextInt());
            }

            try {
                int pickedUp = 0;
                for (int i = 0; i < N; i++) {

                }

            } catch (Exception e) {
                return;
            }
        }
    }

    /*public static int canCarry(Vector<Integer> weights, int K) {
        int rounds = 0;
        int sum = 0;
        do {
            for (int i = 0; i < weights.capacity(); i++) {
                if(sum < K) {
                    sum += weights.get(i);
                    weights.remove(i);
                }
            }
            rounds++;
        } while (!weights.isEmpty());
        System.out.println(rounds);
        return rounds;
    }*/

    /*int X = K;
             int[] weights = new int[N];
             for (int i = 0; i < N; i++) {
                 weights[i] = sc.nextInt();
             }
             int count = 0;
             try {
                 for (int i = 0; i < N; i++) {
                     K = K - weights[i];
                     if (K > 0 && i == N - 1) {
                         count++;
                         break;
                     } else if (K > 0 && weights[i+1] > K) {
                         count++;
                         K = X;
                     } else if (K == 0) {
                         count++;
                         K = X;
                     }
                     if (K < 0) {
                         f = -1;
                         break;
                     }
                 }
                 if (f == -1) {
                     System.out.println(-1);
                 } else {
                     System.out.println(count);
                 }
             } catch (Exception e) {
                 return;
             }*/
}