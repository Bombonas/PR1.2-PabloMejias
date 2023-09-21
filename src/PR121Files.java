import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class PR121Files {
    public static void main(String[] args) {
        File myFiles = new File("./src/myFiles");
        myFiles.mkdir();
        System.out.println("Directory created.");

        try{
            File file1 = new File("./src/myFiles/File1.txt");
            file1.createNewFile();
            File file2 = new File("./src/myFiles/File2.txt");
            file2.createNewFile();
            System.out.println("file1.txt and file2.txt created.");
            
            file2.renameTo(new File("./src/myFiles/renamedFile.txt"));
            System.out.println("file2.txt renamed created.");

        }catch(IOException e) { e.printStackTrace(); }
        
    }
}
