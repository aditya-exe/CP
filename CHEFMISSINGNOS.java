import java.util.*;

public class CHEFMISSINGNOS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int T = sc.nextInt();
            while (T-- > 0) {
                int M = sc.nextInt();
                ArrayList<Integer> sec = new ArrayList<>();
                while (M-- > 0) {
                    sec.add(sc.nextInt());
                }
                int R = sc.nextInt();
                ArrayList<Integer> fir = new ArrayList<>();
                while (R-- > 0) {
                    fir.add(sc.nextInt());
                }
                Collections.sort(fir);
                Collections.sort(sec);


                for (Integer integer : sec) {
                    fir.remove(integer);
                }

                for(int i : fir){
                    System.out.print(i + " ");
                }

            }
        } catch (Exception ignored) {

        }
    }
}
