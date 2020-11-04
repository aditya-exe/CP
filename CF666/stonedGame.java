import java.util.*;
import java.io.*;

public class stonedGame {
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
                int n = fr.nextInt();
                ArrayList<Integer> stacks = new ArrayList<>();
                while (n-- > 0) {
                    stacks.add(fr.nextInt());
                }
                int sum = stacks.stream().mapToInt(x -> x).sum();
                int max = Collections.max(stacks);

                if (((max * 2) > sum) || ((sum & 1) != 0)) {
                    System.out.println("T");
                } else {
                    System.out.println("HL");
                }
            }
        } catch (Exception ignored) {

        }

    }
}
