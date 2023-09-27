import java.io.File;
import java.io.FileWriter;
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner;

public class PR125cp {
    public static void main(String[] args, Scanner sc) {
        try{
            System.out.println("Introdueix el path del arxiu: ");
            String pathToCopy = sc.next();
            System.out.println("Introdueix el path destí(sense el nom del arxiu): ");
            String pathToPaste = sc.next();
            

            File fileOriginal = new File(pathToCopy);
            pathToPaste += File.separator+fileOriginal.getName();

            File fileCopy = new File(pathToPaste);
            if(!fileCopy.exists()){
                fileCopy.createNewFile();

                FileWriter fw = new FileWriter(fileCopy, true);
                Scanner fr = new Scanner(fileOriginal);

                while(fr.hasNextLine()){
                    fw.write(fr.nextLine() +"\n");
                }
                fr.close();
                fw.close();

            }else{System.out.println("The file already exist");}
            sc.nextLine();
        }catch(IOException e) { e.printStackTrace(); }
    }
}
