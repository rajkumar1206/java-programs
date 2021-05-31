package Lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program15 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Enter the File name to read from");
        Scanner scn = new Scanner(System.in);

        String fileName = scn.next();
        if (fileName != null) {
            File fileReader = new File(fileName);
            if (fileReader.exists()) {
                Scanner fileScanner = new Scanner(fileReader);

                while (fileScanner.hasNextLine()) {
                    System.out.println(fileScanner.nextLine());
                }
            } else System.out.println("File not Found");
        }
    }
}
