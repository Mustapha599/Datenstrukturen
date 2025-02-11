public class listNode <A>{

        private A zeigeAuf;                             //Speichert das Objekt auf welches der Knoten zeigt
        private Knoten nachfolger;                      //Speichert den nachfolgenden Knoten

        public listNode(A pZeigeAuf)
        {
            zeigeAuf = pZeigeAuf;
            nachfolger = null;
        }
        public Knoten getNachfolger()
        {
            return nachfolger;
        }
        public void setNachfolger(Konten pNachfolger)
        {
            this.nachfolger = pNachfolger;
        }
        public A getZeigeAuf()
        {
            return zeigeAuf;
        }

    public void setNextNode(Knoten erster) {
    }
}

