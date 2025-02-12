
public class listNode<A> {
    private A zeigeAuf; // Speichert das Objekt auf welches der Knoten zeigt
    private listNode<A> nachfolger; // Speichert den nachfolgenden Knoten

    public listNode(A pZeigeAuf) {
        this.zeigeAuf = pZeigeAuf;
        this.nachfolger = null;
    }

    public listNode<A> getNachfolger() {
        return nachfolger;
    }

    public void setNachfolger(listNode<A> pNachfolger) {
        this.nachfolger = pNachfolger;
    }

    public A getZeigeAuf() {
        return zeigeAuf;
    }

    public void setZeigeAuf(A pZeigeAuf) {
        this.zeigeAuf = pZeigeAuf;
    }
}