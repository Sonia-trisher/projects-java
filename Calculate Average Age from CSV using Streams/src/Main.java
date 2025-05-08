import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IllegalAccessError, IOException {
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

//   CSVStreamProcessor.calculateAverageAge("C:\\Users\\HP\\Documents\\java-projects\\Calculate Average Age from CSV using Streams\\people.cvs");
        CSVStreamProcessor.calculateAverageAge(filePath);
}
}
