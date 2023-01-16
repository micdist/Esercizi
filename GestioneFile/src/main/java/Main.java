import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        boolean outcome = false;
        outcome = GestoreFile.creaFile(new File("C://Users/mdistefano/Desktop/fileTxt1.txt"));
        System.out.println("esito 1: " + outcome);
        outcome = GestoreFile.creaFile(new File("C://Users/mdistefano/Desktop/fileTxt2.txt"));
        System.out.println("esito 2: " + outcome);
        outcome = GestoreFile.creaFile(new File("C://Users/mdistefano/Desktop/fileCsv1.csv"));
        System.out.println("esito 3: " + outcome);

        GestoreFile.cancellaFile("C://Users/mdistefano/Desktop/");

        outcome = GestoreFile.scriviRiga(new File("C://Users/mdistefano/Desktop/fileTxt1.txt")," ciao ciao con spazi      ");
        System.out.println("esito 4: " + outcome);



    }
}