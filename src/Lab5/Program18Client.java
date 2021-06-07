import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Program18Client {
    public static void main(String args[]) throws Exception {
        Socket socket = new Socket("localhost",6666);
        System.out.println("Socket conn made");
        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Started listening stream");

        String str1 = "", str2 = "";
        while(!str1.equals("stop")){
            System.out.print("Type a message: ");
            str1 = bufferReader.readLine();
            dataOutputStream.writeUTF(str1);
            dataOutputStream.flush();
            str2 = dataInputStream.readUTF();
            System.out.println("Server says: " + str2);
        }

        dataOutputStream.close();
        socket.close();
    }
}
