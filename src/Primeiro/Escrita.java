/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Primeiro;

/**
 *
 * @author rebonatto
 */
public class Escrita extends Thread{
    private int cont;
    public Escrita(int cont, String label) {
        this.cont = cont;
        this.setName(label);
    }
    public void run() {
        while (true) {
            System.out.println(this.getName() + " " + cont++);
        }
    }
}
