import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PR124linies {
    public static void main(String[] args) {
        File frasesMatrix = new File("./src/numeros.txt");
        String text ="";
        for(int i=0; i<10; ++i){
            text += Math.round(Math.random()*100)+"\n";
        }
        try{
            frasesMatrix.createNewFile();
            // Instanciem la classe FileWriter amb el segon paràmetre en false, així sobreescrivim  l'arxiu
            FileWriter fw = new FileWriter(frasesMatrix, false);
            fw.write(text);
            fw.close();
        }catch(IOException e){ e.printStackTrace();}
    }
}
