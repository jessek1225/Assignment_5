public class RadixSort {
    static String[] a = {"gojo", "google", "jogo", "bill", "pup", "cipher",
            "watchmen", "knight", "it", "stand", "sandman", "hydra", "surtr"};

    public static void main(String[] args) {
        RadixSort rs = new RadixSort();
        rs.radixSortLexicon(a);
        for (String s : a) {
            System.out.println(s);
        }
    }

    public void radixSortLexicon(String[] arr) {
        int maxWordLength = 0;
        for (String s : arr) {
            if (s.length() > maxWordLength) {
                maxWordLength = s.length();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() < maxWordLength) {
                while (arr[i].length() < maxWordLength) {
                    arr[i] = arr[i] + " ";
                }
            }
        }

        for (int i = maxWordLength - 1; i >= 0; i--) {
            for (int j = 1; j < arr.length; j++) {
                String temp = arr[j];
                int k;
                for (k = j - 1; k >= 0 && temp.charAt(i) < arr[k].charAt(i); k--) {
                    arr[k + 1] = arr[k];
                }
                arr[k + 1] = temp;
            }
        }
    }
}

