import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class ADAMAT {
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

    static int count = 0;

    public static void main(String[] args) {
        FastReader fr = new FastReader();


        int T = fr.nextInt();
        while (T-- > 0) {
            int N = fr.nextInt();
            int[][] arr = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    arr[i][j] = fr.nextInt();
                }
            }
            ArrayList<Integer> correct = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                if (arr[0][i] == (i + 1)) {
                    correct.add(0);
                } else {
                    correct.add(1);
                }
            }

            int transpose = 0;
            for (int i = N - 1; i > 0; i--) {
                if (correct.get(i) == 1) {
                    transpose++;
                    for (int j = i; j >= 0; j--) {
                        if (correct.get(j) == 1) {
                            correct.set(j, 0);
                        } else {
                            correct.set(j, 1);
                        }
                    }
                    //System.out.println(correct);
                }
            }
            System.out.println(transpose);
        }

    }
}