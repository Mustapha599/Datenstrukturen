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
