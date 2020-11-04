import org.w3c.dom.Node;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BSTOPS {
    //FastReader Class
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

    //BST Class
    static class BST {
        Node root;

        BST() {
            root = null;
        }

        static class Node {
            int val, pos;
            Node left, right;

            Node(int val, int pos) {
                this.val = val;
                this.pos = pos;
                left = right = null;
            }
        }

        void add(int val) {
            root = add(val, root, 1);
        }

        Node add(int val, Node cur, int pos) {
            if (cur == null) {
                cur = new Node(val, pos);
                sb.append(pos).append("\n");
            } else if (val < cur.val) cur.left = add(val, cur.left, 2 * pos);
            else cur.right = add(val, cur.right, 2 * pos + 1);
            return cur;
        }

        int first() {
            return first(root);
        }

        int first(Node cur) {
            int val = Integer.MIN_VALUE;
            while (cur != null) {
                val = cur.val;
                cur = cur.left;
            }
            return val;
        }

        void remove(int val) {
            root = remove(val, root);
        }

        Node remove(int val, Node cur) {
            if (cur != null) {
                if (val < cur.val) cur.left = remove(val, cur.left);
                else if (val > cur.val) cur.right = remove(val, cur.right);
                else {
                    if (!flag) {
                        sb.append(cur.pos).append("\n");
                        flag = true;
                    }

                    if (cur.left == null) cur = cur.right;
                    else if (cur.right == null) cur = cur.left;
                    else {
                        cur.val = first(cur.right);
                        cur.right = remove(cur.val, cur.right);
                    }
                }
            }
            return cur;
        }
    }

    static StringBuilder sb;
    static boolean flag;

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        BST tree = new BST();
        sb = new StringBuilder();
        try {
            int T = fr.nextInt();
            while (T-- > 0) {
                String q = fr.next();
                int n = fr.nextInt();
                flag = false;
                if (q.equals("i")) {
                    tree.add(n);
                } else {
                    tree.remove(n);
                }
            }
            System.out.println(sb);
        } catch (Exception ignored) {

        }
    }
}