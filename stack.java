public class stack <E> {
    private Knoten erster;
    public E getContent(){

        return null;
    }
    public void einfuegen(E content){
        Knoten hilfe = new Knoten(content);
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
}
public void remove(){

}
public boolean isEmpty(){
    return false;
}
}
--------------
    public void add(E content) {
        Node<E> newNode = new Node<>(content);// Erstellt einen neuen Knoten, der auf das aktuelle oberste Element zeigt
        newNode.setNextNode(erster);
        erster = newNode;

public E remove() {
        if (erster == null) {// Wenn der Stapel leer ist, wird null zurückgegebe
            return null;
        }
        E content = erster.getContent();// Inhalt des obersten Elements
        erster = erster.getNextNode();// Setzt das nächste Element als oberstes
        return content; // Gibt den entfernten Inhalt zurück

    
