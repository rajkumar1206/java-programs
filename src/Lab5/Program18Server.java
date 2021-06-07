import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Program18Server {
    public static void main(String args[]) throws Exception{
        ServerSocket serverSocket = new ServerSocket(6666);
        System.out.println("Server started");
        Socket socket = serverSocket.accept();
        System.out.println("Connection Established");
        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Stream started to listen on port 6666");

        String str="",str2="";
        while(!str.equals("stop")){
            str = dataInputStream.readUTF();
            System.out.println("client says: "+str);
            System.out.print("Type a message: ");
            str2 = bufferReader.readLine();
            dataOutputStream.writeUTF(str2);
            dataOutputStream.flush();
        }
        dataInputStream.close();
        socket.close();
        serverSocket.close();
    }
}
