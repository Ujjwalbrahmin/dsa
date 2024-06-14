import java.util.Scanner;

public class SecondLargestAndSecondSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements :");
        int n = sc.nextInt();

        int[] elements = new int[n];
        for(int i=0; i<n; i++) {
            elements[i] = sc.nextInt();
        }

        printSecondLargestAndSmallest(elements);
    }

    /*
    This wont work if the items in arrays are itself MAX and MIN
     */
    public static void printSecondLargestAndSmallest(int[] e) {
        int l = e.length;

        if (l<2) return;

        int maxElem = Integer.MIN_VALUE, minElem = Integer.MAX_VALUE, secMinElem = Integer.MAX_VALUE, secMaxElem = Integer.MIN_VALUE;

        for(int i=0; i<l; i++) {
            if (e[i] > maxElem) {
                secMaxElem = maxElem;
                maxElem = e[i];
            }
            if (e[i] > secMaxElem && e[i] != maxElem)
                secMaxElem = e[i];

            if (e[i] < minElem) {
                secMinElem = minElem;
                minElem = e[i];
            }
            if (e[i] < secMinElem && e[i] != minElem)
                secMinElem = e[i];
        }

        if (secMaxElem == Integer.MIN_VALUE) return;
        if (secMinElem == Integer.MAX_VALUE) return;

        System.out.println("Largest : " + maxElem + " Second Largest : " + secMaxElem);
        System.out.println("Smallest : " + minElem + " Second Smallest : " + secMinElem);
    }
}
