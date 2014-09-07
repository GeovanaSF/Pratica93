
import java.util.ArrayList;
import java.util.Scanner;
import utfpr.ct.dainf.if62c.pratica.ExecCmd;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * @author Geovana Franco Santos<geovaa.franco01@gmail.com>
 */
public class Pratica93 {
    public static void main(String[] args) {
        String cmd = "";
        Scanner scanner = new Scanner(System.in);
        ArrayList<ExecCmd> comandos = new ArrayList<>();
        while(cmd.compareTo("fim")!=0){
            System.out.println("Entre comando: ");
            cmd = scanner.next();
            //ExecCmd ex = new ExecCmd(cmd);
            if(cmd.compareTo("fim")!=0){
                comandos.add(new ExecCmd(cmd));
                comandos.get(comandos.size()-1).run();
                //ex.run();
            }else{// if(ex.terminado()){
                int qntd = 0;
                for(ExecCmd c : comandos){
                    qntd += c.terminado() ? 0 : 1;
                }
                
                System.out.println("Processo "+qntd+" em execução deseja terminar? (s/n)");
                Scanner s = new Scanner(System.in);
                String ss = s.next();
                if(ss.compareTo("s")!=0){
                    for(ExecCmd c : comandos){
                        c.cancela();
                    }
                }
            }
        }
        
    }
}
