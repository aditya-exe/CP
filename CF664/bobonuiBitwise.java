import java.io.*;
import java.util.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class bobonuiBitwise {
    static BufferedReader __in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter __out = new PrintWriter(new OutputStreamWriter(System.out));
    static StringTokenizer input;
    static Random __rand = new Random();
    // constants
    static final int IBIG = 1000000007;
    static final int IMAX = 2147483647;
    static final int IMIN = -2147483648;
    static final long LMAX = 9223372036854775807L;
    static final long LMIN = -9223372036854775808L;

    static class in {
        // input
        static void r() throws IOException {
            input = new StringTokenizer(rline());
        }

        static int ri() throws IOException {
            return Integer.parseInt(rline());
        }

        static long rl() throws IOException {
            return Long.parseLong(rline());
        }

        static double rd() throws IOException {
            return Double.parseDouble(rline());
        }

        static int[] ria(int n) throws IOException {
            int[] a = new int[n];
            r();
            for (int i = 0; i < n; ++i) a[i] = ni();
            return a;
        }

        static int[] riam1(int n) throws IOException {
            int[] a = new int[n];
            r();
            for (int i = 0; i < n; ++i) a[i] = ni() - 1;
            return a;
        }

        static long[] rla(int n) throws IOException {
            long[] a = new long[n];
            r();
            for (int i = 0; i < n; ++i) a[i] = nl();
            return a;
        }

        static double[] rda(int n) throws IOException {
            double[] a = new double[n];
            r();
            for (int i = 0; i < n; ++i) a[i] = nd();
            return a;
        }

        static char[] rcha() throws IOException {
            return rline().toCharArray();
        }

        static String rline() throws IOException {
            return __in.readLine();
        }

        static String n() {
            return input.nextToken();
        }

        static int rni() throws IOException {
            r();
            return ni();
        }

        static int ni() {
            return Integer.parseInt(n());
        }

        static long rnl() throws IOException {
            r();
            return nl();
        }

        static long nl() {
            return Long.parseLong(n());
        }

        static double rnd() throws IOException {
            r();
            return nd();
        }

        static double nd() {
            return Double.parseDouble(n());
        }

        static List<List<Integer>> rg(int n, int m) throws IOException {
            List<List<Integer>> g = GR.g(n);
            for (int i = 0; i < m; ++i) GR.c(g, rni() - 1, ni() - 1);
            return g;
        }

        static void rg(List<List<Integer>> g, int m) throws IOException {
            for (int i = 0; i < m; ++i) GR.c(g, rni() - 1, ni() - 1);
        }

        static List<List<Integer>> rdg(int n, int m) throws IOException {
            List<List<Integer>> g = GR.g(n);
            for (int i = 0; i < m; ++i) GR.cto(g, rni() - 1, ni() - 1);
            return g;
        }

        static void rdg(List<List<Integer>> g, int m) throws IOException {
            for (int i = 0; i < m; ++i) GR.cto(g, rni() - 1, ni() - 1);
        }

        static List<Set<Integer>> rsg(int n, int m) throws IOException {
            List<Set<Integer>> g = GR.sg(n);
            for (int i = 0; i < m; ++i) GR.c(g, rni() - 1, ni() - 1);
            return g;
        }

        static void rsg(List<Set<Integer>> g, int m) throws IOException {
            for (int i = 0; i < m; ++i) GR.c(g, rni() - 1, ni() - 1);
        }

        static List<Set<Integer>> rdsg(int n, int m) throws IOException {
            List<Set<Integer>> g = GR.sg(n);
            for (int i = 0; i < m; ++i) GR.cto(g, rni() - 1, ni() - 1);
            return g;
        }

        static void rdsg(List<Set<Integer>> g, int m) throws IOException {
            for (int i = 0; i < m; ++i) GR.cto(g, rni() - 1, ni() - 1);
        }
    }

    //Output fxs
    static class out {
        // test.output
        static void pr(int i) {
            __out.print(i);
        }

        static void prln(int i) {
            __out.println(i);
        }

        static void pr(long l) {
            __out.print(l);
        }

        static void prln(long l) {
            __out.println(l);
        }

        static void pr(double d) {
            __out.print(d);
        }

        static void prln(double d) {
            __out.println(d);
        }

        static void pr(char c) {
            __out.print(c);
        }

        static void prln(char c) {
            __out.println(c);
        }

        static void pr(char[] s) {
            __out.print(new String(s));
        }

        static void prln(char[] s) {
            __out.println(new String(s));
        }

        static void pr(String s) {
            __out.print(s);
        }

        static void prln(String s) {
            __out.println(s);
        }

        static void pr(Object o) {
            __out.print(o);
        }

        static void prln(Object o) {
            __out.println(o);
        }

        static void prln() {
            __out.println();
        }

        static void pryes() {
            prln("yes");
        }

        static void pry() {
            prln("Yes");
        }

        static void prY() {
            prln("YES");
        }

        static void prno() {
            prln("no");
        }

        static void prn() {
            prln("No");
        }

        static void prN() {
            prln("NO");
        }

        static void pryesno(boolean b) {
            prln(b ? "yes" : "no");
        }

        ;

        static void pryn(boolean b) {
            prln(b ? "Yes" : "No");
        }

        static void prYN(boolean b) {
            prln(b ? "YES" : "NO");
        }

        static void prln(int... a) {
            for (int i = 0, len = a.length - 1; i < len; pr(a[i]), pr(' '), ++i) ;
            if (a.length > 0) prln(a[a.length - 1]);
            else prln();
        }

        static void prln(long... a) {
            for (int i = 0, len = a.length - 1; i < len; pr(a[i]), pr(' '), ++i) ;
            if (a.length > 0) prln(a[a.length - 1]);
            else prln();
        }

        static void prln(double... a) {
            for (int i = 0, len = a.length - 1; i < len; pr(a[i]), pr(' '), ++i) ;
            if (a.length > 0) prln(a[a.length - 1]);
            else prln();
        }

        static <T> void prln(Collection<T> c) {
            int n = c.size() - 1;
            Iterator<T> iter = c.iterator();
            for (int i = 0; i < n; pr(iter.next()), pr(' '), ++i) ;
            if (n >= 0) prln(iter.next());
            else prln();
        }

        static void h() {
            prln("hlfd");
            flush();
        }

        static void flush() {
            __out.flush();
        }

        static void close() {
            __out.close();
        }
    }

    //Graph fxs
    static class GR {
        // graph util
        static List<List<Integer>> g(int n) {
            List<List<Integer>> g = new ArrayList<>();
            for (int i = 0; i < n; ++i) g.add(new ArrayList<>());
            return g;
        }

        static List<Set<Integer>> sg(int n) {
            List<Set<Integer>> g = new ArrayList<>();
            for (int i = 0; i < n; ++i) g.add(new HashSet<>());
            return g;
        }

        static void c(List<? extends Collection<Integer>> g, int u, int v) {
            g.get(u).add(v);
            g.get(v).add(u);
        }

        static void cto(List<? extends Collection<Integer>> g, int u, int v) {
            g.get(u).add(v);
        }

        static void dc(List<? extends Collection<Integer>> g, int u, int v) {
            g.get(u).remove(v);
            g.get(v).remove(u);
        }

        static void dcto(List<? extends Collection<Integer>> g, int u, int v) {
            g.get(u).remove(v);
        }
    }

    public static void main(String[] $) throws IOException {
        bobonuiBitwise o = new bobonuiBitwise();
        o.main();
        out.flush();
    }

    int[] a, b;
    int n, m;

    void main() throws IOException {
        in.r();
        n = in.ni();
        m = in.ni();
        a = in.ria(n);
        b = in.ria(m);

        for (int i = 0; i < (1 << 9); i++) {
            if (isValid(i)) {
                out.prln(i);
                break;
            }
        }
    }

    private boolean isValid(int x) {
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            flag = false;
            for (int j = 0; j < m; j++) {
                int res = a[i] & b[j];
                if ((res | x) == x) {
                    flag = true;
                    break;
                }
            }
            if (!flag) return false;
        }
        return flag;
    }
}
