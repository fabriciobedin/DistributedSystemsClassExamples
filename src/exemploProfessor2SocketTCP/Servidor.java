/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploProfessor2SocketTCP;

import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author rebonatto
 */
public class Servidor {
    public static void main(String[] args) throws Exception{
        int porta = 2010;
        
        System.out.println("Servidor Executando");
        ServerSocket ss = new ServerSocket(porta);
        
        System.out.println("Aguardando Conexão ...");
        Socket s = ss.accept();
        ObjectInputStream vem = new ObjectInputStream(s.getInputStream());
        String msg = (String) vem.readObject();
        System.out.println("Recebido do Cliente: " + msg);
        ObjectOutputStream vai = new ObjectOutputStream(s.getOutputStream());
        vai.writeObject(msg.toUpperCase());
        s.close();
        ss.close();
    }
    
}
