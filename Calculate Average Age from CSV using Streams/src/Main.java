import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IllegalAccessError, IOException {
        String filePath ="people.cvs";
        String textContent = """
                Name,Age
                Alice,30
                Bob,25
                Charlie,40
                David,35
                Ian,abc
                Eve,28
                """;
        try( FileWriter writer = new FileWriter(filePath)){
            writer.write(textContent);
            System.out.println("file has been created");

        }catch(IOException e){
            System.out.println("could not write to file");

        }

        try {
            double averageAge = CSVStreamProcessor.calculateAverageAge(filePath); // 📞 Call the method to get average
            System.out.println("Average age is: " + String.format("%.2f", averageAge)); // 🖨️ Print nicely
        } catch (IOException e) {
            // If there's a problem reading the file, show an error message
            System.out.println("Error reading file: " + e.getMessage());
        }


//   CSVStreamProcessor.calculateAverageAge("C:\\Users\\HP\\Documents\\java-projects\\Calculate Average Age from CSV using Streams\\people.cvs");
//        CSVStreamProcessor.calculateAverageAge(filePath);
}
}
