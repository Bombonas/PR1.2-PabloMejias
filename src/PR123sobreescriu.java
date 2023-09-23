import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PR123sobreescriu {
    public static void main(String[] args) {
        File frasesMatrix = new File("./src/frasesMatrix.txt");

        try{
            frasesMatrix.createNewFile();

            // Instanciem la classe FileWriter amb el segon paràmetre en false, així sobreescrivim  l'arxiu
            FileWriter fw = new FileWriter(frasesMatrix, false);

            fw.write("“Yo sólo puedo mostrarte la puerta\nTú eres quien la tiene que atravesar\n");
            fw.close();
        }catch(IOException e){ e.printStackTrace();}
    }
}
