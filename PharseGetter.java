import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

//https://www.geeksforgeeks.org/files-class-readstring-method-in-java-with-examples/
public class PharseGetter {
    public static void main(String[] args) {
        Path filePath = Paths.get("wordbank.txt");
        try

        {
            String content = Files.readString(filePath);
            // // int num = (int) ((Math.random() * 98) + 1);
            // // math.random doesnt work for some reason
            Random rand = new Random();
            int num = rand.nextInt((98) + 1) + 1;

            String dottedNum = String.valueOf(num) + ". ";
            String dottedNumPlusOne = String.valueOf(num + 1) + ". ";
            String pharse = content.substring(content.indexOf(dottedNum), content.indexOf(dottedNumPlusOne));
            String phraseDefinition = pharse.substring(pharse.indexOf(".") + 1);
            String actualPharse = pharse.substring(pharse.indexOf(".") + 1, pharse.indexOf(":"));
            System.out.print("\033[H\033[2J");
            System.out.flush();
            // https://stackoverflow.com/questions/2979383/how-to-clear-the-console-using-java
            System.out.println(pharse);
            System.out.println(actualPharse);
            System.out.println(phraseDefinition);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}