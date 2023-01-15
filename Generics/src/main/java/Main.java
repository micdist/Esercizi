import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    //jesus wept commit3
    public static void main(String[] args) {

        System.out.println("\n");
        SalutoMaschile pino = new SalutoMaschile("Pino");

        SalutoFemminile gina = new SalutoFemminile("Gina");

        pino.saluta();
        gina.saluta();

    }
}