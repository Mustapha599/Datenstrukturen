public class Getraenk {

    private String name;
    private int preis;

    // Konstruktor mit einem Parameter
    public Getraenk(String pName) {
        name = pName;
        preis = 5; // Standardpreis setzen
    }

    // Konstruktor mit zwei Parametern
    public Getraenk(String pName, int pPreis) {
        name = pName;
        preis = pPreis;
    }

    public String getName() {
        return name;
    }

    public int getPreis() {
        return preis;
    }
}
