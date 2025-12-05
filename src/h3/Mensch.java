package h3;
/*
 Erstellen Sie im Repository ein Package h3 und fügen Sie diesem Package die Klasse H3_main
 hinzu, welche die main-Methode enthält. Sie dürfen die Attribute zu Beginn mit beliebigen
 Werten initialisieren.
 • Schreiben Sie eine öffentliche Klasse namens Mensch. Die Klasse hat die nicht sta
tischen, aber öffentlichen Attribute name (Typ: String), gebJahr und alter (Typ:
 int). Die Klasse hat weiterhin die nicht statischen, aber öffentlichen Methoden setName,
 setGebJahr und setAlter, sowie getName, getGebJahr und getAlter.
 • Die Methode setName erhält einen String als Übergabeparameter und hat keinen Rück
gabewert. Der übergebene String-Wert wird dem Attribut name zugewiesen.
 • Die Methode setGebJahr erhält einen int-Wert als Übergabeparameter und hat keinen
 Rückgabewert. Der übergebene Wert wird dem Attribut gebJahr zugewiesen. Es handelt
 sich hierbei um eine vierstellige Jahreszahl.
 • Die Methode setAlter hat keinen Übergabeparameter und void als Rückgabetyp und
 berechnet das aktuelle Alter (nur unter Berücksichtigung des vierstelligen Geburtsjahres)
 und weist das Ergebnis dem Attribut alter zu.
 • DieMethodegetNamehatkeinenÜbergabeparameter undals Rückgabewert einen String,
 und liefert den Wert von name zurück.
 5
• Die Methoden getGebJahr und getAlter haben keinen Übergabeparameter und liefern
 als Rückgabetyp ein int und den Wert der Attribute gebJahr bzw. alter.– Beispiel: Ein Objekt vom Typ Mensch kann den Namen Elsa erhalten, das Geburts
jahr 2010 und damit (weil wir im Jahr 2025 sind) das Alter 15.
 Hinweis:
 • Sie können davon ausgehen, dass gebJahr <= 2025 ist */
public class Mensch {
    public String name;
    public int gebJahr;
    public int alter;

    public void setName(String name) {
        this.name = name;
    }

    public void setGebJahr(int gebJahr) {
        this.gebJahr = gebJahr;
    }

    public void setAlter() {
        this.alter = 2025 - this.gebJahr;
    }

    public String getName() {
        return this.name;
    }

    public int getGebJahr() {
        return this.gebJahr;
    }

    public int getAlter() {
        return this.alter;
    }
}
