import java.net.*;
import java.io.*;
public class Server {
    public static void main(String args[])throws IOException
    {
        int port = 4000;
        ServerSocket ss = null;
        Socket soc = null;
        DataInputStream dis = null;
        DataOutputStream dos = null;
        try
        {
             ss = new ServerSocket(port);
            while(true){
            soc = ss.accept();
            dis = new DataInputStream(soc.getInputStream());
            dos = new DataOutputStream(soc.getOutputStream());
            double x = dis.readDouble();
            x = 3.14*x*x;
            dos.writeDouble(x);}
            
        }
        catch(Exception e)
        {e.printStackTrace();}
        finally
        {
            dos.close();
            dis.close();
            soc.close();
        }
    }
}
