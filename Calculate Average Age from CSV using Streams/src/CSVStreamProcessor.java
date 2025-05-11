import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class CSVStreamProcessor {

    public static double calculateAverageAge(String cvsFilePath) throws IOException {
        try (Stream<String> lines = Files.lines(Paths.get(cvsFilePath))) {
            return lines
//                   skip the first line(name,age)
                    .skip(1)
//                    split lines[ "name","age"]
                    .map(line -> {
                        String[] parts = line.split(",");
//                        try to convert age to num
                        try {
                            return Integer.parseInt(parts[1]);
                        } catch (NumberFormatException e) {
                            return null;
                        }
                    })
//                    remove invalid(null) age
                    .filter(age->age != null)
//                    turn it into astream of just numbers(age)
                    .mapToInt(Integer::intValue)
//                    calculate average
                    .average()
                    .orElse(0);
        }

    }

}
