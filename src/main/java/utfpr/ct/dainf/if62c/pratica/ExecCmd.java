/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utfpr.ct.dainf.if62c.pratica;

import java.io.IOException;
import static java.lang.Runtime.getRuntime;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Geovana
 */
public class ExecCmd extends Thread{
    protected Process proc;
    String cmd;
    
    public ExecCmd(String cmd){
        this.cmd = cmd;
    }
    
    @Override
    public void run(){
        try {
            Runtime rt = getRuntime();
            proc = rt.exec(cmd);
            //proc.waitFor();
        } /*catch (InterruptedException ex) {
            Logger.getLogger(ExecCmd.class.getName()).log(Level.SEVERE, null, ex);
        } */catch (IOException ex) {
            Logger.getLogger(ExecCmd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void cancela(){
        proc.destroy();
    }
    public boolean terminado(){
        return proc.isAlive();
    }
}
