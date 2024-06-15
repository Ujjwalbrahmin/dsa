import java.util.Scanner;

public class CheckIfSortedRotated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements :");
        int n = sc.nextInt();

        int[] elements = new int[n];
        for(int i=0; i<n; i++) {
            elements[i] = sc.nextInt();
        }

        boolean isSorted = checkIfSorted(elements);
        System.out.println("Is Sorted : " + isSorted);
    }

    private static boolean checkIfSorted(int[] nums) {
        int l = nums.length;

        if (l < 2) return true;

        if (nums[0] < nums[l-1]) {
            for (int i=1; i<l; i++) {
                if (nums[i-1] > nums[i]) return false;
            }
        } else {
            int nValueDropped = 0;
            for (int i=1; i<l; i++) {
                if (nums[i-1] > nums[i]) nValueDropped+=1;

                if (nValueDropped ==2) return false;
            }
        }

        return true;
    }
}