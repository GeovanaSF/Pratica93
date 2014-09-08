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
 * @author Geovana
 */
public class Verificador extends TimerTask{
    private static CmdList comandos = new CmdList();
    private static DefaultTableModel model;
    
    public Verificador(CmdList comandos, DefaultTableModel tabela){
        this.comandos = comandos;
        this.model = tabela;
    }
    @Override
    public void run(){
        for(ExecCmd c: comandos.getExecutando()){
            model.insertRow(model.getRowCount(), new Object[]{c.getProcesso(),true});
        }
    }
}
