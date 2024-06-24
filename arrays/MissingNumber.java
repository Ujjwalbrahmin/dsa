import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements :");
        int n = sc.nextInt();

        int[] elements = new int[n];
        for(int i=0; i<n; i++) {
            elements[i] = sc.nextInt();
        }

        int element = searchForMissingElement(elements);
        System.out.println("Missing Element is :" + element);
    }

    private static int searchForMissingElement(int[] nums) {
        int n = nums.length;
        int actualSum = (n*(n+1))/2;
        int sum = 0;

        for(int i: nums) sum+=i;

        return actualSum - sum;
    }
}
