import jdk.jfr.ContentType;
public class list <A>{
    public A  first;
    public A last;
    public A current;
    private Node erster;
    public list(){

    }
//Einfuegen hinten
public void append(ContentType pC){
    Node hilfe = new Knoten(ContentType pC);
    if (first == null) {
        // Wenn die Warteschlange leer ist, wird der Kunde der erste
        erster = (Node) hilfe;
    } else {
        // Sonst zum letzten Kunden führen und den neuen anhängen
        Node aktueller = erster;

        while (aktueller.getNachfolger() != null) {  // Schleife läuft so lange, wie es einen Nachfolger gibt
            aktueller = aktueller.getNachfolger(); // Nachfolger wird zu aktueller
        }
        aktueller.setNachfolger(hilfe); // Mit aktueller.setNachfolger(pKnoten) wird der neue Knoten (pKnoten) als Nachfolger des letzten Knoten gesetzt.
    }
}
}
public void next(){

}
//Einfuegen zwischen
public void insert(ContentType pC){

}

public void toFirst(){

}
public void current(){

}
public void toLast(){

}
public void remove(){

    }
public boolean hasAccess(){

    return false;
}
public ContentType getContent(){

    return null;
}
public void setContent(ContentType pC){

}
}