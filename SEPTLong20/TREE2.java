package SEPTLong20;

import java.io.*;
import java.util.*;

class TREE2 extends PrintWriter {
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

    TREE2() {
        super(System.out);
    }

    Scanner sc = new Scanner(System.in);

    public static void main(String[] $) throws IOException {
        TREE2 o = new TREE2();

        try {
            o.main();
            o.flush();
        } catch (Exception ignored) {

        }

    }

    void main() {
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            Set<Integer> s = new HashSet<>();
            while (n-- > 0) {
                int x = sc.nextInt();
                if (x != 0) {
                    s.add(x);
                }
            }
            System.out.println(s.size());
        }
    }


    private int subtask(long[] sticks) {
        Arrays.sort(sticks);
        int count = 0;
        long H = getH(sticks);
        ArrayList<Long> seen = new ArrayList<>();
        if (areDistinct(sticks)) {
            count = sticks.length;
        } else {
            while (sticks.length > 0) {
                for (int i = sticks.length - 1; i >= 0; i--) {
                    println(sticks[i]);
                    if (sticks[i] > H && !seen.contains(sticks[i])) {
                        seen.add(sticks[i]);
                        System.out.println("H:" + H);
                        sticks[i] = H;
                        System.out.println(Arrays.toString(sticks));
                        count++;
                        H = getH(sticks);
                        System.out.println("H:" + H);
                    } else if (sticks[i] > H && seen.contains(sticks[i])) {
                        System.out.println("Hs:" + H);
                        System.out.println(Arrays.toString(sticks));
                        sticks[i] = H;
                        System.out.println(Arrays.toString(sticks));
                        H = getH(sticks);
                        System.out.println("H:" + H);
                    } else if (eqAr(sticks)) {
                        for (int k = 0; k < sticks.length; k++) {
                            sticks = removeElement(sticks, i);
                        }
                        count++;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(sticks));
        return count;
    }

    private static boolean eqAr(long[] arr) {
        long first = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] != first)
                return false;
        return true;
    }

    private static long[] removeElement(long[] arr, int index) {
        if (arr == null
                || index < 0
                || index >= arr.length) {

            return arr;
        }
        long[] anotherArray = new long[arr.length - 1];
        System.arraycopy(arr, 0, anotherArray, 0, index);
        System.arraycopy(arr, index + 1,
                anotherArray, index,
                arr.length - index - 1);
        return anotherArray;
    }

    static long getH(long[] sticks) {
        int i;
        long first, second;

        first = second = Long.MIN_VALUE;
        for (i = 0; i < sticks.length; i++) {
            if (sticks[i] > first) {
                second = first;
                first = sticks[i];
            } else if (sticks[i] > second && sticks[i] != first) {
                second = sticks[i];
            }
        }

        if (second == Long.MIN_VALUE) {
            return 1;
        } else {
            return second;
        }
    }

    public static boolean areDistinct(long[] arr) {
        // Put all array elements in a HashSet
        Set<Long> s = new HashSet<Long>();
        for (long l : arr) {
            s.add(l);
        }
        // If all elements are distinct, size of
        // HashSet should be same array.
        return (s.size() == arr.length);
    }
}