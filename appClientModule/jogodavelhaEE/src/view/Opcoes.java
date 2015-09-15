/**
 * 
 */
package jogodavelhaEE.src.view;

import java.util.Scanner;

import jogodavelhaEE.src.model.util.OpcaoDeJogo;

/**
 * @author kaueh
 *
 */
public class Opcoes {
	static Scanner scanner = new Scanner(System.in);

	public static String opcoes(String opcao) {
		
		System.out.print("\r\nEscolha X ou O:"); 
		opcao = scanner.nextLine().toUpperCase();
		
		if (opcao.equals("X")) {
			return OpcaoDeJogo.X.toString();
		} else if (opcao.equals("O")) {
			return OpcaoDeJogo.O.toString();
		}
	System.out.println("Nao eh uma opcao valida,tente novamente");
	return opcoes(opcao).toString();
	
}

}
