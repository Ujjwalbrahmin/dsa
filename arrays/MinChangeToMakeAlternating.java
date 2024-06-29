import java.util.Scanner;

public class MinChangeToMakeAlternating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String s = sc.nextLine();

        int count = findMinChangesForAlternating(s);
        System.out.println("Min Changes needed : " + count);
    }

    private static int findMinChangesForAlternating(String s) {
        int n = s.length();

        int first = 0;
        int second = 0;
        for(int i=0;i<n;i++) {
            if(i%2 == 0) {
                if(s.charAt(i) == '1') first++;
                else second++;
            } else {
                if(s.charAt(i) == '1') second++;
                else first++;
            }
        }
        return Math.min(first, second);
    }
}
