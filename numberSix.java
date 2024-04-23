import java.util.HashMap;

public class numberSix {

    public static String isSubset(int[] S, int[] T) {
        if (T.length == 0 || S.length > T.length) {
            return "No";
        } else if (S.length == 0) {
            return "Yes";
        }


        HashMap<Integer, Boolean> mapT = new HashMap<>();
        for (int num : T) {
            mapT.put(num, true);
        }


        for (int num : S) {
            if (!mapT.containsKey(num)) {
                return "No";
            }
        }

        return "Yes";
    }

    public static void main(String[] args) {
        int[] S1 = {32, 2};
        int[] T1 = {1, 2, 3, 52, 32, 54};
        System.out.println(isSubset(S1, T1)); // Output: Yes

        int[] S2 = {89, 32, 54, 32, 3};
        int[] T2 = {54, 32, 99};
        System.out.println(isSubset(S2, T2)); // Output: No

        int[] S3 = {0, 67};
        int[] T3 = {100, 5, 66, 2, 32, 90};
        System.out.println(isSubset(S3, T3)); // Output: No

        int[] S4 = {};
        int[] T4 = {54, 32, 99};
        System.out.println(isSubset(S4, T4)); // Output: Yes
    }
}
