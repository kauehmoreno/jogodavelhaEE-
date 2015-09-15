/**
 * 
 */
package jogodavelhaEE.src.view;

import java.util.Scanner;



/**
 * @author kaueh
 *
 */
public class ExecutaJogo {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void executar(StringBuilder valor,boolean executaEstado,String opcao ){
		valor.setLength(0);
		System.out.println("Deseja executar o jogo? (sim ou nao)");
		valor.append(scanner.nextLine());
		if(valor.toString().equals("sim")){
			valor.setLength(0);
			valor.append("---*---*---");
			executaEstado = true;
		} else if(valor.toString().equals("nao")) {
			executaEstado = false;
			
		} else {
			System.out.println("\r\nOpcao invalida, favor escolher uma opcao valida.\r\n");
			ExecutaJogo.executar(valor,executaEstado,opcao);
		}
	}
	
	
}
