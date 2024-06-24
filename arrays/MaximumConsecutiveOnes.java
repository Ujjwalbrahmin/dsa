import java.util.Scanner;

public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements :");
        int n = sc.nextInt();

        int[] elements = new int[n];
        for(int i=0; i<n; i++) {
            elements[i] = sc.nextInt();
        }

        int maxConsecutiveOnes = findMaxConsecutiveOnes(elements);
        System.out.println("Max consecutive ones are :" + maxConsecutiveOnes);
    }

    private static int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;

        int max=0, currentMax= 0;

        for(int i=0; i<n; i++) {
            if (nums[i] == 0) {
                currentMax = 0;
            } else {
                currentMax++;
            }

            if (currentMax > max) {
                max = currentMax;
            }
        }

        return max;
    }
}
