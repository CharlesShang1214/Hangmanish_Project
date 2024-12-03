import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//https://www.geeksforgeeks.org/files-class-readstring-method-in-java-with-examples/
public class PharseGetter {
    public static void main(String[] args) {
        Path filePath = Paths.get("wordbank.txt");
        try

        {
            String content = Files.readString(filePath);
            int num = (int) (Math.random() * 98) + 1;
            String dotNum = String.valueOf(num) + ". ";
            String pharse = content.substring(content.indexOf(dotNum), content.indexOf(":"));
            System.out.println(pharse);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
