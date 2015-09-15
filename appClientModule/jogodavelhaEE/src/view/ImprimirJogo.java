/**
 * 
 */
package jogodavelhaEE.src.view;

/**
 * @author kaueh
 *
 */
public class ImprimirJogo {

public static void imprimiJogo(StringBuilder valor) {
		
		if (!valor.toString().equals("nao")) {
			for(int i = 0; i < valor.length(); i++) {
				if (valor.charAt(i) != '*' && valor.charAt(i) != ' ') {
					System.out.print(" ");
					if (valor.charAt(i) == '-') { 
						System.out.print(" ");
					} else {
						System.out.print(valor.charAt(i));
					}
					if (i != 2 && i != 6 && i != 10) {
						System.out.print(" |");
					}
				} else {
					System.out.println("\r\n___________");
				}
			}
		}
		System.out.print("\r\n");
	}
}
