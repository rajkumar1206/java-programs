package Lab3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Program12 {

    public void greet() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Hello Geeks");
    }

    public void read() throws FileNotFoundException {
        FileInputStream file = new FileInputStream("C://invalid.text");
    }

    public int divide(int a, int b) {
        if (b==0) throw new ArithmeticException("Cannot do divide by zero");
        return a/b;
    }

    public static void main(String[] args) {
        System.out.println("Illustrating throw and throws in java");
        Program12 pg = new Program12();

        // Illustration of Divide by Zero
        try{
            int res = pg.divide(1, 0);
            System.out.println(res);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        // Illustrating InterruptedException
        try {
            pg.greet();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        // Reading invalid file
        try {
            pg.read();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
