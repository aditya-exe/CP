import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class CNOTE {
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
    static class Pair implements Comparable<Pair> {
        int logValue;
        int index;

        Pair(int logValue, int index) {
            this.logValue = logValue;
            this.index = index;
        }

        @Override
        public int compareTo(Pair pair) {
            return 0;
        }

        /*@Override
        public int compareTo(Pair that) {
            return int.compare(this.logValue, that.logValue);
        }*/
    }

    public static void main(String[] args) {
        FastReader fr = new FastReader();

        try {
            int T = fr.nextInt();

            while (T-- > 0) {
                int X = fr.nextInt();
                int Y = fr.nextInt();
                int K = fr.nextInt();
                int N = fr.nextInt();
                ArrayList<Pair> pairs = new ArrayList<>();
                while (N-- > 0) {
                    pairs.add(new Pair(fr.nextInt(), fr.nextInt()));
                }
                boolean lucky=false;
                if (X <= Y) {
                    System.out.println("LuckyChef");
                } else {
                    for(Pair p:pairs){
                        if((p.logValue >= (X-Y)) && (p.index<=K)){
                            lucky=true;
                            break;
                        } else{
                            lucky = false;
                        }
                    }
                }
                if(lucky){
                    System.out.println("LuckyChef");
                } else {
                    System.out.println("UnluckyChef");
                }
            }
        } catch (Exception ignored) {

        }
    }
}
