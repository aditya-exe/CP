import java.util.*;

public class ARRGAME {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> nums = new ArrayList<>();
            while (n-- > 0) {
                nums.add(sc.nextInt());
            }

            Iterator iterator = nums.iterator();

            for (int i = 0; i < nums.size(); i++) {
                while (iterator.hasNext()) {
                    if (nums.get(i + 1) == 0){
                        nums.set(i, 1);
                    } else {
                        System.out.println("No");
                    }
                    iterator.next();
                }
            }
        }
    }
}
