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
 * @author Geovana,Pedro,Jessica,Yasmin
 */
public class ExecCmd extends Thread{
    private Process proc;
    private final String cmd;
    
    public ExecCmd(String cmd){
        this.cmd = cmd;
    }

    public String getCmd() {
        return cmd;
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
    }
    
    public void executa() {
        try {
            proc = Runtime.getRuntime().exec(cmd);
        } catch (IOException | IllegalArgumentException ex) {
            System.out.printf("Comando '%s' não pode ser executado: %s%n",
                    cmd, ex.getLocalizedMessage());
        }
    }
    
    public void cancela(){
        proc.destroy();
    }
    public boolean terminado(){
        return !proc.isAlive();
    }
}
