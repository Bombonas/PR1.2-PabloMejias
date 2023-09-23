import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class PR123append {
    public static void main(String[] args) {
        File frasesMatrix = new File("./src/frasesMatrix.txt");

        try{
            frasesMatrix.createNewFile();

            // Instanciem la classe FileWriter amb el segon paràmetre en true, així el que escrivim s'anirà al final de l'arxiu
            FileWriter fw = new FileWriter(frasesMatrix, true);

            fw.write("“Yo sólo puedo mostrarte la puerta\nTú eres quien la tiene que atravesar\n");
            fw.close();
        }catch(IOException e){ e.printStackTrace();}
    }
}
