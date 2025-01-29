import java.util.Scanner;



public class Verwaltung {
    private Scanner scanner;

    public static void main(String[] args) {

        new Verwaltung();
        System.out.println("Herzlich willkommen zu Zeichenketten verschluesselerer!");

    }
    public Verwaltung(){
        scanner = new Scanner(System.in);
        warteschlange warteschlange= new warteschlange();
        while (true) {
            System.out.println("== HAUPTMENÜ ==");
            System.out.println("[1]Hinzufuegen");
            System.out.println("[2]Ersten Auslesen");
            int option = scanner.nextInt();
            if(option==1) {
                System.out.println("Wie viele sollen hinzufügt werden ?");
                option = scanner.nextInt();

                Kunde hilf = new Kunde("Mustapha");
                warteschlange.einfuegen(hilf);
            }else if (option==2){
                System.out.println("------Kundenname---------- ");
                Kunde hilfe = (Kunde)warteschlange.getErsten();
                System.out.println(hilfe.getName());
                warteschlange.entfernen();
            }

        }
    }
}