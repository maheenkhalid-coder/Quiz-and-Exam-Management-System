
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.net.*;
import java.io.*;
public class helpStudentClient {

    public static void main (String[] args) throws UnknownHostException, IOException {
        
        Socket s = new Socket("localhost", 90);
        System.out.println("Client Program start");
        
       // DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
       // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String a =  "We will reach you soon. Please send your queries to our email address.";
        dout.writeUTF(a);
    }
}

    

