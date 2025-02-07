public class stack <E> {
    private Knoten erster;
    private E content;
    public E getContent(){

        return content;
    }
    public void einfuegen(E content){
        Node<E> newNode = new Node(content);// Erstellt einen neuen Knoten, der auf das aktuelle oberste Element zeigt
        newNode.setNextNode(erster);
        erster = newNode;
    }

public void remove(){
    if (erster == null) {// Wenn der Stapel leer ist, wird null zurückgegebe
        return null;
    }
    E content = erster.getContent();// Inhalt des obersten Elements
    erster = erster.getNextNode();// Setzt das nächste Element als oberstes
    return content; // Gibt den entfernten Inhalt zurück
}
public boolean isEmpty(){
    return false;
}
}



    
