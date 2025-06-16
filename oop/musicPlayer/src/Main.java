import javax.sound.sampled.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // How to play audio with Java (.wav, .au, .aiff)

        String filePath = "src\\Pepa.wav";
        File file = new File(filePath);

        try (Scanner scanner = new Scanner(System.in);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)) {

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            System.out.println("no problems detected");

            String response = "";

            while (!response.equals("Q")) {

                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");
                System.out.println("Enter your choice: ");

                response = scanner.next().toUpperCase();

                switch(response) {
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid choice bruh");
                }
            }
        }

        catch (FileNotFoundException e) {
            System.out.println("Could not find the file.");
        }
        catch (LineUnavailableException e) {
            System.out.println("Unable to access audio resource");
        }
        catch (UnsupportedAudioFileException e) {
            System.out.println("Audio file is not supported oopisie :P");
        }
        catch (IOException e) {
            System.out.println("something went wrong, oops");
        }
        finally {
            System.out.println("bye!");

        }


    }

}
