/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utfpr.ct.dainf.if62c.pratica;

import java.util.TimerTask;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Geovana,Pedro,Jessica,Yasmin
 */
public class Verificador extends TimerTask{
    private static CmdList comandos;
    private static DefaultTableModel model;
    
    public Verificador(CmdList comandos, DefaultTableModel model){
        this.comandos = comandos;
        this.model = model;
    }
    
    @Override
    public void run(){
        int i = 0;
        model.setNumRows(0);
        for(ExecCmd c: comandos.getExecutando()){
            
            model.insertRow(i, new Object[]{c.getProcesso(),c.getCmd(),true});
            i++;
        }
    }
}
