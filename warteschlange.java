public class warteschlange<T> {
    // Gib den ersten Kunden in der Warteschlange an
    private Knoten erster;

    // Konstruktor
    public warteschlange() {
        erster = null;
    }

    // Rückgabe des ersten Kunden
    public T getErsten() {
        return (T)erster.getZeigeAuf(); //erster.getZeigeAuf();
    }

    // Setzen des ersten Kunden
    public void setErsten(Knoten pKnoten) {
        erster = pKnoten;
    }

    // Hinzufügen eines Knoten am Ende der Warteschlange
    public void einfuegen(T pInhalt) {
        Knoten hilfe = new Knoten(pInhalt);
        if (erster == null) {
            // Wenn die Warteschlange leer ist, wird der Kunde der erste
            erster = hilfe;
        } else {
            // Sonst zum letzten Kunden führen und den neuen anhängen
            Knoten aktueller = erster;

            while (aktueller.getNachfolger() != null) {  // Schleife läuft so lange, wie es einen Nachfolger gibt
                aktueller = aktueller.getNachfolger(); // Nachfolger wird zu aktueller
            }
            aktueller.setNachfolger(hilfe); // Mit aktueller.setNachfolger(pKnoten) wird der neue Knoten (pKnoten) als Nachfolger des letzten Knoten gesetzt.
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
    public boolean gibLeer() {
        return erster == null;
    }
}