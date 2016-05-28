/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploProfessor2SocketTCP;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 *
 * @author rebonatto
 */
public class Cliente {
    public static void main(String[] args) throws Exception{
        int porta = 2010;
        String host = new String("localhost");
        String msg = new String("Hello World !!!");
        String msgvolta = new String();
        
        System.out.println("Cliente Executando ...");
        Socket s = new Socket(host, porta);
        ObjectOutputStream vai = new ObjectOutputStream(s.getOutputStream());
        System.out.println("Enviou mensagem");
        vai.writeObject(msg);
        vai.flush();
        ObjectInputStream vem = new ObjectInputStream(s.getInputStream());
        msgvolta = (String) vem.readObject();
        System.out.println("Recebido do servidor: " + msgvolta);
        s.close();
    }
}
