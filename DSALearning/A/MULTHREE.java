package DSALearning.A;

import java.math.BigInteger;
import java.util.*;

public class MULTHREE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int T = sc.nextInt();
            while (T-- > 0) {
                long K = sc.nextLong();
                int d0 = sc.nextInt();
                int d1 = sc.nextInt();
                BigInteger sum = BigInteger.valueOf(d0 + d1);
                ArrayList<Integer> temp = new ArrayList<>();

                if (K > 2) {
                    int a = (d0 + d1) % 10;
                    sum = sum.add(BigInteger.valueOf(a));
                    if (K > 3) {
                        a = (a * 2) % 10;
                        while (!temp.contains(a)) {
                            temp.add(a);
                            a = (a * 2) % 10;
                        }
                        int x = 0;
                        for (Integer integer : temp) {
                            x += integer;
                        }
                        long y = (K - 3) / temp.size();
                        sum = sum.add(BigInteger.valueOf(x).multiply(BigInteger.valueOf(y)));
                        y = (K - 3) % temp.size();
                        x = 0;
                        for (int i = 0; i < y; i++) {
                            x += temp.get(i);
                        }
                        sum = sum.add(BigInteger.valueOf(x));
                    }
                }
                if(sum.mod(BigInteger.valueOf(3)).equals(BigInteger.ZERO)){
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        } catch (Exception ignored) {

        }
    }
}
