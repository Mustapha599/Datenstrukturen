public class Knoten<T> {
    public T zeigeAuf;                             //Speichert das Objekt auf welches der Knoten zeigt
    private Knoten nachfolger;                      //Speichert den nachfolgenden Knoten

    public Knoten(T pZeigeAuf){

        zeigeAuf = pZeigeAuf;
    }
    public Knoten getNachfolger(){
        return nachfolger;
    }
    public void setNachfolger(Knoten pNachfolger){

        this.nachfolger = pNachfolger;
    }
    public T getZeigeAuf(){

        return zeigeAuf;
    }
}

