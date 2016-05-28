/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Primeiro;

/**
 *
 * @author rebonatto
 */
public class testeEscrita {
   public static void main(String[] args) {
      Escrita e = new Escrita(0, "Primeira");
      e.start();   //Ativa a thread
      Escrita ee = new Escrita(999999, "Segunda");
      ee.start();
      Escrita e1 = new Escrita(500000, "Terceira");
      e1.start();
   }
}
