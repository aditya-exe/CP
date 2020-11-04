import java.util.*;

public class CHEFGF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int T = sc.nextInt();
            int[] nums = new int[T];
            while (T-- > 0) {
                nums[T] = sc.nextInt();
            }
            System.out.println(Math.min(ascSort(nums), dcsSort(nums)));

        } catch (Exception ignored) {

        }
    }

    static int ascSort(int[] nums) {
        int n = nums.length;
        int swaps = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++)
                if (nums[j] > nums[j + 1]) {
                    // swap temp and arr[i]
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swaps++;
                }
        }
        return swaps;
    }

    static int dcsSort(int[] nums) {
        int n = nums.length;
        int swaps = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++)
                if (nums[j] < nums[j + 1]) {
                    // swap temp and arr[i]
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swaps++;
                }
        }
        return swaps;
    }
}
