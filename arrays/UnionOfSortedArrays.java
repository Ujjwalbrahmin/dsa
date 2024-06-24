import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedHashSet;

public class UnionOfSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements of list 1 :");
        int n = sc.nextInt();

        int[] list1 = new int[n];
        for (int i = 0; i < n; i++) {
            list1[i] = sc.nextInt();
        }

        System.out.println("Enter the number of elements of list 2 :");
        n = sc.nextInt();

        int[] list2 = new int[n];
        for (int i = 0; i < n; i++) {
            list2[i] = sc.nextInt();
        }

        ArrayList<Integer> result = unionArrays(list1, list2);

        System.out.println("Result : ");
        for (Integer element : result) {
            System.out.println(element);
        }
    }

    private static ArrayList<Integer> unionArrays(int[] list1, int[] list2) {
        int l1= list1.length, l2 = list2.length;
        LinkedHashSet<Integer> result = new LinkedHashSet<>();
        int i=0, j=0;

        while (i<l1 && j<l2) {
            if (list1[i] == list2[j]) {
                result.add(list1[i]);
                i++;
                j++;
            } else if (list1[i] < list2[j]) {
                result.add(list1[i]);
                i++;
            } else {
                result.add(list2[j]);
                j++;
            }
        }

        while(i < l1) {
            result.add(list1[i]);
            i++;
        }
        while(j < l2) {
            result.add(list2[j]);
            j++;
        }

        return new ArrayList<Integer>(result);
    }
}