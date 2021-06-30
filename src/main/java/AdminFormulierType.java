import java.util.ArrayList;
import java.util.Scanner;

public class AdminFormulierType implements Locatieformulier{
    @Override
    public void formuliertype() {
        Admin admin = new Admin();
        Scanner scanner = new Scanner(System.in);
        String bron = "admin";

        System.out.println("====================================");
        System.out.println("= VUL JE NIEUWE LOCATIEGEGEVENS IN =");
        System.out.println("====================================");

        System.out.println("Voeg nieuwe locatie naam");
        String location = scanner.nextLine();
        System.out.println("Voeg postcode");
        int postcode = scanner.nextInt();

        Locatie locatie = new Locatie(location, postcode, bron, "Nee");

        admin.checkMogelijkheid();
        System.out.println("is de locatie gecheckt? ja / nee");
        scanner.nextLine();
        String antwoord = scanner.nextLine();

        if (antwoord.equals("ja") || antwoord.equals("Ja")) {
            System.out.println("Bedankt! location gecheckt");
        } else {
            antwoord = "nee";
        }

        Locatie locatieObject = new Locatie();
        locatieObject.addlocatie(locatie, bron, antwoord);
    }

}
