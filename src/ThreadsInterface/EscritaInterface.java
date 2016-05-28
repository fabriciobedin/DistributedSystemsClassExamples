/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadsInterface;

/**
 *
 * @author rebonatto
 */
public class EscritaInterface implements Runnable{
    private int cont;
    private String nome;

    public EscritaInterface(int cont, String nome) {
        this.cont = cont;
        this.nome = nome;
    }    
    

    @Override
    public void run() {
        while (true){
            System.out.println(this.getNome() + " " + this.cont++);
        }
        
    }
    
        public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
