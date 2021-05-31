package Lab4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

public class Program16 {
    public static void main(String[] args) throws IOException {

        // Compression
        FileInputStream fileIn = new FileInputStream("sample.txt");
        FileOutputStream fileOut = new FileOutputStream("compressed");
        DeflaterOutputStream compressFile = new DeflaterOutputStream(fileOut);

        int data;
        while((data = fileIn.read()) != -1) {
            compressFile.write(data);
        }

        fileIn.close();
        compressFile.close();

        // Decompression
        FileInputStream fileDecompressionIn = new FileInputStream("compressed");
        FileOutputStream fileDecompressionOut = new FileOutputStream("output.txt");
        InflaterInputStream decompressedFile = new InflaterInputStream(fileDecompressionIn);

        while((data = decompressedFile.read()) != -1) {
            fileDecompressionOut.write(data);
        }

        decompressedFile.close();
        fileDecompressionIn.close();
    }
}
