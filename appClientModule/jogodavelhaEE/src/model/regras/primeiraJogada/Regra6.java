/**
 * 
 */
package jogodavelhaEE.src.model.regras.primeiraJogada;

import jogodavelhaEE.src.model.util.Smart;

/**
 * @author kaueh
 *
 */
public class Regra6 extends Smart {

	@Override
	public void inteligencia(StringBuilder valor, String opcao, boolean jogada) {
			
		if(opcao.toUpperCase().equals("x")){
			sabeTudo(valor, opcao, jogada);

		}else if(opcao.toUpperCase().equals("x")){
			
			inverteNao(valor, opcao, jogada);
			
		}
	}

	@Override
	public void sabeTudo(StringBuilder valor, String opcao, boolean jogada) {

		 if ( valor.toString().equals("X-O*-X-*X-O") && jogada ) { valor.setLength(0); valor.append("X-Q*-XQ*X-Q"); jogada = false;} //5,6,1
		 if ( valor.toString().equals("-XO*-X-*X-O") && jogada ) { valor.setLength(0); valor.append("-XQ*-XQ*X-Q"); jogada = false;} //5,6,2
		 if ( valor.toString().equals("--O*XX-*X-O") && jogada ) { valor.setLength(0); valor.append("--Q*XXQ*X-Q"); jogada = false;} //5,6,3
		 if ( valor.toString().equals("--O*-XX*X-O") && jogada ) { valor.setLength(0); valor.append("--O*OXX*X-O"); jogada = false;} //5,6,4*
		 if ( valor.toString().equals("--O*-X-*XXO") && jogada ) { valor.setLength(0); valor.append("--Q*-XQ*XXQ"); jogada = false;} //5,6,5

		 if ( valor.toString().equals("XO-*-X-*-XO") && jogada ) { valor.setLength(0); valor.append("XOO*-X-*-XO"); jogada = false;} //5,7,1*
		 if ( valor.toString().equals("-OX*-X-*-XO") && jogada ) { valor.setLength(0); valor.append("-OX*-X-*OXO"); jogada = false;} //5,7,2*
		 if ( valor.toString().equals("-O-*XX-*-XO") && jogada ) { valor.setLength(0); valor.append("-O-*XXO*-XO"); jogada = false;} //5,7,3*
		 if ( valor.toString().equals("-O-*-XX*-XO") && jogada ) { valor.setLength(0); valor.append("-O-*OXX*-XO"); jogada = false;} //5,7,4*
		 if ( valor.toString().equals("-O-*-X-*XXO") && jogada ) { valor.setLength(0); valor.append("-OO*-X-*XXO"); jogada = false;} //5,7,5*

		 if ( valor.toString().equals("---*-OX*X--") && jogada ) { valor.setLength(0); valor.append("-O-*-OX*X--"); jogada = false;} //6,1*
		 if ( valor.toString().equals("---*-OX*-X-") && jogada ) { valor.setLength(0); valor.append("---*-OX*-XO"); jogada = false;} //6,2*
		 if ( valor.toString().equals("---*-OX*--X") && jogada ) { valor.setLength(0); valor.append("--O*-OX*--X"); jogada = false;} //6,3*

		 if ( valor.toString().equals("XO-*-OX*X--") && jogada ) { valor.setLength(0); valor.append("XQ-*-QX*XQ-"); jogada = false;} //6,1,1
		 if ( valor.toString().equals("-OX*-OX*X--") && jogada ) { valor.setLength(0); valor.append("-QX*-QX*XQ-"); jogada = false;} //6,1,2
		 if ( valor.toString().equals("-O-*XOX*X--") && jogada ) { valor.setLength(0); valor.append("-Q-*XQX*XQ-"); jogada = false;} //6,1,3
		 if ( valor.toString().equals("-O-*-OX*XX-") && jogada ) { valor.setLength(0); valor.append("-O-*-OX*XXO"); jogada = false;} //6,1,4*
		 if ( valor.toString().equals("-O-*-OX*X-X") && jogada ) { valor.setLength(0); valor.append("-Q-*-QX*XQX"); jogada = false;} //6,1,5

		 if ( valor.toString().equals("X--*-OX*-XO") && jogada ) { valor.setLength(0); valor.append("X--*-OX*OXO"); jogada = false;} //6,2,1*
		 if ( valor.toString().equals("-X-*-OX*-XO") && jogada ) { valor.setLength(0); valor.append("QX-*-QX*-XQ"); jogada = false;} //6,2,2
		 if ( valor.toString().equals("--X*-OX*-XO") && jogada ) { valor.setLength(0); valor.append("Q-X*-QX*-XQ"); jogada = false;} //6,2,3
		 if ( valor.toString().equals("---*XOX*-XO") && jogada ) { valor.setLength(0); valor.append("Q--*XQX*-XQ"); jogada = false;} //6,2,4
		 if ( valor.toString().equals("---*-OX*XXO") && jogada ) { valor.setLength(0); valor.append("Q--*-QX*XXQ"); jogada = false;} //6,2,5

		 if ( valor.toString().equals("X-O*-OX*--X") && jogada ) { valor.setLength(0); valor.append("X-Q*-QX*Q-X"); jogada = false;} //6,3,1
		 if ( valor.toString().equals("-XO*-OX*--X") && jogada ) { valor.setLength(0); valor.append("-XQ*-QX*Q-X"); jogada = false;} //6,3,2
		 if ( valor.toString().equals("--O*XOX*--X") && jogada ) { valor.setLength(0); valor.append("--Q*XQX*Q-X"); jogada = false;} //6,3,3
		 if ( valor.toString().equals("--O*-OX*X-X") && jogada ) { valor.setLength(0); valor.append("--O*-OX*XOX"); jogada = false;} //6,3,4*
		 if ( valor.toString().equals("--O*-OX*-XX") && jogada ) { valor.setLength(0); valor.append("--Q*-QX*QXX"); jogada = false;} //6,3,5

		 if ( valor.toString().equals("---*-O-*XX-") && jogada ) { valor.setLength(0); valor.append("---*-O-*XXO"); jogada = false;} //7,1*
		 if ( valor.toString().equals("---*-O-*X-X") && jogada ) { valor.setLength(0); valor.append("---*-O-*XOX"); jogada = false;} //7,2*

		 if ( valor.toString().equals("X--*-O-*XXO") && jogada ) { valor.setLength(0); valor.append("X--*OO-*XXO"); jogada = false;} //7,1,1*
		 if ( valor.toString().equals("-X-*-O-*XXO") && jogada ) { valor.setLength(0); valor.append("QX-*-Q-*XXQ"); jogada = false;} //7,1,2
		 if ( valor.toString().equals("--X*-O-*XXO") && jogada ) { valor.setLength(0); valor.append("Q-X*-Q-*XXQ"); jogada = false;} //7,1,3
		 if ( valor.toString().equals("---*XO-*XXO") && jogada ) { valor.setLength(0); valor.append("Q--*XQ-*XXQ"); jogada = false;} //7,1,4
		 if ( valor.toString().equals("---*-OX*XXO") && jogada ) { valor.setLength(0); valor.append("Q--*-QX*XXQ"); jogada = false;} //7,1,5

		 if ( valor.toString().equals("X--*-O-*XOX") && jogada ) { valor.setLength(0); valor.append("XQ-*-Q-*XQX"); jogada = false;} //7,2,1
		 if ( valor.toString().equals("-X-*-O-*XOX") && jogada ) { valor.setLength(0); valor.append("-X-*-OO*XOX"); jogada = false;} //7,2,2*
		 if ( valor.toString().equals("--X*-O-*XOX") && jogada ) { valor.setLength(0); valor.append("-QX*-Q-*XQX"); jogada = false;} //7,2,3
		 if ( valor.toString().equals("---*XO-*XOX") && jogada ) { valor.setLength(0); valor.append("-Q-*XQ-*XQX"); jogada = false;} //7,2,4
		 if ( valor.toString().equals("---*-OX*XOX") && jogada ) { valor.setLength(0); valor.append("-Q-*-QX*XQX"); jogada = false;} //7,2,5

		 if ( valor.toString().equals("---*-O-*-XX") && jogada ) { valor.setLength(0); valor.append("---*-O-*OXX"); jogada = false;} //8,1*

		 if ( valor.toString().equals("X--*-O-*OXX") && jogada ) { valor.setLength(0); valor.append("X-Q*-Q-*QXX"); jogada = false;} //8,1,1
		 if ( valor.toString().equals("-X-*-O-*OXX") && jogada ) { valor.setLength(0); valor.append("-XQ*-Q-*QXX"); jogada = false;} //8,1,2
		 if ( valor.toString().equals("--X*-O-*OXX") && jogada ) { valor.setLength(0); valor.append("--X*-OO*OXX"); jogada = false;} //8,1,3*
		 if ( valor.toString().equals("---*XO-*OXX") && jogada ) { valor.setLength(0); valor.append("--Q*XQ-*QXX"); jogada = false;} //8,1,4
		 if ( valor.toString().equals("---*-OX*OXX") && jogada ) { valor.setLength(0); valor.append("--Q*-QX*QXX"); jogada = false;} //8,1,5

	}

	@Override
	public void inverteNao(StringBuilder valor, String opcao, boolean jogada) {
		 if ( valor.toString().equals("O-X*-O-*O-X") && jogada ) { valor.setLength(0); valor.append("O-Q*-OQ*O-Q"); jogada = false;} //5,6,1
		 if ( valor.toString().equals("-OX*-O-*O-X") && jogada ) { valor.setLength(0); valor.append("-OQ*-OQ*O-Q"); jogada = false;} //5,6,2
		 if ( valor.toString().equals("--X*OO-*O-X") && jogada ) { valor.setLength(0); valor.append("--Q*OOQ*O-Q"); jogada = false;} //5,6,3
		 if ( valor.toString().equals("--X*-OO*O-X") && jogada ) { valor.setLength(0); valor.append("--X*XOO*O-X"); jogada = false;} //5,6,4*
		 if ( valor.toString().equals("--X*-O-*OOX") && jogada ) { valor.setLength(0); valor.append("--Q*-OQ*OOQ"); jogada = false;} //5,6,5

		 if ( valor.toString().equals("OX-*-O-*-OX") && jogada ) { valor.setLength(0); valor.append("OXX*-O-*-OX"); jogada = false;} //5,7,1*
		 if ( valor.toString().equals("-XO*-O-*-OX") && jogada ) { valor.setLength(0); valor.append("-XO*-O-*XOX"); jogada = false;} //5,7,2*
		 if ( valor.toString().equals("-X-*OO-*-OX") && jogada ) { valor.setLength(0); valor.append("-X-*OOX*-OX"); jogada = false;} //5,7,3*
		 if ( valor.toString().equals("-X-*-OO*-OX") && jogada ) { valor.setLength(0); valor.append("-X-*XOO*-OX"); jogada = false;} //5,7,4*
		 if ( valor.toString().equals("-X-*-O-*OOX") && jogada ) { valor.setLength(0); valor.append("-XX*-O-*OOX"); jogada = false;} //5,7,5*

		 if ( valor.toString().equals("---*-XO*O--") && jogada ) { valor.setLength(0); valor.append("-X-*-XO*O--"); jogada = false;} //6,1*
		 if ( valor.toString().equals("---*-XO*-O-") && jogada ) { valor.setLength(0); valor.append("---*-XO*-OX"); jogada = false;} //6,2*
		 if ( valor.toString().equals("---*-XO*--O") && jogada ) { valor.setLength(0); valor.append("--X*-XO*--O"); jogada = false;} //6,3*

		 if ( valor.toString().equals("OX-*-XO*O--") && jogada ) { valor.setLength(0); valor.append("OQ-*-QO*OQ-"); jogada = false;} //6,1,1
		 if ( valor.toString().equals("-XO*-XO*O--") && jogada ) { valor.setLength(0); valor.append("-QO*-QO*OQ-"); jogada = false;} //6,1,2
		 if ( valor.toString().equals("-X-*OXO*O--") && jogada ) { valor.setLength(0); valor.append("-Q-*OQO*OQ-"); jogada = false;} //6,1,3
		 if ( valor.toString().equals("-X-*-XO*OO-") && jogada ) { valor.setLength(0); valor.append("-X-*-XO*OOX"); jogada = false;} //6,1,4*
		 if ( valor.toString().equals("-X-*-XO*O-O") && jogada ) { valor.setLength(0); valor.append("-Q-*-QO*OQO"); jogada = false;} //6,1,5

		 if ( valor.toString().equals("O--*-XO*-OX") && jogada ) { valor.setLength(0); valor.append("O--*-XO*XOX"); jogada = false;} //6,2,1*
		 if ( valor.toString().equals("-O-*-XO*-OX") && jogada ) { valor.setLength(0); valor.append("QO-*-QO*-OQ"); jogada = false;} //6,2,2
		 if ( valor.toString().equals("--O*-XO*-OX") && jogada ) { valor.setLength(0); valor.append("Q-O*-QO*-OQ"); jogada = false;} //6,2,3
		 if ( valor.toString().equals("---*OXO*-OX") && jogada ) { valor.setLength(0); valor.append("Q--*OQO*-OQ"); jogada = false;} //6,2,4
		 if ( valor.toString().equals("---*-XO*OOX") && jogada ) { valor.setLength(0); valor.append("Q--*-QO*OOQ"); jogada = false;} //6,2,5

		 if ( valor.toString().equals("O-X*-XO*--O") && jogada ) { valor.setLength(0); valor.append("O-Q*-QO*Q-O"); jogada = false;} //6,3,1
		 if ( valor.toString().equals("-OX*-XO*--O") && jogada ) { valor.setLength(0); valor.append("-OQ*-QO*Q-O"); jogada = false;} //6,3,2
		 if ( valor.toString().equals("--X*OXO*--O") && jogada ) { valor.setLength(0); valor.append("--Q*OQO*Q-O"); jogada = false;} //6,3,3
		 if ( valor.toString().equals("--X*-XO*O-O") && jogada ) { valor.setLength(0); valor.append("--X*-XO*OXO"); jogada = false;} //6,3,4*
		 if ( valor.toString().equals("--X*-XO*-OO") && jogada ) { valor.setLength(0); valor.append("--Q*-QO*QOO"); jogada = false;} //6,3,5

		 if ( valor.toString().equals("---*-X-*OO-") && jogada ) { valor.setLength(0); valor.append("---*-X-*OOX"); jogada = false;} //7,1*
		 if ( valor.toString().equals("---*-X-*O-O") && jogada ) { valor.setLength(0); valor.append("---*-X-*OXO"); jogada = false;} //7,2*

		 if ( valor.toString().equals("O--*-X-*OOX") && jogada ) { valor.setLength(0); valor.append("O--*XX-*OOX"); jogada = false;} //7,1,1*
		 if ( valor.toString().equals("-O-*-X-*OOX") && jogada ) { valor.setLength(0); valor.append("QO-*-Q-*OOQ"); jogada = false;} //7,1,2
		 if ( valor.toString().equals("--O*-X-*OOX") && jogada ) { valor.setLength(0); valor.append("Q-O*-Q-*OOQ"); jogada = false;} //7,1,3
		 if ( valor.toString().equals("---*OX-*OOX") && jogada ) { valor.setLength(0); valor.append("Q--*OQ-*OOQ"); jogada = false;} //7,1,4
		 if ( valor.toString().equals("---*-XO*OOX") && jogada ) { valor.setLength(0); valor.append("Q--*-QO*OOQ"); jogada = false;} //7,1,5

		 if ( valor.toString().equals("O--*-X-*OXO") && jogada ) { valor.setLength(0); valor.append("OQ-*-Q-*OQO"); jogada = false;} //7,2,1
		 if ( valor.toString().equals("-O-*-X-*OXO") && jogada ) { valor.setLength(0); valor.append("-O-*-XX*OXO"); jogada = false;} //7,2,2*
		 if ( valor.toString().equals("--O*-X-*OXO") && jogada ) { valor.setLength(0); valor.append("-QO*-Q-*OQO"); jogada = false;} //7,2,3
		 if ( valor.toString().equals("---*OX-*OXO") && jogada ) { valor.setLength(0); valor.append("-Q-*OQ-*OQO"); jogada = false;} //7,2,4
		 if ( valor.toString().equals("---*-XO*OXO") && jogada ) { valor.setLength(0); valor.append("-Q-*-QO*OQO"); jogada = false;} //7,2,5

		 if ( valor.toString().equals("---*-X-*-OO") && jogada ) { valor.setLength(0); valor.append("---*-X-*XOO"); jogada = false;} //8,1*

		 if ( valor.toString().equals("O--*-X-*XOO") && jogada ) { valor.setLength(0); valor.append("O-Q*-Q-*QOO"); jogada = false;} //8,1,1
		 if ( valor.toString().equals("-O-*-X-*XOO") && jogada ) { valor.setLength(0); valor.append("-OQ*-Q-*QOO"); jogada = false;} //8,1,2
		 if ( valor.toString().equals("--O*-X-*XOO") && jogada ) { valor.setLength(0); valor.append("--O*-XX*XOO"); jogada = false;} //8,1,3*
		 if ( valor.toString().equals("---*OX-*XOO") && jogada ) { valor.setLength(0); valor.append("--Q*OQ-*QOO"); jogada = false;} //8,1,4
		 if ( valor.toString().equals("---*-XO*XOO") && jogada ) { valor.setLength(0); valor.append("--Q*-QO*QOO"); jogada = false;} //8,1,5

	}

	
}
