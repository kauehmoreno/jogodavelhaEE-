/**
 * 
 */
package jogodavelhaEE.src.view;

/**
 * @author kaueh
 *
 */
public class ImprimeTabuleiro {

	public static void imprimiTabuleiro() {
		  
		String tabuleiro = "123*456*789";
		
		System.out.println("Exemplo do tabuleiro com suas devidas posicoes.\r\n");
		
		for(int i = 0; i < tabuleiro.length(); i++) {
			if (tabuleiro.charAt(i) != '*') {
				System.out.print(tabuleiro.charAt(i));
				if (i != 2 && i != 6 && i != 10) {
					System.out.print(" |");
				}
			} else {
				System.out.println("\r\n___________");
			}
		}
		
	}
}
