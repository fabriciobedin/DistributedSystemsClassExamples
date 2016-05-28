/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ExemploMod;

import javax.swing.JTextArea;

/**
 *
 * @author rebonatto
 */
public class Escrita extends Thread{
    private int cont;
    private JTextArea textArea;
    
    public Escrita(int cont, String label, JTextArea area) {
        this.cont = cont;
        this.setName(label);
        this.textArea = area;
    }
    public void run() {
        while (true) {
            this.getTextArea().append(this.getName() + " " + cont++ + "\n");
//            System.out.println(this.getName() + " " + cont++);
        }
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public JTextArea getTextArea() {
        return textArea;
    }

    public void setTextArea(JTextArea textArea) {
        this.textArea = textArea;
    }
    
}
