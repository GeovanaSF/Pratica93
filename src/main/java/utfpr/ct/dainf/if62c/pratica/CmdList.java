/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utfpr.ct.dainf.if62c.pratica;

import java.util.ArrayList;

/**
 *
 * @author Pedro,Geovana,Jessica,Yasmin
 */
public class CmdList extends ArrayList<ExecCmd> {
    
    public int numExecutando() {
        int n = 0;
        for (ExecCmd c: this) {
            if (!c.terminado()) n++;
        }
        return n;
    }
    
    public CmdList getExecutando() {
        CmdList exec = new CmdList();
        for (ExecCmd c: this) {
            if (!c.terminado()) exec.add(c);
        }
        return exec;
    }
    
    public void cancelaTudo() {
        for (ExecCmd c: this) {
            if (!c.terminado()) c.cancela();
        }
    }
}
