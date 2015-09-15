/**
 * 
 */
package jogodavelhaEE.src.view;

/**
 * @author kaueh
 *
 */
public class VerificaJogo {

	// Verifica se o jogo terminou, para sair do loop while.
	public static void verificaJogo(StringBuilder valor,boolean executaEstado) {

		if (valor.indexOf("-") == -1 || valor.indexOf("Q") != -1) {
			executaEstado = false;
		}
	}
}
