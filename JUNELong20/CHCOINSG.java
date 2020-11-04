import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class CHCOINSG {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {
        FastReader fr = new FastReader();

        try {
            int T = fr.nextInt();
            while (T-- > 0) {
                int n =fr.nextInt();
                if(n%6==0){
                    System.out.println("Misha");
                } else {
                    System.out.println("Chef");
                }
            }
        } catch (Exception ignored) {

        }
    }
    /*static ArrayList<Integer> primes = new ArrayList<>();

    public static void soE(int n) {
        boolean[] prime = new boolean[n + 1];

        for (int i = 0; i < n; i++)
            prime[i] = true;

        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                for (int i = p * 2; i <= n; i += p)
                    prime[i] = false;
            }
        }

        for (int i = 2; i <= n; i++) {
            if (prime[i])
                primes.add(i);
        }
    }

    public static boolean power_of_primes(int n) {
        for (int ii = 0; ii < primes.size(); ii++) {
            int i = primes.get(ii);
            if (n % i == 0) {
                int c = 0;
                while (n % i == 0) {
                    n /= i;
                    c += 1;
                }

                if (n == 1)
                    return true;
                else
                    return false;
            }
        }
        return false;
    }

    static int binarySearch(int left, int right, int n) {
        if (left <= right) {
            int mid = (left + right) / 2;


            if (mid == 0 || mid == primes.size() - 1)
                return primes.get(mid);

            if (primes.get(mid) == n)
                return primes.get(mid - 1);

            if (primes.get(mid) < n && primes.get(mid + 1) > n)
                return primes.get(mid);
            if (n < primes.get(mid))
                return binarySearch(left, mid - 1, n);
            else
                return binarySearch(mid + 1, right, n);
        }
        return 0;
    }

    public static void main(String[] args) {
        FastReader fr = new FastReader();

        try {
            int T = fr.nextInt();
            while (T-- > 0) {
                int n = fr.nextInt();
                soE(n);
                BigInteger bi = new BigInteger(String.valueOf(n));
                ArrayList<Integer> pop = new ArrayList<>();
                for (int i = n; i > 0; i--) {
                    if (power_of_primes(i)) {
                        pop.add(i);
                    }
                }
                //System.out.println(pop);
                if (bi.isProbablePrime(1)) {
                    primes.add(n);
                }
                int count = 0;
                if (primes.contains(n) || n == 1 || power_of_primes(n)) {
                    System.out.println("Chef");
                } else {
                    while (n > 0) {
                        if (n - Math.max(pop.get(0), binarySearch(0, primes.size() - 1, n)) > 0) {
                            n -= Math.max(pop.get(0), binarySearch(0, primes.size() - 1, n));
                        } else {
                            n -= 1;
                        }
                        count += 1;
                    }
                }
                //System.out.println(primes + " " + count);
                if (((n & 1) == 0) && n == 0) {
                    System.out.println("Misha");
                } else if (((n & 1) != 0) && n == 0) {
                    System.out.println("Chef");
                }
            }

        } catch (Exception ignored) {

        }
    }*/
}