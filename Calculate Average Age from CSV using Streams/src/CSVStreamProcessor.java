import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class CSVStreamProcessor {

    public static void calculateAverageAge( String cvsFilePath) throws IOException{
        try(Stream<String> lines = Files.lines(Path.of(cvsFilePath))){
            var stats = lines
                    .skip(1) // skip header
                    .map(line -> line.split(",")) // split into [Name, Age]
                    .filter(parts -> parts.length == 2)
                    .map(parts -> parts[1].trim()) // extract and trim age
                    .flatMapToInt(ageStr -> {
                        try {
                            return java.util.stream.IntStream.of(Integer.parseInt(ageStr));
                        } catch (NumberFormatException e) {
                            return java.util.stream.IntStream.empty(); // skip invalid age
                        }
                    })
                    .summaryStatistics();

            if (stats.getCount() > 0) {
                double avg = stats.getAverage();
                System.out.printf("Average Age: %.2f%n", avg);
            } else {
                System.out.println("No valid ages found.");
            }
        }

    }
}
