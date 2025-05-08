import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IllegalAccessError {
        String filePath ="people.cvs";
        String textContent = """
                Name,Age
                lice,30
                 Bob,25
                 Charlie,40
                 David,35
                 Eve,28
                """;
        try( FileWriter writer = new FileWriter(filePath)){
            writer.write(textContent);
            System.out.println("file has been created");

        }catch(IOException e){
            System.out.println("could not write to file");

        }
    }
}
