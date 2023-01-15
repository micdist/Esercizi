import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    //jesus wept commit3
    public static void main(String[] args) {
        Generics<Integer> generico1 = new Generics<>(10);
        System.out.println(generico1.getObject());
        Generics<String> generico2 = new Generics<>("stringa");
        System.out.println(generico2.getObject());


    }
}