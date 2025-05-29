import java.io.*;

public class Task1_FileHandler {
    public static void main(String[] args) {
        String filename = "task1_sample.txt";

        try {
            // Write to file
            FileWriter writer = new FileWriter(filename);
            writer.write("This is a sample file for Task 1.\nFile Handling Utility in Java.");
            writer.close();
            System.out.println("File written successfully.");

            // Read from file
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            System.out.println("Reading file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

            // Modify file (append)
            FileWriter appendWriter = new FileWriter(filename, true);
            appendWriter.write("\nAppended line: Task 1 complete.");
            appendWriter.close();
            System.out.println("File modified successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
