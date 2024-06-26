import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements :");
        int n = sc.nextInt();

        int[] elements = new int[n];
        for(int i=0; i<n; i++) {
            elements[i] = sc.nextInt();
        }

        System.out.println("Enter the value to be removed :");
        int val = sc.nextInt();

        int nonValElements = removeElementsInPlace(elements, val);
        System.out.println(nonValElements);

        for(int i=0; i<elements.length; i++) {
            System.out.println(elements[i]);
        }
    }

    private static int removeElementsInPlace(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
