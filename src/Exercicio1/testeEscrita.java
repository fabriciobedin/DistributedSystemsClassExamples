/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio1;

import java.util.Random;


/**
 *
 * @author rebonatto
 */
public class testeEscrita {
   public static void main(String[] args) {
      Random ale = new Random(313);
      
      Escrita e = new Escrita(0, "Primeira", ale);
      e.start();   //Ativa a thread
      Escrita ee = new Escrita(999999, "Segunda", ale);
      ee.start();
   }
}
