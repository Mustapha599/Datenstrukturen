
    public class Kunde {
        private String name;       // Name des Kunden
        private Kunde nachfolger;  // nächster Kunden

        // Standardkonstruktor
        public Kunde() {
            name = "";
            nachfolger = null;
        }

        //
        public Kunde(String pName) {
            name = pName;
            nachfolger = null;
        }

        // Setzen des Nachfolgers
        public void setNachfolger(Kunde pKunde) {
            nachfolger = pKunde;
        }

        // Rückgabe des Nachfolgers
        public Kunde getNachfolger() {
            return nachfolger;
        }

        // Setzen des Namens
        public void setName(String pName) {
            name = pName;
        }

        // Rückgabe des Namens
        public String getName() {
            return name;
        }
    }


