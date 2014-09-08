
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
    private static final Scanner scanner = new Scanner(System.in);
    private final List<ExecCmd> comandos = new ArrayList<>();
    
    public static void main(String[] args) throws IOException {
        String cmd;
        boolean fim = false;
        
        /*do{
            System.out.println("Entre comando: ");
            cmd = scanner.next();
            if (!cmd.trim().isEmpty() && !cmd.equals("fim")) {
                ExecCmd comando = new ExecCmd(cmd);
                comando.executa();
                comandos.add(comando);
            }else if(confirmaSaida()){
                for(ExecCmd c : comandos){
                    c.cancela();
                }
            }
        }while(!fim);*/
        
    }
    
    /*private static boolean confirmaSaida() throws IOException {
        int qntd = 0;
            for(ExecCmd c: comandos){
                qntd += c.terminado() ? 0 : 1;
            }
        String resp = "S";
        if (qntd > 0) {
            System.out.printf("Há %d processos em execução. Deseja terminá-los? ", qntd);
            do {
                resp = scanner.nextLine().toUpperCase();
            } while (!resp.equals("S") && !resp.equals("N"));
        }
        return "S".equals(resp);
    }*/
        
    
}
