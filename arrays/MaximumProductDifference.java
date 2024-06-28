import java.util.Scanner;

public class MaximumProductDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements for list 1:");
        int n = sc.nextInt();

        int[] elements = new int[n];
        for(int i=0; i<n; i++) {
            elements[i] = sc.nextInt();
        }

        int maxProductDiff = findMaxProductDifference(elements);
        System.out.println("Max product difference : " + maxProductDiff);
    }

    private static int findMaxProductDifference(int[] nums) {
        int n = nums.length;

        if (n<5) {
            return -1;
        }
        int max=0, min=10001, secondMax=0, secondMin=10001;

        /*
        where max / min CANNOT be equal to secondMax / secondMin
        for(int i=0; i<n; i++) {
            if (nums[i] > max) {
                secondMax = max;
                max = nums[i];
            }
            if (nums[i] > secondMax && nums[i] < max) secondMax = nums[i];

            if (nums[i] < min){
                secondMin = min;
                min = nums[i];
            }
            if (nums[i] < secondMin && nums[i] > min) secondMin = nums[i];
        }

        // there is no second min / second max value
        if (secondMax == Integer.MIN_VALUE) secondMax = max;
        if (secondMin == Integer.MAX_VALUE) secondMin = min;

         */

        // where max / min can be equal to secondMax / secondMin
        for(int i=0; i<n; i++) {
            if (nums[i] < min) {
                secondMin = min;
                min = nums[i];
            } else if (secondMin > nums[i]) {
                secondMin = nums[i];
            }

            if (nums[i] > max) {
                secondMax = max;
                max = nums[i];
            } else if (secondMax < nums[i]) {
                secondMax = nums[i];
            }
        }

        return max*secondMax - min*secondMin;
    }
}
