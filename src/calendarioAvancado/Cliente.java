/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendarioAvancado;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import javax.swing.JOptionPane;

/**
 *
 * @author fabricio
 */
public class Cliente {

    public static void main(String[] args) throws Exception {
        int porta = 2010;
        String host = new String("localhost");
        int opcao = 0;

        Socket s = new Socket(host, porta);
        System.out.println("conectado ao servidor");
        while (opcao != 7) {
            
            ObjectOutputStream vai = new ObjectOutputStream(s.getOutputStream());
            String[] escolha = {"sair", "hora", "data", "dia", "semana"};
            opcao = JOptionPane.showOptionDialog(null, "Selecione uma opcao para continuar", "Calendario", 1, JOptionPane.QUESTION_MESSAGE, null, escolha, escolha[0]);
            vai.writeInt(opcao);
            vai.flush();

            ObjectInputStream recebi = new ObjectInputStream(s.getInputStream());
            String msg = (String) recebi.readObject();
            JOptionPane.showMessageDialog(null, msg);
            
        }
        s.close();
        System.out.println("socket fechado!");
        
    }

}
