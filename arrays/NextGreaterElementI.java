import java.util.Scanner;
import java.util.HashMap;

public class NextGreaterElementI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements :");
        int n = sc.nextInt();

        int[] set = new int[n];
        for(int i=0; i<n; i++) {
            set[i] = sc.nextInt();
        }

        System.out.println("Enter the number of elements :");
        n = sc.nextInt();

        int[] subSet = new int[n];
        for(int i=0; i<n; i++) {
            subSet[i] = sc.nextInt();
        }

        int[] result = findNextGreaterElement(set, subSet);
        for(int i: result) System.out.println(i);
    }

    private static int[] findNextGreaterElement(int[] set, int[] subSet) {
        int sl = set.length, ssl = subSet.length;
        int[] result = new int[ssl];

        if (sl < ssl) return result;

        HashMap<Integer, Integer> valIdxMap = new HashMap<Integer, Integer>();
        for(int i=0;i <sl; i++) {
            valIdxMap.put(set[i], i);
        }

        for(int i=0; i<ssl; i++) {
            int val = subSet[i];
            int idx = valIdxMap.get(val);

            int res = -1;
            while (idx < sl) {
                if (set[idx] > val) {
                    res = set[idx];
                    break;
                }
                idx++;
            }

            result[i] = res;
        }

        return result;
    }
}
