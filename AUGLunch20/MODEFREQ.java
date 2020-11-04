import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class MODEFREQ {
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

        int T = fr.nextInt();
        Long max = Long.MIN_VALUE;
        Long key = Long.MAX_VALUE;
        while (T-- > 0) {
            int n = fr.nextInt();
            ArrayList<Integer> nums = new ArrayList<>();
            while (n-- > 0) {
                nums.add(fr.nextInt());
            }
            Map<Integer, Long> freq = nums.stream().collect(Collectors.groupingBy(num -> num, Collectors.counting()));

            Map<Long, Long> fof = new HashMap<>();
            for (Long l : freq.values()) {
                Long value = fof.get(l) == null ? Long.valueOf(0) : fof.get(l);
                fof.put(l, value + 1);
            }
            for (Map.Entry<Long, Long> entry : fof.entrySet()) {
                max = entry.getValue() > max ? entry.getValue() : max;
            }
            for (Map.Entry<Long, Long> entry : fof.entrySet()) {
                if (entry.getValue().equals(max))
                    key = entry.getKey() > key ? key : entry.getKey();
            }
            System.out.println(key);
        }


    }
}