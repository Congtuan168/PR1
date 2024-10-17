package tut06;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class FindWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String directory = "src"; //Có thể thay đổi đường dẫn folder

        System.out.print("Enter the word: ");
        String word = scanner.nextLine();

        try {
            searchWordInDirectory(directory, word);
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void searchWordInDirectory(String directory, String word) throws IOException {
        Path dirPath = Paths.get(directory);
        if (!Files.isDirectory(dirPath)) {
            System.out.println("Provided path is not a directory.");
            return;
        }

        boolean found = searchFiles(dirPath, word);
        if (!found) {
            System.out.printf("\"%s\" is not found in this directory!%n", word);
        }
    }

    private static boolean searchFiles(Path dir, String word) throws IOException {
        boolean found = false;

        // Traverse the directory
        for (Path path : Files.newDirectoryStream(dir)) {
            if (Files.isDirectory(path)) {
                // Recursive call for subdirectory
                found |= searchFiles(path, word);
            } else if (Files.isRegularFile(path)) {
                found |= searchInFile(path, word);
            }
        }

        return found;
    }

    private static boolean searchInFile(Path file, String word) throws IOException {
        boolean found = false;
        List<String> lines = Files.readAllLines(file);

        for (int lineNumber = 0; lineNumber < lines.size(); lineNumber++) {
            String line = lines.get(lineNumber);
            if (line.contains(word)) {
                System.out.printf("Found in %s at line %d%n", file, lineNumber + 1);
                found = true;
            }
        }

        return found;
    }
}
