import java.util.Scanner;

public class MedewerkerFormulierType implements Locatieformulier {

    public void formuliertype() {
        Medewerker medewerker = new Medewerker();
        Locatie locatieObject =  new Locatie();
        Scanner scanner = new Scanner(System.in);
        String bron = "medewerker";

        System.out.println("====================================");
        System.out.println("= VUL JE NIEUWE LOCATIEGEGEVENS IN =");
        System.out.println("====================================");


        System.out.println("Voeg nieuwe locatie naam");
        String location = scanner.nextLine();
        System.out.println("Voeg postcode");
        int postcode = scanner.nextInt();

        Locatie locatie = new Locatie(location, postcode, bron, "Nee");
        medewerker.checkMogelijkheid();
        String antwoord = "nee";
        locatieObject.addlocatie(locatie, bron, antwoord);
    }

}


