import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class LECANDY {
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
    //Pair Class
    /*class Pair implements Comparable<Pair> {
        double logValue;
        int index;

        Pair(double logValue, int index) {
            this.logValue = logValue;
            this.index = index;
        }

        @Override
        public int compareTo(Pair that) {
            return Double.compare(this.logValue, that.logValue);
        }
    }*/

    public static void main(String[] args) {
        FastReader fr = new FastReader();

        try {
            int T = fr.nextInt();
            while (T-- > 0) {
                int n = fr.nextInt();
                int candy = fr.nextInt();
                ArrayList<Integer> elephants = new ArrayList<>();
                while (n-- > 0) {
                    elephants.add(fr.nextInt());
                }
                for (Integer i : elephants) {
                    candy -= i;
                }
                if ((candy >= 0)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        } catch (Exception ignored) {

        }
    }
}
