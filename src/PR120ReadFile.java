import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PR120ReadFile {
    public static void main(String[] args) {
        int lines = 0;
        Scanner sc;
        File file = new File("./src/PR120ReadFile.java");
        try {
            sc = new Scanner(file);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(lines + ": " + line);
                lines++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
