import java.util.Scanner;

public class CanPlaceFlowers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements :");
        int n = sc.nextInt();

        int[] elements = new int[n];
        for(int i=0; i<n; i++) {
            elements[i] = sc.nextInt();
        }

        System.out.println("Enter number of flowers to pot :");
        int pots = sc.nextInt();

        boolean canPlace = placeFlower(elements, pots);
        System.out.println("Can place Flowers : " + canPlace);
    }

    private static boolean placeFlower(int[] nums, int pots) {
        int n = nums.length;

        if (pots == 0) return true;
        if (pots-1 > n/2) return false;

        for(int i=0; i<n; i++) {
            if (nums[i] == 0) {
                int lhs = i==0 ? 0 : nums[i-1];
                int rhs = i==n-1 ? 0 : nums[i+1];

                if (lhs == 0 && rhs == 0) {
                    nums[i] = 1;
                    pots--;
                }
            }
            if (pots == 0) return true;
        }

        return pots==0;
    }
}
