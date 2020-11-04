import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class RGAME {
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
                n += 1;
                ArrayList<Integer> nums = new ArrayList<>();
                while (n-- > 0) {
                    nums.add(fr.nextInt());
                }
                int sum = 0;
                int count = 0;
                for (int i = 0; i < nums.size(); i++) {
                    for (int j = 1; j < nums.size(); j++) {
                        sum += nums.get(i) * nums.get(j);

                    }
                }
            }
        } catch (Exception ignored) {

        }
    }
}
