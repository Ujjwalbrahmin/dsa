import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements :");
        int n = sc.nextInt();

        int[] elements = new int[n];
        for(int i=0; i<n; i++) {
            elements[i] = sc.nextInt();
        }

        System.out.println("Enter the Key to search :");
        int key = sc.nextInt();

        int idx = searchForElement(elements, key);
        System.out.println("Index of key :" + idx);
    }

    private static int searchForElement(int[] nums, int key) {
        int n = nums.length;

        for(int i=0; i<n; i++) {
            if (nums[i] == key) return i;
        }

        return -1;
    }
}
