
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Task7 {
    public void run() {
        String filePath = "C:\\Users\\Owner\\Downloads\\bigbootylatinas.txt";
        try {
            int bullCount = searchForBull(filePath);
            if (bullCount > 0) {
                System.out.println("The word 'bull' was found " + bullCount + " times in the file.");
            } else {
                System.out.println("The word 'bull' wasmt in the file");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file ");
        }
    }

    public static int searchForBull(String filePath) throws IOException {
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.equalsIgnoreCase("bull")) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}


