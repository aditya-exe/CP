import java.util.*;

public class ELEVATR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int M = sc.nextInt();
            ArrayList<Integer> B = new ArrayList<>();
            while (n-- > 0) {
                B.add(sc.nextInt());
            }
            int oldFloor = 0;
            int newFloor = B.get(0);
            int direction = 0;
            for (int i = 0; i < B.size(); i++) {
                if (B.get(i) == -1){
                    continue;
                } else {
                    oldFloor = newFloor;
                    newFloor = B.get(i);
                }
                if (newFloor < oldFloor) {
                    direction++;
                } else if (newFloor > oldFloor && oldFloor!=B.get(0)){
                    direction++;
                }
                
            }

            System.out.println(direction);
        }
    }
}
