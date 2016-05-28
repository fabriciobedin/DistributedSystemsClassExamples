package calendarioAvancado;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author fabricio
 */
public class Servidor {

    public static void main(String[] args) throws Exception {
        int porta = 2010;
        int recebido;
        int exit = 1;
        
        ServerSocket ss = new ServerSocket(porta);
        System.out.println("server socket criado");
        Socket s = ss.accept();
        System.out.println("conexao aceita");
      
        while (exit == 1) {
            System.out.println("entrou no while");
            ObjectInputStream recebe = new ObjectInputStream(s.getInputStream());
            recebido = recebe.readInt();
            System.out.println("recebeu valor: " + recebido);
            
            switch (recebido) {
                case 1:{
                    String aux1 = hora();
                    ObjectOutputStream vai = new ObjectOutputStream(s.getOutputStream());
                    vai.writeObject(aux1);
                    System.out.println("----- Hora enviada! -----");
                    break;
                }
                case 2:{
                    String aux2 = data();
                    ObjectOutputStream vai = new ObjectOutputStream(s.getOutputStream());
                    vai.writeObject(aux2);
                    System.out.println("----- Data enviada! -----");
                    break;
                }   
                case 3:{
                    String aux3 = dia();
                    ObjectOutputStream vai = new ObjectOutputStream(s.getOutputStream());
                    vai.writeObject(aux3);
                    System.out.println("----- Dia enviado! -----");
                    break;
                }
                case 4:
                    String aux4 = semana();
                    ObjectOutputStream vai = new ObjectOutputStream(s.getOutputStream());
                    vai.writeObject(aux4);
                    System.out.println("----- Semana enviada! -----");
                    break;
                case 0:
                    System.out.println("----- Cliente saiu! -----");
                    exit = 2;
                    s.close();
                    ss.close();
                    System.out.println("fechou serversocket e conexão");
                    break;
                default:
                    System.out.println("Comando inválido");
            }


        }

    }
    
    public static String hora(){
        System.out.println("----- cliente solicitou a hora -----/n");
        Date hora  = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss ",new Locale("pt","br"));
        System.out.println("hora que sera retornada: " + sdf.format(hora));
        return sdf.format(hora);

    }
    
    public static String data(){
        System.out.println("----- cliente solicitou a data -----");
        Date data  = new Date();
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL,new Locale("pt","br"));
        System.out.println("data que sera retornada: " + df.format(data));
        return df.format(data); 
    }
    
    public static String dia(){
        System.out.println("----- cliente solicitou o dia do ano -----/n");
        Date diaAno  = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("D",new Locale("pt","br"));
        System.out.println("dia que sera retornado: " + sdf.format(diaAno));
        return sdf.format(diaAno);
    
    }
    
    public static String semana(){
        System.out.println("----- cliente solicitou a semana do ano -----/n");
        Date semanaAno  = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("w",new Locale("pt","br"));
        System.out.println("dia que sera retornado: " + sdf.format(semanaAno));
        return sdf.format(semanaAno);
    
    }
 
    

}
