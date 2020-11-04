import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class CHRL4 {
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

    static class Pair implements Comparable<Pair> {
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
    }

    public static void main(String[] args) {
        FastReader fr = new FastReader();

        try {
            int T = fr.nextInt();
            int K = fr.nextInt();
            ArrayList<Integer> streets = new ArrayList<>();
            while (T-- > 0) {
                streets.add(fr.nextInt());
            }
            int ans;
            if (streets.size() <= 80) {
                ans = subtask1(streets, streets.size(), K);
            } else {
                ans = Math.toIntExact(subtask2(streets, streets.size(), K));
            }
            System.out.println(ans);
        } catch (Exception ignored) {

        }
    }

    private static Long subtask2(ArrayList<Integer> streets, int size, int k) {
        ArrayList<Long> min = new ArrayList<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.offer(new Pair(Math.log(streets.get(0)), 0));
        min.set(0, (long)streets.get(0)%1000000007);

        for(int i=1; i<size; i++){
            while (i-pq.peek().index > k){
                pq.poll();
            }
            int j=pq.peek().index;
            min.set(i, (min.get(j)*streets.get(i))%1000000007);
            pq.offer(new Pair(pq.peek().logValue + Math.log(streets.get(i)), i));
        }
        return min.get(size-1);
    }

    private static int subtask1(ArrayList<Integer> streets, int size, int k) {
        ArrayList<BigInteger> list = new ArrayList<BigInteger>();
        list.add(BigInteger.valueOf(streets.get(0)));
        for (int i = 1; i < size; i++) {
            BigInteger min = list.get(i - 1);
            for (int j = 2; j <= k; j++) {
                if (i - j >= 0 && list.get(i - j).compareTo(min) < 0) {
                    min = list.get(i - j);
                }
            }
            list.add(min.multiply(BigInteger.valueOf(streets.get(i))));
        }
        return list.get(size - 1).mod(BigInteger.valueOf(1000000007)).intValue();
    }
}
