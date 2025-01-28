
    public class warteschlange <T>{
        private Kunde erster;// Gib den ersten Kunden in der Warteschlange an
        private Knoten erster;



        // Konstruktor
        public warteschlange() {
            erster = null;
        }

        // Rückgabe des ersten Kunden
        public Kunde getErsten() {
            return erster;
        }

        // Setzen des ersten Kunden
        public void setErsten(Kunde pKunde) {
            erster = pKunde;
        }

        // Hinzufügen eines Kunden am Ende der Warteschlange
        public void einfuegen(Kunde pKunde) {
            if (erster == null) {
                // Wenn die Warteschlange leer ist, wird der Kunde der erste
                erster = T  pKunde;




            } else {
                // Sonst zum letzten Kunden führen und den neuen anhängen
                Kunde aktueller = erster;

                while (aktueller.getNachfolger() != null) {  // Schleife läuft so lange, wie es einen Nachfolger gibt
                    aktueller = aktueller.getNachfolger(); // Nachfolger wird zu aktueller
                }
                aktueller.setNachfolger(pKunde); // Mit aktueller.setNachfolger(pKunde) wird der neue Kunde (pKunde) als Nachfolger des letzten Kunden gesetzt.
            }
        }

        // Entfernen des ersten Kunden aus der Warteschlange
        public void entfernen() {
            if (erster != null) {
                // Der Nachfolger des ersten Kunden wird der neue erste
                erster = erster.getNachfolger();
            }
        }

        // Überprüfen, ob die Warteschlange leer ist
        public boolean gibLeer() 

            return erster == null;
        }
    }

———————————————————————————————————————————————————————————————————————
public class Warteschlange<T> {
    private Knoten<T> erster; // Erster Knoten in der Warteschlange

    // Konstruktor: Erstellt eine leere Warteschlange
    public Warteschlange() {
        erster = null;
    }

    // Gibt das erste Element in der Warteschlange zurück (ohne es zu entfernen)
    public T gibErsten() {
        if (erster == null) {
            return null; // Warteschlange ist leer
        }
        return erster.getZeigeAuf();
    }

    // Entfernt das erste Element aus der Warteschlange
    public void entfernen() {
        if (erster != null) {
            erster = erster.getNachfolger(); // Nächster Knoten wird der erste
        }
    }

    // Fügt ein neues Element am Ende der Warteschlange hinzu
    public void einfuegen(T pObjekt) {
        Knoten<T> neuerKnoten = new Knoten<>(pObjekt); // Neuer Knoten wird erstellt
        neuerKnoten.setNachfolger(null); // Neuer Knoten hat keinen Nachfolger

        if (erster == null) {
            erster = neuerKnoten; // Neuer Knoten wird der erste, wenn Warteschlange leer
        } else {
            Knoten<T> aktueller = erster; // Start bei erstem Knoten
            while (aktueller.getNachfolger() != null) {
                aktueller = aktueller.getNachfolger(); // Gehe zum letzten Knoten
            }
            aktueller.setNachfolger(neuerKnoten); // Neuer Knoten wird am Ende hinzugefügt
        }
    }

    // Überprüft, ob die Warteschlange leer ist
    public boolean istLeer() {
        return erster == null; // Gibt true zurück, wenn Warteschlange leer
    }
}
