import java.util.*;

public class CHEFICECREAM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int T = sc.nextInt();
            while (T-- > 0) {
                int M = sc.nextInt();
                int N = sc.nextInt();
                ArrayList<Integer> flavours = new ArrayList<>();
                while (N-- > 0) {
                    flavours.add(sc.nextInt());
                }
                int sum = 0;
                //ArrayList<Integer> bought = new ArrayList<>();
                for (int i = 0; i < flavours.size(); i++) {
                    if (flavours.get(i) < M && sum < M) {
                        sum += flavours.get(i);
                        System.out.print(i+1 + " ");
                    }
                }
            }
        } catch (Exception ignored) {

        }
    }
}
