
public class list <A> {

    public Node last;
    public Node current;
    public Node first;

    public list() {
        first = null;
        current = null;
        last = null;
    }

    //Einfuegen hinten
    public void append(A pContent) {
        Node hilfe = new Node(pContent);
        if (first == null) {
            // Wenn die Warteschlange leer ist, wird der Kunde der erste
            first = (Node) hilfe;
        } else {
            // Sonst zum letzten Kunden führen und den neuen anhängen
            Node aktueller = first;

            while (aktueller.getNachfolger() != null) {  // Schleife läuft so lange, wie es einen Nachfolger gibt
                aktueller = aktueller.getNachfolger(); // Nachfolger wird zu aktueller
            }
            aktueller.setNachfolger(hilfe); // Mit aktueller.setNachfolger(pKnoten) wird der neue Knoten (pKnoten) als Nachfolger des letzten Knoten gesetzt.
        }
    }

    public void next() {

    }

    //Einfuegen zwischen
    public void insert(A) {

    }

    public void toFirst() {
        if (first != null) {
            first = hilfe;
        } else {
            if (first == null) {
                first =
            }
        }
        public void current () {

        }
        public void toLast () {

        }
        public void remove () {

        }
        public boolean hasAccess () {

            return false;
        }
        public A getContent () {

            return null;
        }
        public void setContent (A pC){

        }
    }
}