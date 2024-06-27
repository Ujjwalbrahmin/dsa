import java.util.Scanner;

public class PivotElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements :");
        int n = sc.nextInt();

        int[] elements = new int[n];
        for(int i=0; i<n; i++) {
            elements[i] = sc.nextInt();
        }

        int pivotIdx = findPivotIndex(elements);
        System.out.println("Pivot Index : " + pivotIdx);
    }

    private static int findPivotIndex(int[] nums) {
        int n = nums.length;

        if (n==1) {
            return nums[0]==0 ? 0: -1;
        }

        int i=0, j=n-1, lhs=0, rhs=0;
        if (nums[i] > nums[j]) {
            rhs+= nums[j];
            j--;
        } else {
            lhs+=nums[i];
            i++;
        }

        while (i < j) {
//            System.out.println(i + " " + j + " " + lhs + " " + rhs);
            if (lhs == rhs && j-i == 1) return ++i;

            if (lhs > rhs) {
                rhs+= nums[j];
                j--;
            } else {
                lhs+=nums[i];
                i++;
            }
        }

        return lhs==rhs ? i: -1;
    }
}
