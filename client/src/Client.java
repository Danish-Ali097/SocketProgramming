import java.net.*;
import java.io.*;
public class Client {
     public static void main(String args[])throws IOException {
		int Port = 4000;
		Socket soc = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		try
		{
			soc =new Socket("127.0.0.1",Port);
			dis = new DataInputStream(soc.getInputStream());
			dos = new DataOutputStream(soc.getOutputStream());
			dos.writeDouble(6);
			System.out.println(dis.readDouble());
		}
		catch(Exception e)
		{
			System.out.println("An exception occured : "+e.getMessage());
		}finally
		{
			dos.close();
			dis.close();
			soc.close();
		}
     }
}
