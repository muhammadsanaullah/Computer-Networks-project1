import java.io.*;
import java.net.*;
import java.util.*;


public class TextEditor{
 
 public static void main(String args[]) throws IOException
 {
  
  Scanner scanner = new Scanner(System.in);
  String ipaddress = args[0];
  int port = Integer.parseInt(args[1]);
  Socket socket = new Socket(ipaddress, port);
  InputStream inputStream = socket.getInputStream();
  InputStreamReader isr = new InputStreamReader(inputStream);
  BufferedReader reader = new BufferedReader(isr);
  PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
  
       
        System.out.print("\nEnter Username Command");
        String username = scanner.nextLine();
        writer.println(username);
        username = reader.readLine();
        System.out.println(username);

        if (username.equals("EXIT\r\n"))
        {
            writer.println("EXIT");
            isr.close();
            reader.close();
            writer.close();
            inputStream.close();
            socket.close();
        }

        if (!username.equals("USER bilkentstu\r\n"))
        {
            writer.println("EXIT");
            isr.close();
            reader.close();
            writer.close();
            inputStream.close();
            socket.close();
        }

        System.out.print("\nEnter Password:");
        String password = scanner.nextLine();
        writer.println(password);
        password = reader.readLine();
        System.out.println(password);

        if (password.equals("EXIT\r\n"))
        {
            writer.println("EXIT");
            isr.close();
            reader.close();
            writer.close();
            inputStream.close();
            socket.close();
        }

        
        if (!password.equals("PASS 421s2020\r\n"))
        {
            writer.println("EXIT");
            isr.close();
            reader.close();
            writer.close();
            inputStream.close();
            socket.close();
        }
  
 }
 

}
