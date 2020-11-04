import java.util.Arrays;

public class DutchNationalFlag {
    public static void main(String[] args) {
        int[] array = new int[] {5, 9, 6, 7, 1, 0, 9};
        DNF(array, 3);
    }

    public static void DNF(int[] array, int mid) {
        int i = 0;
        int j = 0;
        int k = array.length;

        while(j < k) {
            if(array[j] < mid) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j++;
            } else if (array[j] > mid) {
                k--;
                int temp = array[j];
                array[j] = array[k];
                array[k] = temp;
            } else {
                j++;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}