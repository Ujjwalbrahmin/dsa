import java.util.Scanner;

public class LargestElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements :");
        int n = sc.nextInt();

        int[] elements = new int[n];
        for(int i=0; i<n; i++) {
            elements[i] = sc.nextInt();
        }

        int maxElem = getMaxElem(elements);
        System.out.println("Largest element in the list is : " + maxElem);
    }

    public static int getMaxElem(int[] e) {
        int l = e.length;

        if (l==0) return -1;
        if (l==1) return e[0];

        int maxElem = e[0];
        for(int i=1; i<l; i++) {
            if (e[i] > maxElem) maxElem = e[i];
        }

        return maxElem;
    }
}