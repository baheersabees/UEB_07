package h1;
/*
 Erstellen Sie im Repository ein Package h1 und fügen Sie diesem Package die Klasse H1_main
 hinzu, welche die main-Methode enthält. Sie dürfen die Attribute zu Beginn mit beliebigen
 Werten initialisieren.
 • Erstellen Sie die öffentliche Klasse Zahl. Diese Klasse hat die öffentlichen und nicht
 statischen Attribute even, small und positive (Typ: boolean) und num (Typ: int).
 • Zahl hat die folgenden öffentlichen und nicht statischen Methoden: setEven, setSmall
 und setPositive. Diese haben alle keinen Übergabeparameter und der Rückgabetyp ist
 void.
 • Wird setEven aufgerufen, erhält even genau dann den Wert true, wenn in num ein
 gerader Wert gespeichert ist. Zahlen gelten hier als gerade, wenn ihr Betrag durch 2
 teilbar ist. Somit sind also z.B.-16, 0 und 80 gerade.– ZurErinnerung (siehe Hinweise oben): Wenn setEven aufgerufen wird und num einen
 ungeraden Wert speichert, muss durch den Aufruf von setEven der Wert von even
 auf false gesetzt werden.
 • Wird setPositive aufgerufen, erhält positive genau dann den Wert true, wenn der
 Wert in num echt größer 0 ist.
 • Wird setSmall aufgerufen, erhält small genau dann den Wert true, falls der Wert in
 num echt kleiner als 100 ist
*/
public class Zahl {
    public boolean even;
    public boolean small;
    public boolean positive;
    public int num;

    public void setEven() {
        if (Math.abs(num) % 2 == 0) {
            even = true;
        } else {
            even = false;
        }
    }

    public void setSmall() {
        if (num < 100) {
            small = true;
        } else {
            small = false;
        }
    }

    public void setPositive() {
        if (num > 0) {
            positive = true;
        } else {
            positive = false;
        }
    }
}
