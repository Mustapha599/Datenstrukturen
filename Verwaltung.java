import java.util.Scanner;

public class Verwaltung {
    private Scanner scanner;

    public static void main(String[] args) {
        new Verwaltung();
        System.out.println("Herzlich willkommen zu Zeichenketten-Verschlüsseler!");
    }

    public Verwaltung() {
        scanner = new Scanner(System.in);
        // Erstellen der Warteschlange mithilfe der List
        list<Kunde> warteschlange = new list<>();

        while (true) {
            System.out.println("== HAUPTMENÜ ==");
            System.out.println("[1] Hinzufügen");
            System.out.println("[2] Ersten Auslesen und Entfernen");
            System.out.println("[3] Gesamte Liste anzeigen");
            System.out.println("[4] Beenden");
            int option = scanner.nextInt();

            if (option == 1) {
                // Hinzufügen von Elementen zur Warteschlange
                System.out.println("Wie viele Kunden sollen hinzugefügt werden?");
                int anzahl = scanner.nextInt();
                scanner.nextLine(); // Zeilenumbruch nach nextInt() abfangen

                for (int i = 0; i < anzahl; i++) {
                    System.out.print("Name des Kunden #" + (i + 1) + ": ");
                    String name = scanner.nextLine();
                    Kunde neuerKunde = new Kunde(name);
                    warteschlange.einfuegen(neuerKunde); // Neuen Kunden ans Ende der Liste anhängen
                }
                System.out.println(anzahl + " Kunde(n) erfolgreich hinzugefügt!");

            } else if (option == 2) {
                // Ersten Kunden auslesen und entfernen
                if (!warteschlange.isEmpty()) {
                    warteschlange.toFirst(); // Gehe zum ersten Element
                    Kunde ersterKunde = warteschlange.getContent();
                    System.out.println("Erster Kunde: " + ersterKunde.getName());
                    warteschlange.remove(); // Entfernt den ersten Kunden aus der Liste
                } else {
                    System.out.println("Die Warteschlange ist leer.");
                }

            } else if (option == 3) {
                // Gesamte Warteschlange anzeigen
                if (!warteschlange.isEmpty()) {
                    System.out.println("Inhalt der Warteschlange:");
                    warteschlange.toFirst(); // Gehe zum ersten Element
                    while (list.hasAccess()) {
                        Kunde aktuellerKunde = list.getContent();
                        System.out.println("- " + aktuellerKunde.getName());
                        warteschlange.next(); // Zum nächsten Kunden gehen
                    }
                } else {
                    System.out.println("Die Warteschlange ist leer.");
                }

            } else if (option == 4) {
                // Programm beenden
                System.out.println("Programm wird beendet. Auf Wiedersehen!");
                break;

            } else {
                System.out.println("Ungültige Option. Bitte erneut versuchen.");
            }
        }

        scanner.close();
    }
}
