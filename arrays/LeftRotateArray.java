import java.util.Scanner;

public class LeftRotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements :");
        int n = sc.nextInt();

        int[] elements = new int[n];
        for(int i=0; i<n; i++) {
            elements[i] = sc.nextInt();
        }

        System.out.println("Enter the Rotation factor K :");
        int k = sc.nextInt();

        rotateByK(elements, k);
    }

    private static void rotateByK(int[] nums, int k) {
        int l = nums.length, m=k;

        if (k >= l) m = k%l;

        reverseArray(nums, 0, m-1);
        reverseArray(nums, m, l-1);
        reverseArray(nums, 0, l-1);

        for(int i=0; i<l; i++) {
            System.out.println(nums[i]);
        }
    }

    private static void reverseArray(int[] nums, int startIdx, int endInx) {
        if (startIdx >= endInx) return;

        int temp;
        while (startIdx < endInx) {
            temp = nums[startIdx];
            nums[startIdx] = nums[endInx];
            nums[endInx] = temp;

            startIdx++;
            endInx--;
        }
    }
}
