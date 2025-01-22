
    public class warteschlange<T> {
        private Kunde erster;  // Gib den ersten Kunden in der Warteschlange an



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
                erster = pKunde;
            } else {
                // Sonst zum letzten Kunden führenund den neuen anhängen
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
        public boolean gibLeer() {
            return erster == null;
        }
    }


