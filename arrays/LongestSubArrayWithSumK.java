import java.util.Scanner;
import java.util.HashMap;

public class LongestSubArrayWithSumK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements :");
        int n = sc.nextInt();

        int[] elements = new int[n];
        for(int i=0; i<n; i++) {
            elements[i] = sc.nextInt();
        }

        System.out.println("Enter the value of K");
        int k = sc.nextInt();

        int longestSubarray = findLongestSubarrayWithSumK(elements, elements.length, k);
        System.out.println("Longest subarray with sum K is : " + longestSubarray);
    }

    private static int findLongestSubarrayWithSumK(int[] arr, int n, int k) {
        if (n==0) return 0;

        if (n==1) {
            return arr[0]==k ? 1:0;
        }

        int currSum = 0, maxLen = 0;
        HashMap<Integer,Integer> hm = new HashMap<>(); // sum, index
        // k=0; arr = [-2 1 1] then we will get 0 in the prefix sum but we have not encountered 0
        hm.put(0, -1);

        for(int i = 0; i<n; i++) {
            currSum += arr[i];
            int reqSum = currSum-k; // currSum - target
            if(!hm.containsKey(currSum))
                hm.put(currSum, i);

            if(hm.containsKey(reqSum)) {
                maxLen = Math.max(maxLen, i-hm.get(reqSum));
                continue;
            }
        }

        return maxLen;
    }
}
