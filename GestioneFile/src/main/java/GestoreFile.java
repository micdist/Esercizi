import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GestoreFile {

    /**
     * static so there's no need to instantiate class
     * @param file
     */
    public static boolean  creaFile(File file){
        boolean dirOutcome = false;
        if (!file.getParentFile().isDirectory()) {
            System.out.println("directory non esistente: " + file.getParentFile().toString());
            dirOutcome = creaDirectory(file.getParentFile());
        } else {
            System.out.println("la directory esiste: " + file.getParentFile().toString());
            File newFile = new File(file.getAbsolutePath());
        }
        try{
            file.createNewFile();
            dirOutcome = true;
        }catch (IOException e){
            e.printStackTrace();
        }
        return dirOutcome;
    }

    /**
     * static because caller is static
     * @param dir
     * @return
     */
    private static boolean creaDirectory(File dir){
      return (dir.mkdir());
    }

    public static void cancellaFile(String dir){
        File[] allFiles = new File(dir).listFiles(new FiltroCSV());
        for (File file : allFiles){
            new File(file.getAbsoluteFile().toString()).delete();
        }
    }

}
