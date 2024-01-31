import java.util.Scanner;

public class Stoppuhr {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Stoppuhr gestartet. Drücken Sie 's' und Enter, um zu stoppen.");

        long startZeit = System.currentTimeMillis();

        // Warte auf die Eingabe des Benutzers
        while (!scanner.nextLine().equals("s")) {
            System.out.println("Ungültige Eingabe. Drücken Sie 's' und Enter, um zu stoppen.");
        }

        long endZeit = System.currentTimeMillis();

        // Berechne die verstrichene Zeit in Sekunden
        long verstricheneZeit = (endZeit - startZeit) / 1000;

        System.out.println("Stoppuhr gestoppt. Verstrichene Zeit: " + verstricheneZeit + " Sekunden.");

        scanner.close();
    }
}
