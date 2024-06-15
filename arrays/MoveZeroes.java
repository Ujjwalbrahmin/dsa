import java.util.Scanner;

public class MoveZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements :");
        int n = sc.nextInt();

        int[] elements = new int[n];
        for(int i=0; i<n; i++) {
            elements[i] = sc.nextInt();
        }

        moveZeroesToEnd(elements);
    }

    private static void moveZeroesToEnd(int[] nums) {
        int n = nums.length;

        if (n < 2) return;

        for(int i=0;i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if (nums[i] == 0 && nums[j]!=0) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        for(int i=0; i<n; i++) {
            System.out.println(nums[i]);
        }
    }
}
