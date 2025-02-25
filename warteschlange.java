public class warteschlange<T>{
    private Knoten erster;
    private Knoten letzter;
    /*
     * Konstruktor
     * Erstellt leere Queue
     */
    public warteschlange(){
        erster = null;
    }

    private Knoten gibLetzten(){
        return letzter;
    }

    /*
     * Gibt das erste Objekt der Queue zurück
     */
    public T gibErsten(){
        return (T)erster.getZeigeAuf();
    }
    /*
     * Ertfernt das erste Objekt aus der Queue
     */
    public void getErsten(){
        if( erster.getNachfolger()!= null){
            erster = erster.getNachfolger();
        }
    }
    /*
     * Fügt ein neues Element am Ende der Queue hinzu
     */

    public void enqueue (T pKunde) {
        Knoten neuerKnoten = new Knoten(pKunde);
        neuerKnoten.setNachfolger(null);
        if (letzter != null) {
            letzter.setNachfolger(neuerKnoten);
            letzter = neuerKnoten;

        } else {
            erster = neuerKnoten;
            letzter = neuerKnoten;
        }
    }

    public void dequeue() {
        Knoten aktuellerKunde = erster;
        if ( erster != null) {
            erster = aktuellerKunde.getNachfolger();
        }
    }
}