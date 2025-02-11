public class listNode <A>{

        private A zeigeAuf;                             //Speichert das Objekt auf welches der Knoten zeigt
        private Node nachfolger;                      //Speichert den nachfolgenden Knoten

        public Node(A pZeigeAuf)
        {
            zeigeAuf = pZeigeAuf;
            nachfolger = null;
        }
        public Node getNachfolger()
        {
            return nachfolger;
        }
        public void setNachfolger(Node pNachfolger)
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

