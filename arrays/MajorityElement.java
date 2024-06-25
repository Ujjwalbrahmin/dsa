import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements :");
        int n = sc.nextInt();

        int[] elements = new int[n];
        for(int i=0; i<n; i++) {
            elements[i] = sc.nextInt();
        }

        int element = searchForMajorityElement(elements);
        System.out.println("Missing Element is :" + element);
    }

    private static int searchForMajorityElement(int[] nums) {
        /*
        Approaches:
        1. Sort and at index n/2 majority element will be there
        2. Counter hash and if for any key value is n/2 return key
        3. Moore voting algorithm, works only for majority i.e., >= n/2 occurences
         */
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}
