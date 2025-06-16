import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        /*
        How to write a file using Java:

        FileWriter = good for small or medium-sized text files
        BufferedWriter = Better performance for large amounts of text
        PrintWriter = Best for structured data, like reports or logs
        FileOutputStream = Best for binary files (e.g., images, audio files)
         */

        String filePath = "C:\\Users\\leona\\Desktop\\test.txt";
        String textContent = """
                Roses are Red
                Violets are Blue
                Booty Booty BOOTY
                Rockin' Everywhere!
                """;

        try (FileWriter writer = new FileWriter(filePath);){
            writer.write(textContent);
            System.out.println("File has been written succexfully");
        }
        catch(FileNotFoundException e) {
            System.out.println("Could not locate file locations");
        }
        catch(IOException e) {
            System.out.println("Could not write file.");
        }


    }

}
