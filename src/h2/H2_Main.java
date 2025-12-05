package h2;

public class H2_Main {
    public static int[] change(int[] a, int[] b, int start, int end) {
        if (end > start) {
            if (java.util.Arrays.compare(a, b) != 0) {
                return java.util.Arrays.copyOf(a, a.length);
            } else {
                java.util.Arrays.sort(a);
                return java.util.Arrays.copyOfRange(a, start, end);
            }
        } else {
            return new int[0];
        }
    }

    public static void main(String[] args) {
        
        int[] result1 = change(new int[]{2, 7, 1, 9}, new int[]{5, 6, 7}, 2, 4);
        System.out.println(java.util.Arrays.toString(result1)); // Ausgabe: [2, 7, 1, 9]

        int[] result2 = change(new int[]{2, 7, 1, 9}, new int[]{2, 7, 1, 9}, 2, 4);
        System.out.println(java.util.Arrays.toString(result2)); // Ausgabe: [7, 9]

        int[] result3 = change(new int[]{2, 7, 1, 9}, new int[]{2, 7, 1, 9}, 3, 2);
        System.out.println(java.util.Arrays.toString(result3)); // Ausgabe: []
    }
}
