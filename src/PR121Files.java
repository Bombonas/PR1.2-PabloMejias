import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

public class PR121Files {
    public static void main(String[] args) {
        File myFiles = new File("./src/myFiles");

        // Netejem la carpeta
        if(myFiles.exists()){
            eraseAllFiles(myFiles);
        }

        // Creem carpeta
        myFiles.mkdir();
        System.out.println("Directory created.");

        try{
            // Creem els arxius
            File file1 = new File("./src/myFiles/File1.txt");
            file1.createNewFile();
            File file2 = new File("./src/myFiles/File2.txt");
            file2.createNewFile();
            System.out.println("File1.txt and File2.txt created.");
            
            // Renombrem el arxiu File2.txt
            file2.renameTo(new File("./src/myFiles/renamedFile.txt"));
            System.out.println("File2.txt renamed.");
            
            listDirectory(myFiles);
            
            file1.delete();

            listDirectory(myFiles);

        }catch(IOException e) { e.printStackTrace(); }
        
    }

    public static void listDirectory(File directory){
        // Mostrem arxius carpeta myFiles
        System.out.println("Els arxius de la carpeta són:");
        for (File file : directory.listFiles()) {
            System.out.println("\t->" + file.getName());
        }
    }

    public static void eraseAllFiles(File directory){
        for (File file : directory.listFiles()) {
            file.delete();
        }
        directory.delete();
    }
}
