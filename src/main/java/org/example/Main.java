import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Stien til filen der skal læses
        String pathToFile = "randomNumbers.txt";
        File file = new File(pathToFile);

        // Opretter et array af ints af størrelse 100000
        int[] numbers = new int[100000];

        try {
            Scanner scanner = new Scanner(file);
            int index = 0;

            while (scanner.hasNextInt() && index < numbers.length) {
                // Læser et tal og gemmer det i arrayet på den aktuelle index
                numbers[index++] = scanner.nextInt();
            }
            scanner.close();

            // Viser de første par tal til demonstration (eller alle, hvis færre end 10)
            for (int i = 0; i < 1000; i++) {
                System.out.println(numbers[i]);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Filen blev ikke fundet: " + e.getMessage());
        }
    }
}
