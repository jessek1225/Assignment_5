public class SumTarget {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int k = 12;
        int[] result = sumTarget(arr, k);
        System.out.println("Start: " + result[0]);
        System.out.println("End: " + result[1]);
    }

    public static int[] sumTarget(int[] arr, int k) {
        int[] result = {-1, -1};
        if (arr == null || arr.length == 0) {
            return result;
        }

        int start = 0;
        int end = 0;
        int sum = arr[0];

        while (start < arr.length && end < arr.length) {
            if (sum == k) {
                result[0] = start;
                result[1] = end;
                return result;
            } else if (sum < k) {
                end++;
                if (end < arr.length) {
                    sum += arr[end];
                }
            } else {
                sum -= arr[start];
                start++;
            }
        }
        return result;
    }
}

