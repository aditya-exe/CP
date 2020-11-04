import java.util.*;

public class ADAKING {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int T = sc.nextInt();
            while (T-- > 0) {
                int K = sc.nextInt();
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {
                        if (i == 0 && j == 0) {
                            System.out.print("O");
                            K--;
                        } else if (K != 0) {
                            System.out.print(".");
                            K--;
                        } else {
                            System.out.print("X");
                        }
                    }
                    System.out.println("");
                }
                System.out.println("");
            }
        } catch (Exception ignored) {
        }
    }
}
