package h1;

public class H1_Main {
    public static void main(String[] args) {
        Zahl zahl = new Zahl();
        zahl.num = 42; // Beispielwert, kann beliebig geändert werden

        zahl.setEven();
        zahl.setSmall();
        zahl.setPositive();

        System.out.println("Nummer: " + zahl.num);
        System.out.println("Ist gerade: " + zahl.even);
        System.out.println("Ist klein: " + zahl.small);
        System.out.println("Ist positiv: " + zahl.positive);
    }
}
