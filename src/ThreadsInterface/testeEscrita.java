/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadsInterface;

/**
 *
 * @author rebonatto
 */
public class testeEscrita {
   public static void main(String[] args) {
      EscritaInterface e = new EscritaInterface(0, "Primeira");
      Thread te = new Thread(e);
      te.start();   //Ativa a thread
      EscritaInterface ee = new EscritaInterface(999999, "Segunda");
      Thread tee = new Thread(ee);
      tee.start();
      EscritaInterface e1 = new EscritaInterface(500000, "Terceira");
      Thread te1 = new Thread(e1);
      te1.start();
   }
}
