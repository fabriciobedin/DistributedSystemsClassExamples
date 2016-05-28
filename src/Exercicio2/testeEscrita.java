/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio2;


/**
 *
 * @author rebonatto
 */
public class testeEscrita {
   public static void main(String[] args) {
      Escrita e = new Escrita(0, "Primeira", 500);
      e.start();   //Ativa a thread
      Escrita ee = new Escrita(999999, "Segunda", 1000);
      ee.start();
      Escrita e1 = new Escrita(500000, "Terceira", 5000);
      e1.start();
   }
}
