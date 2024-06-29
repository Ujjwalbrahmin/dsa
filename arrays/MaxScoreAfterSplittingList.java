import java.util.Scanner;

public class MaxScoreAfterSplittingList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String s = sc.nextLine();

        int maxScore = findMaxScoreAfterSplitting(s);
        System.out.println("Max Score after splitting are : " + maxScore);
    }

    private static int findMaxScoreAfterSplitting(String s) {
        int n = s.length();

        if (n<2) return -1;
        int lhs = s.charAt(0) == '0' ? 1: -1;
        int sum=0;
        for(char c: s.toCharArray()) {
            if (c == '1') sum++;
        }
        int rhs=sum;

        int max = lhs + rhs;
        for(int i=1; i<n-1; i++) {
            if (s.charAt(i) == '0') {
                lhs++;
            } else {
                rhs--;
            }

            sum = lhs+rhs;
            if (sum > max) max=sum;
        }

        return max;
    }
}
