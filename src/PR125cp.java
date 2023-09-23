import java.io.File;
import java.io.FileWriter;
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner;

public class PR125cp {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Introdueix el path del arxiu: ");
            String pathToCopy = sc.next();
            System.out.println("Introdueix el path destí(sense el nom del arxiu): ");
            String pathToPaste = sc.next();
            

            File fileOriginal = new File(pathToCopy);
            pathToPaste += File.separator+fileOriginal.getName();

            File fileCopy = new File(pathToPaste);
            if(!fileCopy.exists()){
                fileCopy.createNewFile();

                Scanner scFileOriginal = new Scanner(fileOriginal);
                FileWriter fw = new FileWriter(fileCopy, true);

                while(scFileOriginal.hasNextLine()){
                    fw.write(scFileOriginal.nextLine() +"\n");
                }
                fw.close();
                scFileOriginal.close();
            }else{System.out.println("The file already exist");}
            sc.close();
            

        }catch(IOException e) { e.printStackTrace(); }
    }
}
