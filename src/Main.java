import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream; 
import javax.sound.sampled.AudioSystem; 
import javax.sound.sampled.Clip; 
import javax.sound.sampled.LineUnavailableException; 
import javax.sound.sampled.UnsupportedAudioFileException;

public class Main {
    public static void main(String[] args) throws UnsupportedOperationException ,IOException, LineUnavailableException, UnsupportedAudioFileException {
      Scanner scanner = new Scanner(System.in);
      File file = new File ("D:\\code it\\java_code\\src\\music.wav" );
      AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
      Clip clip = AudioSystem.getClip();
      clip.open(audioStream);
      String response = scanner.next();
      response =response.toLowerCase();
      
      while (!response.equals("Q")) {
         System.out.println("P = play , S = stop,R= reset ,Q = quit");
         System.out.println("enter your choice :");
         
         response = scanner.next();
         response = response.toLowerCase();
         switch (response) {
            case("p"): clip.start();
            break;
            default:System.out.println("not a valid response ");
         }
      }

      clip.start();

   }
}