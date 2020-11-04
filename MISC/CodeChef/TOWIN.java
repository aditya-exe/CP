import java.util.*;

public class TOWIN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int T = sc.nextInt();

            while (T-- > 0) {
                int n = sc.nextInt();
                ArrayList<Integer> nums = new ArrayList<>();
                while (n-- > 0) {
                    nums.add(sc.nextInt());
                }

                Collections.sort(nums);
                Collections.reverse(nums);
                //System.out.println(nums);

                long first = 0, second = 0;

                for (int i = 0; i < nums.size(); i++) {
                    if (i == 0) {
                        first += nums.get(i);
                    } else if (i == 1 || i == 2) {
                        second += nums.get(i);
                    } else if (i % 2 != 0) {
                        first += nums.get(i);
                    } else if (i % 2 == 0) {
                        second += nums.get(i);
                    }
                }

                //System.out.println(first);
                //System.out.println(second);


                if (first > second) {
                    System.out.println("first");
                } else if (first == second) {
                    System.out.println("draw");
                } else {
                    System.out.println("second");
                }
            }
        } catch (Exception ignored){
        }

    }
}
