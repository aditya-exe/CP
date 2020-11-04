import java.util.*;

public class CHEFHOTEL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int T = sc.nextInt();
            ArrayList<Integer> prices = new ArrayList<>();
            while (T-->0){
                prices.add(sc.nextInt());
            }
            int initialPrice = prices.get(0);
            ArrayList<Integer> loss = new ArrayList<>();
            for (Integer price : prices){
                loss.add(initialPrice - price);
            }
            Collections.sort(loss);
            System.out.println(loss);
            for (Integer i : loss) {
                if (i > 0){
                    System.out.println(prices.indexOf(initialPrice - i));
                    break;
                }

            }
        } catch (Exception ignored) {

        }
    }
}
