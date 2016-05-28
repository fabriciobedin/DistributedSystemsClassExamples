/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio1;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author rebonatto
 */
public class Escrita  extends Thread {
    private int cont;
    private Random ale;
    public Escrita(int cont, String label, Random ale) {
        this.cont = cont;
        this.setName(label);
        this.ale = ale;
    }
    public void run() {
        int x;
        while (true) {
            
            
            x = ale.nextInt(5000);
            System.out.println(this.getName() + " " + cont++ + " dorme " + x);
            try {
                Thread.sleep(x);
            } catch (InterruptedException ex) {
                Logger.getLogger(Escrita.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
