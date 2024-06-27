import java.util.Scanner;
import java.util.HashMap;
import java.lang.StringBuilder;

public class IsoMorphicStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String: s");
        String s = sc.nextLine();

        System.out.println("Enter the String: t");
        String t = sc.nextLine();

        boolean isIsomorphic = checkIfIsoMorphic(s, t);
        System.out.println("Is isomprphic : " +  isIsomorphic);
    }

    public static boolean checkIfIsoMorphic(String s, String t) {
        int sl = s.length(), tl = t.length();

        if (sl != tl) return false;
        if (sl == 0) return false;

        StringBuilder sb = new StringBuilder();
        HashMap<Character , Character > map = new HashMap<Character , Character >();

        for(int i=0; i<sl; i++) {
            char ci = s.charAt(i);
            if (map.containsKey(ci)) {
                sb.append(map.get(ci));
            } else {
                char cj = t.charAt(i);
                map.put(ci, cj);
                sb.append(cj);
            }
        }

        return t.equals(sb.toString());
    }
}