/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio2;

import Primeiro.*;

/**
 *
 * @author rebonatto
 */
public class Escrita extends Thread{
    private int cont;
    private int limite;
    public Escrita(int cont, String label, int limite) {
        this.cont = cont;
        this.setName(label);
        this.limite = limite;
    }
    public void run() {
        int limite = cont + this.limite;
        while (cont < limite) {
            System.out.println(this.getName() + " " + cont++);
        }
        System.out.println("\n\n\nThread " + this.getName() + " Acabou !!!\n\n\n");
    }
}
