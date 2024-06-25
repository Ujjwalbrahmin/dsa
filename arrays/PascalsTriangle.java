import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        int n = sc.nextInt();

        List<List<Integer>> triangle = constructPascalTriangle(n);
        for (List<Integer> l: triangle) {
            System.out.println(l);
        }
    }

    private static List<List<Integer>> constructPascalTriangle(int n) {
        ArrayList<List<Integer>> pt = new ArrayList<List<Integer>>();

        pt.add(new ArrayList<Integer>());
        pt.get(0).add(0, 1);

        if (n==1) return pt;

        pt.add(new ArrayList<Integer>());
        pt.get(1).add(0, 1);
        pt.get(1).add(1, 1);

        if (n==2) return pt;

        // to make 0 indexed
        n--;
        for(int i=2; i<=n; i++) {
            pt.add(new ArrayList<Integer>());

            for (int j=0; j<=i; j++) {
                int x, y, sum=1;

                if (j!=0 && j!=i) {
                    sum = pt.get(i-1).get(j-1) + pt.get(i-1).get(j);
                }
                pt.get(i).add(j, sum);
            }
        }
        return pt;
    }
}
