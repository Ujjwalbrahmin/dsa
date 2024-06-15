import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements :");
        int n = sc.nextInt();

        int[] elements = new int[n];
        for(int i=0; i<n; i++) {
            elements[i] = sc.nextInt();
        }

        int uniques = removeDuplicate(elements);
        System.out.println("Unique number of elements :" + uniques);
    }

    private static int removeDuplicate(int[] nums) {
        int n = nums.length;

        if (n < 2) return n;

        int idx=1;
        for(int i=1; i<n; i++) {
            if (nums[i-1] != nums[i]) {
                nums[idx] = nums[i];
                idx++;
            }
        }

        for (int i=0; i<n ;i++) {
            System.out.println(nums[i]);
        }
        return idx;
    }
}
