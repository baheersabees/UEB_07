package h3;

public class H3_Main {
    public static void main(String[] args) {
        Mensch person = new Mensch();
        person.setName("Elsa");
        person.setGebJahr(2010);
        person.setAlter();

        System.out.println("Name: " + person.getName());
        System.out.println("Geburtsjahr: " + person.getGebJahr());
        System.out.println("Alter: " + person.getAlter());
    }
}
