/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utfpr.ct.dainf.if62c.pratica;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Geovana
 */
public class ExecCmd extends Thread{
    private Process proc;
    private final String cmd;
    private boolean terminado;
    
    public ExecCmd(String cmd){
        this.cmd = cmd;
    }
    
    public Process getProcesso() {
        return proc;
    }
    
    @Override
    public void run(){
        try {
            proc.waitFor();
        } catch (InterruptedException ex) {
            Logger.getLogger(ExecCmd.class.getName()).log(Level.SEVERE, null, ex);
        }
        terminado = true;
    }
    
    public void executa() {
        try {
            //CapturaSaida captura = new CapturaSaida(proc.getInputStream(),System.out);
            proc = Runtime.getRuntime().exec(cmd);
            //captura.start();
        } catch (IOException | IllegalArgumentException ex) {
            System.out.printf("Comando '%s' não pode ser executado: %s%n",
                    cmd, ex.getLocalizedMessage());
            terminado = true;
        }
    }
    
    public void cancela(){
        try {
            proc.destroy();
        } finally {
            terminado = true;
        }
    }
    public boolean terminado(){
        //return terminado;
        return !proc.isAlive();
    }
}
