package Lab4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program14 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the paragraph to store in file (delimiter is 2 times \\n)");
        String temp;

        StringBuilder a = new StringBuilder(scn.nextLine());
        temp = a.toString();
        while(temp.length() != 0) {
            a.append("\n");
            temp = scn.nextLine();
            a.append(temp);
        }

        try {
            FileWriter writerRef = new FileWriter("sample.txt");
            writerRef.write(a.toString());
            writerRef.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
