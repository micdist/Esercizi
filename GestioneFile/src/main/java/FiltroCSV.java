import java.io.File;
import java.io.FilenameFilter;

public class FiltroCSV implements FilenameFilter {
    @Override
    public boolean accept(File dir, String name) {
        return name.toLowerCase().endsWith(".csv") && dir.equals(new File("C://Users/mdistefano/Desktop/"));
    }
}
