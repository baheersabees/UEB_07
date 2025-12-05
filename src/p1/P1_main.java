package p1;

public class P1_main {
    
    public static void multFrac(int z1, int n1, int z2, int n2) {
        int zR = z1 * z2;
        int nR = n1 * n2;
        System.out.println("Result of multiplication: " + zR + ":" + nR);
    }

    public static void main(String[] args) {
        multFrac(5,2,3,4); // Example usage
    }
}
