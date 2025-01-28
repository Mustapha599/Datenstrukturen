public class Knoten<T> {
    // Generische Klasse, die einen Knoten repräsentiert. Jeder Knoten speichert ein Element und zeigt auf einen Nachfolger.

    public T zeigeAuf; // Speichert das Objekt, auf das dieser Knoten zeigt (Dateninhalt des Knotens).
    private Knoten nachfolger; // Verweist auf den nächsten Knoten in der Kette.

    // Konstruktor: Initialisiert einen neuen Knoten mit dem angegebenen Objekt.
    public Knoten(T pZeigeAuf){
        zeigeAuf = pZeigeAuf; // Setzt das übergebene Objekt als Dateninhalt.
    }

    
    public Knoten getNachfolger(){
        return nachfolger; // Gibt den Verweis auf den nächsten Knoten zurück.
    }

    .
    public void setNachfolger(Knoten pNachfolger){
        this.nachfolger = pNachfolger; // Verbindet diesen Knoten mit dem übergebenen Nachfolger.
    }

    // Getter-Methode: Liefert das Objekt zurück, auf das dieser Knoten zeigt.
    public T getZeigeAuf(){
        return zeigeAuf; // Gibt den gespeicherten Dateninhalt 
