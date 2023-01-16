import java.io.*;
import java.nio.Buffer;
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
            file = new File(file.getAbsolutePath());
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

    public static boolean scriviRiga(File file, String riga){
        boolean esito = false;
        BufferedWriter bw = null;
        if (riga.trim().isEmpty()){
            System.out.println("riga vuota");
            return esito;
        }

        try{
            if (!file.exists()){
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            //writes the input text trimmed of leading and trailing spaces
            bw.write(riga.trim());
            esito = true;
        }catch (IOException e){
            e.printStackTrace();
        }
        finally {
            try{
                if (bw!=null){
                    bw.close();
                }
            }catch (Exception ex){
                System.out.println("problemi chiusura bufferedWriter: " + ex);
            }
        }
        return esito;
    }

    public static String leggiRiga(File file){
        BufferedReader br = null;
        String riga = "";
        if (!file.exists()){
            System.out.println("file insesitente");
            return riga;
        }
        try{
            FileReader fr = new FileReader(file);
            br = new BufferedReader(fr);
            riga = br.readLine();
            if (riga==null || riga.trim().isEmpty()){
                System.out.println("niente da leggere");
                return " ";
            }

        }catch (IOException e){
           e.printStackTrace();
        }
        finally {
            try{
                if (br!=null){
                    br.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return riga;
    }

}
