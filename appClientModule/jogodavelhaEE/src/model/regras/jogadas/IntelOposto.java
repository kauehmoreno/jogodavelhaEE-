/**
 * 
 */
package jogodavelhaEE.src.model.regras.primeiraJogada;

import jogodavelhaEE.src.model.util.Smart;

/**
 * @author kaueh
 *
 */
public class IntelOposto extends Smart {

	/* (non-Javadoc)
	 * @see jogodavelhaEE.src.model.util.AnalizeInteligente#inteligencia(java.lang.StringBuilder, java.lang.String, boolean)
	 */
	public static void inteligencia(StringBuilder valor, String opcao, boolean jogada) {
		jogada = true;
		
		 if ( valor.toString().equals("O--*---*---") && jogada ) { valor.setLength(0); valor.append("O--*-X-*---"); jogada = false;} //1*		 
		 if ( valor.toString().equals("-O-*---*---") && jogada ) { valor.setLength(0); valor.append("-O-*-X-*---"); jogada = false;} //2*
		 if ( valor.toString().equals("--O*---*---") && jogada ) { valor.setLength(0); valor.append("--O*-X-*---"); jogada = false;} //3*
		 if ( valor.toString().equals("---*O--*---") && jogada ) { valor.setLength(0); valor.append("---*OX-*---"); jogada = false;} //4*
		 if ( valor.toString().equals("---*-O-*---") && jogada ) { valor.setLength(0); valor.append("---*-O-*--X"); jogada = false;} //5*
		 if ( valor.toString().equals("---*--O*---") && jogada ) { valor.setLength(0); valor.append("---*-XO*---"); jogada = false;} //6*
		 if ( valor.toString().equals("---*---*O--") && jogada ) { valor.setLength(0); valor.append("---*-X-*O--"); jogada = false;} //7*
		 if ( valor.toString().equals("---*---*-O-") && jogada ) { valor.setLength(0); valor.append("---*-X-*-O-"); jogada = false;} //8*
		 if ( valor.toString().equals("---*---*--O") && jogada ) { valor.setLength(0); valor.append("---*-X-*--O"); jogada = false;} //9*

		 // Respostas para as segunda e terceira jogadas

		 if ( valor.toString().equals("OO-*-X-*---") && jogada ) { valor.setLength(0); valor.append("OOX*-X-*---"); jogada = false;} //1,1*
		 if ( valor.toString().equals("O-O*-X-*---") && jogada ) { valor.setLength(0); valor.append("OXO*-X-*---"); jogada = false;} //1,2*
		 if ( valor.toString().equals("O--*OX-*---") && jogada ) { valor.setLength(0); valor.append("O--*OX-*X--"); jogada = false;} //1,3*
		 if ( valor.toString().equals("O--*-XO*---") && jogada ) { valor.setLength(0); valor.append("OX-*-XO*---"); jogada = false;} //1,4*
		 if ( valor.toString().equals("O--*-X-*O--") && jogada ) { valor.setLength(0); valor.append("O--*XX-*O--"); jogada = false;} //1,5*
		 if ( valor.toString().equals("O--*-X-*-O-") && jogada ) { valor.setLength(0); valor.append("O--*XX-*-O-"); jogada = false;} //1,6*
		 if ( valor.toString().equals("O--*-X-*--O") && jogada ) { valor.setLength(0); valor.append("O--*-XX*--O"); jogada = false;} //1,7*

		 if ( valor.toString().equals("OOX*OX-*---") && jogada ) { valor.setLength(0); valor.append("OOQ*OQ- Q--"); jogada = false;} //1,1,1
		 if ( valor.toString().equals("OOX*-XO*---") && jogada ) { valor.setLength(0); valor.append("OOQ*-QO Q--"); jogada = false;} //1,1,2
		 if ( valor.toString().equals("OOX*-X-*O--") && jogada ) { valor.setLength(0); valor.append("OOX*XX-*O--"); jogada = false;} //1,1,3*
		 if ( valor.toString().equals("OOX*-X-*-O-") && jogada ) { valor.setLength(0); valor.append("OOQ*-Q- QO-"); jogada = false;} //1,1,4
		 if ( valor.toString().equals("OOX*-X-*--O") && jogada ) { valor.setLength(0); valor.append("OOQ*-Q- Q-O"); jogada = false;} //1,1,5

		 if ( valor.toString().equals("OXO*OX-*---") && jogada ) { valor.setLength(0); valor.append("OQO*OQ-*-Q-"); jogada = false;} //1,2,1
		 if ( valor.toString().equals("OXO*-XO*---") && jogada ) { valor.setLength(0); valor.append("OQO*-QO*-Q-"); jogada = false;} //1,2,2
		 if ( valor.toString().equals("OXO*-X-*O--") && jogada ) { valor.setLength(0); valor.append("OQO*-Q-*OQ-"); jogada = false;} //1,2,3
		 if ( valor.toString().equals("OXO*-X-*-O-") && jogada ) { valor.setLength(0); valor.append("OXO*-XX*-O-"); jogada = false;} //1,2,4*
		 if ( valor.toString().equals("OXO*-X-*--O") && jogada ) { valor.setLength(0); valor.append("OQO*-Q-*-QO"); jogada = false;} //1,2,5

		 if ( valor.toString().equals("OO-*OX-*X--") && jogada ) { valor.setLength(0); valor.append("OOQ*OQ-*Q--"); jogada = false;} //1,3,1
		 if ( valor.toString().equals("O-O*OX-*X--") && jogada ) { valor.setLength(0); valor.append("OXO*OX-*X--"); jogada = false;} //1,3,2*
		 if ( valor.toString().equals("O--*OXO*X--") && jogada ) { valor.setLength(0); valor.append("O-Q*OQO*Q--"); jogada = false;} //1,3,3
		 if ( valor.toString().equals("O--*OXO*XO-") && jogada ) { valor.setLength(0); valor.append("O-Q*OQO*QO-"); jogada = false;} //1,3,4
		 if ( valor.toString().equals("O--*OX-*X-O") && jogada ) { valor.setLength(0); valor.append("O-Q*OQ-*Q-O"); jogada = false;} //1,3,5

		 if ( valor.toString().equals("OXx*-XO*---") && jogada ) { valor.setLength(0); valor.append("OQ-*OQO*-Q-"); jogada = false;} //1,4,1
		 if ( valor.toString().equals("OX-*OXO*---") && jogada ) { valor.setLength(0); valor.append("OQ-*OQO*-Q-"); jogada = false;} //1,4,2
		 if ( valor.toString().equals("OX-*-XO*O--") && jogada ) { valor.setLength(0); valor.append("OQ-*-QO*OQ-"); jogada = false;} //1,4,3
		 if ( valor.toString().equals("OX-*-XO*-O-") && jogada ) { valor.setLength(0); valor.append("OX-*-XO*XO-"); jogada = false;} //1,4,4*
		 if ( valor.toString().equals("OX-*-XO*--O") && jogada ) { valor.setLength(0); valor.append("OQ-*-QO*-QO"); jogada = false;} //1,4,5

		 if ( valor.toString().equals("OO-*XX-*O--") && jogada ) { valor.setLength(0); valor.append("OO-*QQQ*O--"); jogada = false;} //1,5,1
		 if ( valor.toString().equals("O-O*XX-*O--") && jogada ) { valor.setLength(0); valor.append("O-O*QQQ*O--"); jogada = false;} //1,5,2
		 if ( valor.toString().equals("O--*XXO*O--") && jogada ) { valor.setLength(0); valor.append("O--*XXO*OX-"); jogada = false;} //1,5,3*
		 if ( valor.toString().equals("O--*XX-*OO-") && jogada ) { valor.setLength(0); valor.append("O--*QQQ*OO-"); jogada = false;} //1,5,4
		 if ( valor.toString().equals("O--*XX-*O-O") && jogada ) { valor.setLength(0); valor.append("O--*QQQ*O-O"); jogada = false;} //1,5,5

		 if ( valor.toString().equals("OO-*XX-*-O-") && jogada ) { valor.setLength(0); valor.append("OO-*QQQ*-O-"); jogada = false;} //1,6,1
		 if ( valor.toString().equals("O-O*XX-*-O-") && jogada ) { valor.setLength(0); valor.append("O-O*QQQ*-O-"); jogada = false;} //1,6,2
		 if ( valor.toString().equals("O--*XXO*-O-") && jogada ) { valor.setLength(0); valor.append("O-X*XXO*-O-"); jogada = false;} //1,6,3*
		 if ( valor.toString().equals("O--*XX-*OO-") && jogada ) { valor.setLength(0); valor.append("O--*QQQ*OO-"); jogada = false;} //1,6,4
		 if ( valor.toString().equals("O--*XX-*-OO") && jogada ) { valor.setLength(0); valor.append("O--*QQQ*-OO"); jogada = false;} //1,6,5

		 if ( valor.toString().equals("OO-*-XX*--O") && jogada ) { valor.setLength(0); valor.append("OO-*QQQ*--O"); jogada = false;} //1,7,1
		 if ( valor.toString().equals("O-O*-XX*--O") && jogada ) { valor.setLength(0); valor.append("O-O*QQQ*--O"); jogada = false;} //1,7,2
		 if ( valor.toString().equals("O--*OXX*--O") && jogada ) { valor.setLength(0); valor.append("O--*OXX*X-O"); jogada = false;} //1,7,3*
		 if ( valor.toString().equals("O--*-XX*O-O") && jogada ) { valor.setLength(0); valor.append("O--*QQQ*O-O"); jogada = false;} //1,7,4
		 if ( valor.toString().equals("O--*-XX*-OO") && jogada ) { valor.setLength(0); valor.append("O--*QQQ*-OO"); jogada = false;} //1,7,5

		 if ( valor.toString().equals("-OO*-X-*---") && jogada ) { valor.setLength(0); valor.append("XOO*-X-*---"); jogada = false;} //2,1*
		 if ( valor.toString().equals("-O-*OX-*---") && jogada ) { valor.setLength(0); valor.append("XO-*OX-*---"); jogada = false;} //2,2*
		 if ( valor.toString().equals("-O-*-XO*---") && jogada ) { valor.setLength(0); valor.append("-OX*-XO*---"); jogada = false;} //2,3*
		 if ( valor.toString().equals("-O-*-X-*O--") && jogada ) { valor.setLength(0); valor.append("-O-*-XX*O--"); jogada = false;} //2,4*
		 if ( valor.toString().equals("-O-*-X-*-O-") && jogada ) { valor.setLength(0); valor.append("-O-*-X-*-OX"); jogada = false;} //2,5*
		 if ( valor.toString().equals("-O-*-X-*--O") && jogada ) { valor.setLength(0); valor.append("-O-*XX-*--O"); jogada = false;} //2,6*

		 if ( valor.toString().equals("XOO*OX-*---") && jogada ) { valor.setLength(0); valor.append("QOO*OQ-*--Q"); jogada = false;} //2,1,1
		 if ( valor.toString().equals("XOO*-XO*---") && jogada ) { valor.setLength(0); valor.append("QOO*-QO*--Q"); jogada = false;} //2,1,2
		 if ( valor.toString().equals("XOO*-X-*O--") && jogada ) { valor.setLength(0); valor.append("QOO*-Q-*O-Q"); jogada = false;} //2,1,3
		 if ( valor.toString().equals("XOO*-X-*-O-") && jogada ) { valor.setLength(0); valor.append("QOO*-Q-*-OQ"); jogada = false;} //2,1,4
		 if ( valor.toString().equals("XOO*-X-*--O") && jogada ) { valor.setLength(0); valor.append("XOO*-XX*--O"); jogada = false;} //2,1,5*

		 if ( valor.toString().equals("XOO*OX-*---") && jogada ) { valor.setLength(0); valor.append("QOO*OQ-*--Q"); jogada = false;} //2,2,1
		 if ( valor.toString().equals("XO-*OXO*---") && jogada ) { valor.setLength(0); valor.append("QO-*OQO*--Q"); jogada = false;} //2,2,2
		 if ( valor.toString().equals("XO-*OX-*O--") && jogada ) { valor.setLength(0); valor.append("QO-*OQ-*O-Q"); jogada = false;} //2,2,3
		 if ( valor.toString().equals("XO-*OX-*-O-") && jogada ) { valor.setLength(0); valor.append("QO-*OQ-*-OQ"); jogada = false;} //2,2,4
		 if ( valor.toString().equals("XO-*OX-*--O") && jogada ) { valor.setLength(0); valor.append("XOX*OX-*--O"); jogada = false;} //2,2,5*

		 if ( valor.toString().equals("OOX*-XO*---") && jogada ) { valor.setLength(0); valor.append("OOQ*-QO*Q--"); jogada = false;} //2,3,1
		 if ( valor.toString().equals("-OX*OXO*---") && jogada ) { valor.setLength(0); valor.append("-OQ*OQO*Q--"); jogada = false;} //2,3,2
		 if ( valor.toString().equals("-OX*-XO*O--") && jogada ) { valor.setLength(0); valor.append("-OX*-XO*O-X"); jogada = false;} //2,3,3*
		 if ( valor.toString().equals("-OX*-XO*-O-") && jogada ) { valor.setLength(0); valor.append("-OQ*-QO*QO-"); jogada = false;} //2,3,4
		 if ( valor.toString().equals("-OX*-XO*--O") && jogada ) { valor.setLength(0); valor.append("-OQ*-QO*Q-O"); jogada = false;} //2,3,5

		 if ( valor.toString().equals("OO-*-XX*O--") && jogada ) { valor.setLength(0); valor.append("OO-*QQQ*O--"); jogada = false;} //2,4,1
		 if ( valor.toString().equals("-OO*-XX*O--") && jogada ) { valor.setLength(0); valor.append("-OO*QQQ*O--"); jogada = false;} //2,4,2
		 if ( valor.toString().equals("-O-*OXX*O--") && jogada ) { valor.setLength(0); valor.append("XO-*OXX*O--"); jogada = false;} //2,4,3*
		 if ( valor.toString().equals("-O-*-XX*OO-") && jogada ) { valor.setLength(0); valor.append("-O-*QQQ*OO-"); jogada = false;} //2,4,4
		 if ( valor.toString().equals("-O-*-XX*O-O") && jogada ) { valor.setLength(0); valor.append("-O-*QQQ*O-O"); jogada = false;} //2,4,5

		 if ( valor.toString().equals("OO-*-X-*-OX") && jogada ) { valor.setLength(0); valor.append("OOX*-X-*-OX"); jogada = false;} //2,5,1*
		 if ( valor.toString().equals("-OO*-X-*-OX") && jogada ) { valor.setLength(0); valor.append("QOO*-Q-*-OQ"); jogada = false;} //2,5,2
		 if ( valor.toString().equals("-O-*OX-*-OX") && jogada ) { valor.setLength(0); valor.append("QO-*OQ-*-OQ"); jogada = false;} //2,5,3
		 if ( valor.toString().equals("-O-*-XO*-OX") && jogada ) { valor.setLength(0); valor.append("QO-*-QO*-OQ"); jogada = false;} //2,5,4
		 if ( valor.toString().equals("-O-*-X-*OOX") && jogada ) { valor.setLength(0); valor.append("QO-*-Q-*OOQ"); jogada = false;} //2,5,5

		 if ( valor.toString().equals("OO-*XX-*--O") && jogada ) { valor.setLength(0); valor.append("OO-*QQQ*--O"); jogada = false;} //2,6,1
		 if ( valor.toString().equals("-OO*XX-*--O") && jogada ) { valor.setLength(0); valor.append("-OO*QQQ*--O"); jogada = false;} //2,6,2
		 if ( valor.toString().equals("-O-*XXO*--O") && jogada ) { valor.setLength(0); valor.append("-OX*XXO*--O"); jogada = false;} //2,6,3*
		 if ( valor.toString().equals("-O-*XX-*O-O") && jogada ) { valor.setLength(0); valor.append("-O-*QQQ*O-O"); jogada = false;} //2,6,4
		 if ( valor.toString().equals("-O-*XX-*-OO") && jogada ) { valor.setLength(0); valor.append("-O-*QQQ*-OO"); jogada = false;} //2,6,5

		 if ( valor.toString().equals("--O*OX-*---") && jogada ) { valor.setLength(0); valor.append("-XO*OX-*---"); jogada = false;} //3,1*
		 if ( valor.toString().equals("--O*-XO*---") && jogada ) { valor.setLength(0); valor.append("--O*-XO*--X"); jogada = false;} //3,2*
		 if ( valor.toString().equals("--O*-X-*O--") && jogada ) { valor.setLength(0); valor.append("--O*XX-*O--"); jogada = false;} //3,3*
		 if ( valor.toString().equals("--O*-X-*-O-") && jogada ) { valor.setLength(0); valor.append("--O*XX-*-O-"); jogada = false;} //3,4*
		 if ( valor.toString().equals("--O*-X-*--O") && jogada ) { valor.setLength(0); valor.append("--O*-XX*--O"); jogada = false;} //3,5*

		 if ( valor.toString().equals("OXO*OX-*---") && jogada ) { valor.setLength(0); valor.append("OQO*OQ-*-Q-"); jogada = false;} //3,1,1
		 if ( valor.toString().equals("-XO*OXO*---") && jogada ) { valor.setLength(0); valor.append("-QO*OQO*-Q-"); jogada = false;} //3,1,2
		 if ( valor.toString().equals("-XO*OX-*O--") && jogada ) { valor.setLength(0); valor.append("-QO*OQ-*OQ-"); jogada = false;} //3,1,3
		 if ( valor.toString().equals("-XO*OX-*-O-") && jogada ) { valor.setLength(0); valor.append("XXO*OX-*-O-"); jogada = false;} //3,1,4*
		 if ( valor.toString().equals("-XO*OX-*--O") && jogada ) { valor.setLength(0); valor.append("-QO*OQ-*-QO"); jogada = false;} //3,1,5

		 if ( valor.toString().equals("O-O*-XO*--X") && jogada ) { valor.setLength(0); valor.append("OXO*-XO*--X"); jogada = false;} //3,2,1*
		 if ( valor.toString().equals("-OO*-XO*--X") && jogada ) { valor.setLength(0); valor.append("QOO*-QO*--Q"); jogada = false;} //3,2,2
		 if ( valor.toString().equals("--O*OXO*--X") && jogada ) { valor.setLength(0); valor.append("Q-O*OQO*--Q"); jogada = false;} //3,2,3
		 if ( valor.toString().equals("--O*-XO*O-X") && jogada ) { valor.setLength(0); valor.append("Q-O*-QO*O-Q"); jogada = false;} //3,2,4
		 if ( valor.toString().equals("--O*-XO*-OX") && jogada ) { valor.setLength(0); valor.append("Q-O*-QO*-OQ"); jogada = false;} //3,2,5

		 if ( valor.toString().equals("O-O*-X-*O--") && jogada ) { valor.setLength(0); valor.append("O-O*QQQ*O--"); jogada = false;} //3,3,1
		 if ( valor.toString().equals("-OO*XX-*O--") && jogada ) { valor.setLength(0); valor.append("-xO*QQQ*O--"); jogada = false;} //3,3,2
		 if ( valor.toString().equals("--O*XXO*O--") && jogada ) { valor.setLength(0); valor.append("--O*XXO*O-X"); jogada = false;} //3,3,3*
		 if ( valor.toString().equals("--O*XX-*OO-") && jogada ) { valor.setLength(0); valor.append("--O*QQQ*OO-"); jogada = false;} //3,3,4
		 if ( valor.toString().equals("--O*XX-*O-O") && jogada ) { valor.setLength(0); valor.append("--O*QQQ*O-O"); jogada = false;} //3,3,5

		 if ( valor.toString().equals("O-O*XX-*-O-") && jogada ) { valor.setLength(0); valor.append("O-O*QQQ*-O-"); jogada = false;} //3,4,1
		 if ( valor.toString().equals("-OO*XX-*-O-") && jogada ) { valor.setLength(0); valor.append("-OO*QQQ*-O-"); jogada = false;} //3,4,2
		 if ( valor.toString().equals("--O*XXO*-O-") && jogada ) { valor.setLength(0); valor.append("--O*XXO*-OX"); jogada = false;} //3,4,3*
		 if ( valor.toString().equals("--O*XX-*OO-") && jogada ) { valor.setLength(0); valor.append("--O*QQQ*OO-"); jogada = false;} //3,4,4
		 if ( valor.toString().equals("--O*XX-*-OO") && jogada ) { valor.setLength(0); valor.append("--O*QQQ*-OO"); jogada = false;} //3,4,5

		 if ( valor.toString().equals("O-O*-XX*--O") && jogada ) { valor.setLength(0); valor.append("O-O*QQQ*--O"); jogada = false;} //3,5,1
		 if ( valor.toString().equals("-OO*-XX*--O") && jogada ) { valor.setLength(0); valor.append("-OO*QQQ*--O"); jogada = false;} //3,5,2
		 if ( valor.toString().equals("--O*OXX*--O") && jogada ) { valor.setLength(0); valor.append("--O*OXX*-XO"); jogada = false;} //3,5,3*
		 if ( valor.toString().equals("--O*-XX*O-O") && jogada ) { valor.setLength(0); valor.append("--O*QQQ*O-O"); jogada = false;} //3,5,4
		 if ( valor.toString().equals("--O*-XX*-OO") && jogada ) { valor.setLength(0); valor.append("--O*QQQ*-OO"); jogada = false;} //3,5,5

		 if ( valor.toString().equals("---*OXO*---") && jogada ) { valor.setLength(0); valor.append("--X*OXO*---"); jogada = false;} //4,1*
		 if ( valor.toString().equals("---*OX-*O--") && jogada ) { valor.setLength(0); valor.append("X--*OX-*O--"); jogada = false;} //4,2*
		 if ( valor.toString().equals("---*OX-*-O-") && jogada ) { valor.setLength(0); valor.append("---*OX-*XO-"); jogada = false;} //4,3*
		 if ( valor.toString().equals("---*OX-*--O") && jogada ) { valor.setLength(0); valor.append("-X-*OX-*--O"); jogada = false;} //4,4*

		 if ( valor.toString().equals("O-X*OXO*---") && jogada ) { valor.setLength(0); valor.append("O-Q*OQO*Q--"); jogada = false;} //4,1,1
		 if ( valor.toString().equals("-OX*OXO*---") && jogada ) { valor.setLength(0); valor.append("-OQ*OQO*Q--"); jogada = false;} //4,1,2
		 if ( valor.toString().equals("--X*OXO*O--") && jogada ) { valor.setLength(0); valor.append("X-X*OXO*O--"); jogada = false;} //4,1,3*
		 if ( valor.toString().equals("--X*OXO*-O-") && jogada ) { valor.setLength(0); valor.append("--Q*OQO*QO-"); jogada = false;} //4,1,4
		 if ( valor.toString().equals("--X*OXO*--O") && jogada ) { valor.setLength(0); valor.append("--Q*OQO*Q-O"); jogada = false;} //4,1,5

		 if ( valor.toString().equals("XO-*OX-*O--") && jogada ) { valor.setLength(0); valor.append("QO-*OQ-*O-Q"); jogada = false;} //4,2,1
		 if ( valor.toString().equals("X-O*OX-*O--") && jogada ) { valor.setLength(0); valor.append("Q-O*OQ-*O-Q"); jogada = false;} //4,2,2
		 if ( valor.toString().equals("X--*OXO*O--") && jogada ) { valor.setLength(0); valor.append("Q--*OQO*O-Q"); jogada = false;} //4,2,3
		 if ( valor.toString().equals("X--*OX-*OO-") && jogada ) { valor.setLength(0); valor.append("Q--*OQ-*OOQ"); jogada = false;} //4,2,4
		 if ( valor.toString().equals("X--*OX-*O-O") && jogada ) { valor.setLength(0); valor.append("X--*OX-*OXO"); jogada = false;} //4,2,5*

		 if ( valor.toString().equals("O--*OX-*XO-") && jogada ) { valor.setLength(0); valor.append("O-Q*OQ-*QO-"); jogada = false;} //4,3,1
		 if ( valor.toString().equals("-O-*OX-*XO-") && jogada ) { valor.setLength(0); valor.append("-OQ*OQ-*QO-"); jogada = false;} //4,3,2
		 if ( valor.toString().equals("--O*OX-*XO-") && jogada ) { valor.setLength(0); valor.append("--O*OX-*XOX"); jogada = false;} //4,3,3*
		 if ( valor.toString().equals("---*OXO*XO-") && jogada ) { valor.setLength(0); valor.append("--Q*OQO*QO-"); jogada = false;} //4,3,4
		 if ( valor.toString().equals("---*OX-*XOO") && jogada ) { valor.setLength(0); valor.append("--Q*OQ-*QOO"); jogada = false;} //4,3,5

		 if ( valor.toString().equals("OX-*OX-*--O") && jogada ) { valor.setLength(0); valor.append("OQ-*OQ-*-QO"); jogada = false;} //4,4,1
		 if ( valor.toString().equals("-XO*OX-*--O") && jogada ) { valor.setLength(0); valor.append("-QO*OQ-*-QO"); jogada = false;} //4,4,2
		 if ( valor.toString().equals("-X-*OXO*--O") && jogada ) { valor.setLength(0); valor.append("-Q-*OQO*-QO"); jogada = false;} //4,4,3
		 if ( valor.toString().equals("-X-*OX-*O-O") && jogada ) { valor.setLength(0); valor.append("-Q-*OQ-*OQO"); jogada = false;} //4,4,4
		 if ( valor.toString().equals("-X-*OX-*-OO") && jogada ) { valor.setLength(0); valor.append("-X-*OX-*XOO"); jogada = false;} //4,4,5*

		 if ( valor.toString().equals("O--*-O-*--X") && jogada ) { valor.setLength(0); valor.append("O--*-O-*X-X"); jogada = false;} //5,1*
		 if ( valor.toString().equals("-O-*-O-*--X") && jogada ) { valor.setLength(0); valor.append("-O-*-O-*-XX"); jogada = false;} //5,2*
		 if ( valor.toString().equals("--O*-O-*--X") && jogada ) { valor.setLength(0); valor.append("--O*-O-*X-X"); jogada = false;} //5,3*
		 if ( valor.toString().equals("---*OO-*--X") && jogada ) { valor.setLength(0); valor.append("---*OOX*--X"); jogada = false;} //5,4*
		 if ( valor.toString().equals("---*-OO*--X") && jogada ) { valor.setLength(0); valor.append("---*XOO*--X"); jogada = false;} //5,5*
		 if ( valor.toString().equals("---*-O-*O-X") && jogada ) { valor.setLength(0); valor.append("--X*-O-*O-X"); jogada = false;} //5,6*
		 if ( valor.toString().equals("---*-O-*-OX") && jogada ) { valor.setLength(0); valor.append("-X-*-O-*-OX"); jogada = false;} //5,7*
		

		 if ( valor.toString().equals("OO-*-O-*X-X") && jogada ) { valor.setLength(0); valor.append("OO-*-O-*QQQ"); jogada = false;} //5,1,1
		 if ( valor.toString().equals("O-O*-O-*X-X") && jogada ) { valor.setLength(0); valor.append("O-O*-O-*QQQ"); jogada = false;} //5,1,2
		 if ( valor.toString().equals("O--*OO-*X-X") && jogada ) { valor.setLength(0); valor.append("O--*OO-*QQQ"); jogada = false;} //5,1,3
		 if ( valor.toString().equals("O--*-OO*X-X") && jogada ) { valor.setLength(0); valor.append("O--*-OO*QQQ"); jogada = false;} //5,1,4
		 if ( valor.toString().equals("O--*-O-*XOX") && jogada ) { valor.setLength(0); valor.append("OX-*-O-*XOX"); jogada = false;} //5,1,5*

		 if ( valor.toString().equals("OO-*-O-*-XX") && jogada ) { valor.setLength(0); valor.append("OO-*-O-*QQQ"); jogada = false;} //5,2,1
		 if ( valor.toString().equals("-OO*-O-*-XX") && jogada ) { valor.setLength(0); valor.append("-OO*-O-*QQQ"); jogada = false;} //5,2,2
		 if ( valor.toString().equals("-O-*OO-*-XX") && jogada ) { valor.setLength(0); valor.append("-O-*OO-*QQQ"); jogada = false;} //5,2,3
		 if ( valor.toString().equals("-O-*-OO*-XX") && jogada ) { valor.setLength(0); valor.append("-O-*-OO*QQQ"); jogada = false;} //5,2,4
		 if ( valor.toString().equals("-O-*-O-*OXX") && jogada ) { valor.setLength(0); valor.append("-OX*-O-*OXX"); jogada = false;} //5,2,5*

		 if ( valor.toString().equals("O-O*-O-*X-X") && jogada ) { valor.setLength(0); valor.append("O-O*-O-*QQQ"); jogada = false;} //5,3,1
		 if ( valor.toString().equals("-OO*-O-*X-X") && jogada ) { valor.setLength(0); valor.append("-OO*-O-*QQQ"); jogada = false;} //5,3,2
		 if ( valor.toString().equals("--O*OO-*X-X") && jogada ) { valor.setLength(0); valor.append("--O*OO-*QQQ"); jogada = false;} //5,3,3
		 if ( valor.toString().equals("--O*-OO*X-X") && jogada ) { valor.setLength(0); valor.append("--O*-OO*QQQ"); jogada = false;} //5,3,4
		 if ( valor.toString().equals("--O*-O-*XOX") && jogada ) { valor.setLength(0); valor.append("-XO*-O-*XOX"); jogada = false;} //5,3,5*

		 if ( valor.toString().equals("O--*OOX*--X") && jogada ) { valor.setLength(0); valor.append("O-Q*OOQ*--Q"); jogada = false;} //5,4,1
		 if ( valor.toString().equals("-O-*OOX*--X") && jogada ) { valor.setLength(0); valor.append("-OQ*OOQ*--Q"); jogada = false;} //5,4,2
		 if ( valor.toString().equals("--O*OOX*--X") && jogada ) { valor.setLength(0); valor.append("--O*OOX*X-X"); jogada = false;} //5,4,3*
		 if ( valor.toString().equals("---*OOX*O-X") && jogada ) { valor.setLength(0); valor.append("--Q*OOQ*O-Q"); jogada = false;} //5,4,4
		 if ( valor.toString().equals("---*OOX*-OX") && jogada ) { valor.setLength(0); valor.append("--Q*OOQ*-OQ"); jogada = false;} //5,4,5

		 if ( valor.toString().equals("O--*XOO*--X") && jogada ) { valor.setLength(0); valor.append("O--*XOO*X-X"); jogada = false;} //5,5,1*
		 if ( valor.toString().equals("-O-*XOO*--X") && jogada ) { valor.setLength(0); valor.append("-O-*XOO*-XX"); jogada = false;} //5,5,2*
		 if ( valor.toString().equals("--O*XOO*--X") && jogada ) { valor.setLength(0); valor.append("--O*XOO*X-X"); jogada = false;} //5,5,3*
		 if ( valor.toString().equals("---*XOO*O-X") && jogada ) { valor.setLength(0); valor.append("--X*XOO*O-X"); jogada = false;} //5,5,4*
		 if ( valor.toString().equals("---*XOO*-OX") && jogada ) { valor.setLength(0); valor.append("-X-*XOO*-OX"); jogada = false;} //5,5,5*

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

		 // Respostas para as quarta e quinta jogadas

		 // Respostas para 1,1,3*
		 if ( valor.toString().equals("OOX*XXO*O--") && jogada ) { valor.setLength(0); valor.append("OOX*XXO*O-X"); jogada = false;}//*
		 if ( valor.toString().equals("OOX*XX-*OO-") && jogada ) { valor.setLength(0); valor.append("OOX*QQQ*OO-"); jogada = false;}
		 if ( valor.toString().equals("OOX*XX-*O-O") && jogada ) { valor.setLength(0); valor.append("OOX*QQQ*O-O"); jogada = false;}

		 if ( valor.toString().equals("OOX*XXO*OOX") && jogada ) { valor.setLength(0); valor.append("OOX*XXO*OOX"); jogada = false;}

		 // Respostas para 1,2,4*
		 if ( valor.toString().equals("OXO*OXX*-O-") && jogada ) { valor.setLength(0); valor.append("OXO*OXX*XO-"); jogada = false;}//*
		 if ( valor.toString().equals("OXO*-XX*OO-") && jogada ) { valor.setLength(0); valor.append("OXO*QQQ*OO-"); jogada = false;}
		 if ( valor.toString().equals("OXO*-XX*-OO") && jogada ) { valor.setLength(0); valor.append("OXO*QQQ*-OO"); jogada = false;}

		 if ( valor.toString().equals("OXO*OXX*XOO") && jogada ) { valor.setLength(0); valor.append("OXO*OXX*XOO"); jogada = false;}

		 //Respostas para 1,3,2*
		 if ( valor.toString().equals("OXO*OXO*X--") && jogada ) { valor.setLength(0); valor.append("OQO*OQO*XQ-"); jogada = false;}
		 if ( valor.toString().equals("OXO*OX-*XO-") && jogada ) { valor.setLength(0); valor.append("OXO*OX-*XOX"); jogada = false;}//*
		 if ( valor.toString().equals("OXO*OX-*X-O") && jogada ) { valor.setLength(0); valor.append("OQO*OQ-*XQO"); jogada = false;}

		 if ( valor.toString().equals("OXO*OXO*XOX") && jogada ) { valor.setLength(0); valor.append("OXO*OXO*XOX"); jogada = false;}

		 //Respostas para 1,4,4*
		 if ( valor.toString().equals("OXO*-XO*XO-") && jogada ) { valor.setLength(0); valor.append("OXO*-XO*XOX"); jogada = false;}//*
		 if ( valor.toString().equals("OX-*OXO*XO-") && jogada ) { valor.setLength(0); valor.append("OXQ*OQO*QO-"); jogada = false;}
		 if ( valor.toString().equals("OX-*-XO*XOO") && jogada ) { valor.setLength(0); valor.append("OXQ*-QO*QOO"); jogada = false;}

		 if ( valor.toString().equals("OXO*OXO*XOX") && jogada ) { valor.setLength(0); valor.append("OXO*OXO*XOX"); jogada = false;}

		 //Respostas para 1,5,3*
		 if ( valor.toString().equals("OO-*XXO*OX-") && jogada ) { valor.setLength(0); valor.append("OOX*XXO*OX-"); jogada = false;}
		 if ( valor.toString().equals("O-O*XXO*OX-") && jogada ) { valor.setLength(0); valor.append("OQO*XQO*OQ-"); jogada = false;}//*
		 if ( valor.toString().equals("O--*XXO*OXO") && jogada ) { valor.setLength(0); valor.append("OQ-*XQO*OQO"); jogada = false;}//*

		 if ( valor.toString().equals("OOX*XXO*OXO") && jogada ) { valor.setLength(0); valor.append("OOX*XXO*OXO"); jogada = false;}

		 //Respostas para 1,6,3*
		 if ( valor.toString().equals("OOX*XXO*-O-") && jogada ) { valor.setLength(0); valor.append("OOQ*XQO*QO-"); jogada = false;}
		 if ( valor.toString().equals("O-X*XXO*OO-") && jogada ) { valor.setLength(0); valor.append("O-X*XXO*OOX"); jogada = false;}//*
		 if ( valor.toString().equals("O-X*XXO*-OO") && jogada ) { valor.setLength(0); valor.append("O-Q*XQO*QOO"); jogada = false;}

		 if ( valor.toString().equals("OOX*XXO*OOX") && jogada ) { valor.setLength(0); valor.append("OOX*XXO*OOX"); jogada = false;}

		 //Respostas para 1,7,3*
		 if ( valor.toString().equals("OO-*OXX*X-O") && jogada ) { valor.setLength(0); valor.append("OOQ*OQX*Q-O"); jogada = false;}
		 if ( valor.toString().equals("O-O*OXX*X-O") && jogada ) { valor.setLength(0); valor.append("OXO*OXX*X-O"); jogada = false;}//*
		 if ( valor.toString().equals("O--*OXX*XOO") && jogada ) { valor.setLength(0); valor.append("O-Q*OQX*QOO"); jogada = false;}

		 if ( valor.toString().equals("OXO*OXX*XOO") && jogada ) { valor.setLength(0); valor.append("OXO*OXX*XOO"); jogada = false;}

		 //Respostas para 2,1,5*
		 if ( valor.toString().equals("XOO*OXX*--O") && jogada ) { valor.setLength(0); valor.append("XOO*OXX*X-O"); jogada = false;}//*
		 if ( valor.toString().equals("XOO*-XX*O-O") && jogada ) { valor.setLength(0); valor.append("XOO*QQQ*O-O"); jogada = false;}
		 if ( valor.toString().equals("XOO*-XX*-OO") && jogada ) { valor.setLength(0); valor.append("XOO*QQQ*-OO"); jogada = false;}

		 if ( valor.toString().equals("XOO*OXX*XOO") && jogada ) { valor.setLength(0); valor.append("XOO*OXX*XOO"); jogada = false;}

		 //Respostas para 2,2,5*
		 if ( valor.toString().equals("XOX*OXO*--O") && jogada ) { valor.setLength(0); valor.append("XOQ*OQO*Q-O"); jogada = false;}
		 if ( valor.toString().equals("XOX*OX-*O-O") && jogada ) { valor.setLength(0); valor.append("XOX*OX-*OXO"); jogada = false;}//*
		 if ( valor.toString().equals("XOX*OX-*-OO") && jogada ) { valor.setLength(0); valor.append("XOQ*OQ-*QOO"); jogada = false;}

		 if ( valor.toString().equals("XOX*OXO*OXO") && jogada ) { valor.setLength(0); valor.append("XOX*OXO*OXO"); jogada = false;}

		 //Respostas para 2,3,3*
		 if ( valor.toString().equals("OOX*-XO*O-X") && jogada ) { valor.setLength(0); valor.append("OOX*XXO*O-X"); jogada = false;}//*
		 if ( valor.toString().equals("-OX*OXO*O-X") && jogada ) { valor.setLength(0); valor.append("QOX*OQO*O-Q"); jogada = false;}
		 if ( valor.toString().equals("-OX*-XO*OOX") && jogada ) { valor.setLength(0); valor.append("QOX*-QO*OOQ"); jogada = false;}

		 if ( valor.toString().equals("OOX*XXO*OOX") && jogada ) { valor.setLength(0); valor.append("OOX*XXO*O-X"); jogada = false;}

		 //Respostas para 2,4,3*
		 if ( valor.toString().equals("XOO*OXX*O--") && jogada ) { valor.setLength(0); valor.append("QOO*OQX*O-Q"); jogada = false;}
		 if ( valor.toString().equals("XO-*OXX*OO-") && jogada ) { valor.setLength(0); valor.append("QO-*OQX*OOQ"); jogada = false;}
		 if ( valor.toString().equals("XO-*OXX*O-O") && jogada ) { valor.setLength(0); valor.append("XO-*OXX*OXO"); jogada = false;}//*

		 if ( valor.toString().equals("XOO*OXX*OXO") && jogada ) { valor.setLength(0); valor.append("XOO*OXX*OXO"); jogada = false;}

		 //Respostas para 2,5,1*
		 if ( valor.toString().equals("OOX*OX-*-OX") && jogada ) { valor.setLength(0); valor.append("OOQ*OQ-*QOX"); jogada = false;}
		 if ( valor.toString().equals("OOX*-XO*-OX") && jogada ) { valor.setLength(0); valor.append("OOQ*-QO*QOX"); jogada = false;}
		 if ( valor.toString().equals("OOX*-X-*OOX") && jogada ) { valor.setLength(0); valor.append("OOQ*-XQ*OOQ"); jogada = false;}

		 //Respostas para 2,6,3*
		 if ( valor.toString().equals("OOX*XXO*--O") && jogada ) { valor.setLength(0); valor.append("OOQ*XQO*Q-O"); jogada = false;}
		 if ( valor.toString().equals("-OX*XXO*O-O") && jogada ) { valor.setLength(0); valor.append("-OX*XXO*OXO"); jogada = false;}//*
		 if ( valor.toString().equals("-OX*XXO*-OO") && jogada ) { valor.setLength(0); valor.append("-OQ*XQO*QOO"); jogada = false;}

		 if ( valor.toString().equals("OOX*XXO*O-O") && jogada ) { valor.setLength(0); valor.append("-OX*XXO*OXO"); jogada = false;}

		 //Respostas para 3,1,4*
		 if ( valor.toString().equals("XXO*OXO*-O-") && jogada ) { valor.setLength(0); valor.append("QXO*OQO*-OQ"); jogada = false;}
		 if ( valor.toString().equals("XXO*OX-*OO-") && jogada ) { valor.setLength(0); valor.append("QXO*OQ-*OOQ"); jogada = false;}
		 if ( valor.toString().equals("XXO*OX-*-OO") && jogada ) { valor.setLength(0); valor.append("XXO*OX-*XOO"); jogada = false;}//*

		 if ( valor.toString().equals("XXO*OXO*XOO") && jogada ) { valor.setLength(0); valor.append("XXO*OXO*XOO"); jogada = false;}

		 //Respostas para 3,2,1*
		 if ( valor.toString().equals("OXO*OXO*--X") && jogada ) { valor.setLength(0); valor.append("OQO*OQO*-QX"); jogada = false;}
		 if ( valor.toString().equals("OXO*-XO*O-X") && jogada ) { valor.setLength(0); valor.append("OQO*-QO*OQX"); jogada = false;}
		 if ( valor.toString().equals("OXO*-XO*-OX") && jogada ) { valor.setLength(0); valor.append("OXO*-XO*XOX"); jogada = false;}//*

		 if ( valor.toString().equals("OXO*OXO*-OX") && jogada ) { valor.setLength(0); valor.append("OXO*OXO*XOX"); jogada = false;}

		 //Respostas para 3,3,3*
		 if ( valor.toString().equals("O-O*XXO*O-X") && jogada ) { valor.setLength(0); valor.append("OXO*XXO*O-X"); jogada = false;}//*
		 if ( valor.toString().equals("-OO*XXO*O-X") && jogada ) { valor.setLength(0); valor.append("QOO*XQO*O-Q"); jogada = false;}
		 if ( valor.toString().equals("--O*XXO*OOX") && jogada ) { valor.setLength(0); valor.append("Q-O*XQO*OOQ"); jogada = false;}

		 if ( valor.toString().equals("OXO*XXO*OOX") && jogada ) { valor.setLength(0); valor.append("OXO*XXO*OOX"); jogada = false;}

		 //Respostas para 3,4,3*
		 if ( valor.toString().equals("O-O*XXO*-OX") && jogada ) { valor.setLength(0); valor.append("OXO*XXO*-OX"); jogada = false;}//*
		 if ( valor.toString().equals("-OO*XXO*-OX") && jogada ) { valor.setLength(0); valor.append("QOO*XQO*-OQ"); jogada = false;}
		 if ( valor.toString().equals("--O*XXO*OOX") && jogada ) { valor.setLength(0); valor.append("Q-O*XQO*OOQ"); jogada = false;}

		 if ( valor.toString().equals("OXO*XXO*OOX") && jogada ) { valor.setLength(0); valor.append("OXO*XXO*OOX"); jogada = false;}

		 //Resposta para 3,5,3*
		 if ( valor.toString().equals("O-O*OXX*-XO") && jogada ) { valor.setLength(0); valor.append("OQO*OQX*-QO"); jogada = false;}
		 if ( valor.toString().equals("-OO*OXX*-XO") && jogada ) { valor.setLength(0); valor.append("XOO*OXX*-XO"); jogada = false;}//*
		 if ( valor.toString().equals("--O*OXX*OXO") && jogada ) { valor.setLength(0); valor.append("-QO*OQX*OQO"); jogada = false;}

		 if ( valor.toString().equals("XOO*OXX*OXO") && jogada ) { valor.setLength(0); valor.append("XOO*OXX*OXO"); jogada = false;}

		 //Resposta para 4,1,3*
		 if ( valor.toString().equals("XOX*OXO*O--") && jogada ) { valor.setLength(0); valor.append("QOX*OQO*O-Q"); jogada = false;}
		 if ( valor.toString().equals("X-X*OXO*OO-") && jogada ) { valor.setLength(0); valor.append("Q-X*OQO*OOQ"); jogada = false;}
		 if ( valor.toString().equals("X-X*OXO*O-O") && jogada ) { valor.setLength(0); valor.append("QQQ*OXO*O-O"); jogada = false;}

		 //Respostas para 4,2,5*
		 if ( valor.toString().equals("XO-*OX-*OXO") && jogada ) { valor.setLength(0); valor.append("XOX*OX-*OXO"); jogada = false;}//*
		 if ( valor.toString().equals("X-O*OX-*OXO") && jogada ) { valor.setLength(0); valor.append("XQO*OQ-*OQO"); jogada = false;}
		 if ( valor.toString().equals("X--*OXO*OXO") && jogada ) { valor.setLength(0); valor.append("XQ-*OQO*OQO"); jogada = false;}

		 if ( valor.toString().equals("XOX*OXO*OXO") && jogada ) { valor.setLength(0); valor.append("XOX*OXO*OXO"); jogada = false;}

		 //Respostas para 4,3,3*
		 if ( valor.toString().equals("O-O*OX-*XOX") && jogada ) { valor.setLength(0); valor.append("OXO*OX-*XOX"); jogada = false;}//*
		 if ( valor.toString().equals("-OO*OX-*XOX") && jogada ) { valor.setLength(0); valor.append("QOO*OQ-*XOQ"); jogada = false;}
		 if ( valor.toString().equals("--O*OXO*XOX") && jogada ) { valor.setLength(0); valor.append("Q-O*OQO*XOQ"); jogada = false;}

		 if ( valor.toString().equals("OXO*OXO*XOX") && jogada ) { valor.setLength(0); valor.append("OXO*OXO*XOX"); jogada = false;}

		 //Respostas para 4,4,5*
		 if ( valor.toString().equals("OX-*OX-*XOO") && jogada ) { valor.setLength(0); valor.append("OXQ*OQ-*QOO"); jogada = false;}
		 if ( valor.toString().equals("-XO*OX-*XOO") && jogada ) { valor.setLength(0); valor.append("-XO*OXX*XOO"); jogada = false;}//*
		 if ( valor.toString().equals("-X-*OXO*XOO") && jogada ) { valor.setLength(0); valor.append("-XQ*OQO*QOO"); jogada = false;}

		 if ( valor.toString().equals("OXO*OXX*XOO") && jogada ) { valor.setLength(0); valor.append("OXO*OXX*XOO"); jogada = false;}

		 //Resposta para 5,1,5*
		 if ( valor.toString().equals("OXO*-O-*XOX") && jogada ) { valor.setLength(0); valor.append("OXO*XO-*XOX"); jogada = false;}//*
		 if ( valor.toString().equals("OX-*OO-*XOX") && jogada ) { valor.setLength(0); valor.append("OX-*OOX*XOX"); jogada = false;}//*
		 if ( valor.toString().equals("OX-*-OO*XOX") && jogada ) { valor.setLength(0); valor.append("OX-*XOO*XOX"); jogada = false;}//*

		 if ( valor.toString().equals("OXO*XOO*XOX") && jogada ) { valor.setLength(0); valor.append("OXO*XOO*XOX"); jogada = false;}
		 if ( valor.toString().equals("OXO*OOX*XOX") && jogada ) { valor.setLength(0); valor.append("OXO*OOX*XOX"); jogada = false;}
		 if ( valor.toString().equals("OXO*XOO*XOX") && jogada ) { valor.setLength(0); valor.append("OX-*XOO*XOX"); jogada = false;}

		 //Respostas para 5,2,5*
		 if ( valor.toString().equals("OOX*-O-*OXX") && jogada ) { valor.setLength(0); valor.append("OOQ*-OQ*OXQ"); jogada = false;}
		 if ( valor.toString().equals("-OX*OO-*OXX") && jogada ) { valor.setLength(0); valor.append("-OQ*OOQ*OXQ"); jogada = false;}
		 if ( valor.toString().equals("-OX*-OO*OXX") && jogada ) { valor.setLength(0); valor.append("-OX*XOO*OXX"); jogada = false;}//*

		 if ( valor.toString().equals("OOX*XOO*OXX") && jogada ) { valor.setLength(0); valor.append("OOX*XOO*OXX"); jogada = false;}

		 //Respostas para 5,3,5*
		 if ( valor.toString().equals("OXO*-O-*XOX") && jogada ) { valor.setLength(0); valor.append("OXO*XO-*XOX"); jogada = false;}//*
		 if ( valor.toString().equals("-XO*OO-*XOX") && jogada ) { valor.setLength(0); valor.append("-XO*OOX*XOX"); jogada = false;}//*
		 if ( valor.toString().equals("-XO*-OO*XOX") && jogada ) { valor.setLength(0); valor.append("-XO*XOO*XOX"); jogada = false;}//*

		 if ( valor.toString().equals("OXO*XOO*XOX") && jogada ) { valor.setLength(0); valor.append("OXO*XOO*XOX"); jogada = false;}
		 if ( valor.toString().equals("OXO*OOX*XOX") && jogada ) { valor.setLength(0); valor.append("OXO*OOX*XOX"); jogada = false;}
		 if ( valor.toString().equals("OXO*XOO*XOX") && jogada ) { valor.setLength(0); valor.append("OXO*XOO*XOX"); jogada = false;}

		 //Respostas para 5,4,3*
		 if ( valor.toString().equals("O-O*OOX*X-X") && jogada ) { valor.setLength(0); valor.append("O-O*OOX*QQQ"); jogada = false;}
		 if ( valor.toString().equals("-OO*OOX*X-X") && jogada ) { valor.setLength(0); valor.append("-OO*OOX*QQQ"); jogada = false;}
		 if ( valor.toString().equals("--O*OOX*XOX") && jogada ) { valor.setLength(0); valor.append("-XO*OOX*XOX"); jogada = false;}//*

		 if ( valor.toString().equals("OXO*OOX*XOX") && jogada ) { valor.setLength(0); valor.append("OXO*OOX*XOX"); jogada = false;}

		 //Respostas para 5,5,1*
		 if ( valor.toString().equals("OO-*XOO*X-X") && jogada ) { valor.setLength(0); valor.append("O--*XOO*QQQ"); jogada = false;}
		 if ( valor.toString().equals("O-O*XOO*X-X") && jogada ) { valor.setLength(0); valor.append("O--*XOO*QQQ"); jogada = false;}
		 if ( valor.toString().equals("O--*XOO*XOX") && jogada ) { valor.setLength(0); valor.append("OX-*XOO*XOX"); jogada = false;}//*

		 if ( valor.toString().equals("OXO*XOO*XOX") && jogada ) { valor.setLength(0); valor.append("OXO*XOO*XOX"); jogada = false;}

		 //Resposta para 5,5,2*
		 if ( valor.toString().equals("OO-*XOO*-XX") && jogada ) { valor.setLength(0); valor.append("OO-*XOO*QQQ"); jogada = false;}
		 if ( valor.toString().equals("-OO*XOO*-XX") && jogada ) { valor.setLength(0); valor.append("-OO*XOO*QQQ"); jogada = false;}
		 if ( valor.toString().equals("-O-*XOO*OXX") && jogada ) { valor.setLength(0); valor.append("-OX*XOO*OXX"); jogada = false;}//*

		 if ( valor.toString().equals("OOX*XOO*OXX") && jogada ) { valor.setLength(0); valor.append("OOX*XOO*OXX"); jogada = false;}

		 //Respostas para 5,5,3*
		 if ( valor.toString().equals("O-O*XOO*X-X") && jogada ) { valor.setLength(0); valor.append("O-O*XOO*QQQ"); jogada = false;}
		 if ( valor.toString().equals("-OO*XOO*X-X") && jogada ) { valor.setLength(0); valor.append("-OO*XOO*QQQ"); jogada = false;}
		 if ( valor.toString().equals("--O*XOO*XOX") && jogada ) { valor.setLength(0); valor.append("Q-O*QOO*QOX"); jogada = false;}

		 //Respostas para 5,5,4*
		 if ( valor.toString().equals("O-X*XOO*O-X") && jogada ) { valor.setLength(0); valor.append("OXX*XOO*O-X"); jogada = false;}//*
		 if ( valor.toString().equals("-OX*XOO*O-X") && jogada ) { valor.setLength(0); valor.append("-OX*XOO*OXX"); jogada = false;}//*
		 if ( valor.toString().equals("--X*XOO*OOX") && jogada ) { valor.setLength(0); valor.append("-XX*XOO*OOX"); jogada = false;}//*

		 if ( valor.toString().equals("OXX*XOO*OOX") && jogada ) { valor.setLength(0); valor.append("OXX*XOO*OOX"); jogada = false;}
		 if ( valor.toString().equals("OOX*XOO*OXX") && jogada ) { valor.setLength(0); valor.append("OOX*XOO*OXX"); jogada = false;}
		 if ( valor.toString().equals("OXX*XOO*OOX") && jogada ) { valor.setLength(0); valor.append("OXX*XOO*OOX"); jogada = false;}

		 //Resposta para 5,5,5*
		 if ( valor.toString().equals("OX-*XOO*-OX") && jogada ) { valor.setLength(0); valor.append("OXX*XOO*-OX"); jogada = false;}//*
		 if ( valor.toString().equals("-XO*XOO*-OX") && jogada ) { valor.setLength(0); valor.append("-XO*XOO*XOX"); jogada = false;}//*
		 if ( valor.toString().equals("-X-*XOO*OOX") && jogada ) { valor.setLength(0); valor.append("-XX*XOO*OOX"); jogada = false;}//*

		 if ( valor.toString().equals("OXX*XOO*OOX") && jogada ) { valor.setLength(0); valor.append("OXX*XOO*OOX"); jogada = false;}
		 if ( valor.toString().equals("OXO*XOO*XOX") && jogada ) { valor.setLength(0); valor.append("OXO*XOO*XOX"); jogada = false;}
		 if ( valor.toString().equals("OXX*XOO*OOX") && jogada ) { valor.setLength(0); valor.append("OXX*XOO*OOX"); jogada = false;}

		 //Repostas para 5,6,4*
		 if ( valor.toString().equals("O-X*XOO*O-X") && jogada ) { valor.setLength(0); valor.append("OXX*XOO*O-X"); jogada = false;}//*
		 if ( valor.toString().equals("-OX*XOO*O-X") && jogada ) { valor.setLength(0); valor.append("-OX*XOO*OXX"); jogada = false;}//*
		 if ( valor.toString().equals("--X*XOO*OOX") && jogada ) { valor.setLength(0); valor.append("-XX*XOO*OOX"); jogada = false;}//*

		 if ( valor.toString().equals("OXX*XOO*OOX") && jogada ) { valor.setLength(0); valor.append("OXX*XOO*OOX"); jogada = false;}
		 if ( valor.toString().equals("OOX*XOO*OXX") && jogada ) { valor.setLength(0); valor.append("OOX*XOO*OXX"); jogada = false;}
		 if ( valor.toString().equals("OXX*XOO*OOX") && jogada ) { valor.setLength(0); valor.append("-XX*XOO*OOX"); jogada = false;}

		 //Repostas para 5,7,1*
		 if ( valor.toString().equals("OXX*OO-*-OX") && jogada ) { valor.setLength(0); valor.append("OXQ*OOQ*-OQ"); jogada = false;}
		 if ( valor.toString().equals("OXX*-OO*-OX") && jogada ) { valor.setLength(0); valor.append("OXX*XOO*-OX"); jogada = false;}//*
		 if ( valor.toString().equals("OXX*-O-*OOX") && jogada ) { valor.setLength(0); valor.append("OXQ*-OQ*OOQ"); jogada = false;}

		 if ( valor.toString().equals("OXX*XOO*OOX") && jogada ) { valor.setLength(0); valor.append("OXX*XOO*OOX"); jogada = false;}

		 //Repostas para 5,7,2*
		 if ( valor.toString().equals("OXO*-O-*XOX") && jogada ) { valor.setLength(0); valor.append("OXO*XO-*XOX"); jogada = false;}//*
		 if ( valor.toString().equals("-XO*OO-*XOX") && jogada ) { valor.setLength(0); valor.append("-XO*OOX*XOX"); jogada = false;}//*
		 if ( valor.toString().equals("-XO*-OO*XOX") && jogada ) { valor.setLength(0); valor.append("-XO*XOO*XOX"); jogada = false;}//*

		 if ( valor.toString().equals("OXO*XOO*XOX") && jogada ) { valor.setLength(0); valor.append("OXO*XOO*XOX"); jogada = false;}
		 if ( valor.toString().equals("OXO*OOX*XOX") && jogada ) { valor.setLength(0); valor.append("OXO*OOX*XOX"); jogada = false;}
		 if ( valor.toString().equals("OXO*XOO*XOX") && jogada ) { valor.setLength(0); valor.append("OXO*XOO*XOX"); jogada = false;}

		 //Repostas para 5,7,3*
		 if ( valor.toString().equals("OX-*OOX*-OX") && jogada ) { valor.setLength(0); valor.append("OXQ*OOQ*-OQ"); jogada = false;}
		 if ( valor.toString().equals("-XO*OOX*-OX") && jogada ) { valor.setLength(0); valor.append("-XO*OOX*XOX"); jogada = false;}//*
		 if ( valor.toString().equals("-X-*OOX*OOX") && jogada ) { valor.setLength(0); valor.append("-XQ*OOQ*OOQ"); jogada = false;}

		 if ( valor.toString().equals("OXO*OOX*XOX") && jogada ) { valor.setLength(0); valor.append("OXO*OOX*XOX"); jogada = false;}

		 //Repostas para 5,7,4*
		 if ( valor.toString().equals("OX-*XOO*-OX") && jogada ) { valor.setLength(0); valor.append("OXX*XOO*-OX"); jogada = false;}//*
		 if ( valor.toString().equals("-XO*XOO*-OX") && jogada ) { valor.setLength(0); valor.append("-XO*XOO*XOX"); jogada = false;}//*
		 if ( valor.toString().equals("-X-*XOO*OOX") && jogada ) { valor.setLength(0); valor.append("-XX*XOO*OOX"); jogada = false;}//*

		 if ( valor.toString().equals("OXX*XOO*OOX") && jogada ) { valor.setLength(0); valor.append("OXX*XOO*XOX"); jogada = false;}
		 if ( valor.toString().equals("OXO*XOO*XOX") && jogada ) { valor.setLength(0); valor.append("OXO*XOO*XOX"); jogada = false;}
		 if ( valor.toString().equals("OXX*XOO*OOX") && jogada ) { valor.setLength(0); valor.append("OXX*XOO*OOX"); jogada = false;}

		 //Repostas para 5,7,5*
		 if ( valor.toString().equals("OXX*-O-*OOX") && jogada ) { valor.setLength(0); valor.append("OXQ*-OQ*OOQ"); jogada = false;}
		 if ( valor.toString().equals("-XX*OO-*OOX") && jogada ) { valor.setLength(0); valor.append("QQQ*OO-*OOX"); jogada = false;}
		 if ( valor.toString().equals("-XX*-OO*OOX") && jogada ) { valor.setLength(0); valor.append("QQQ*-OO*OOX"); jogada = false;}

		 //Respostas para 6,1,4*
		 if ( valor.toString().equals("OX-*-XO*OOX") && jogada ) { valor.setLength(0); valor.append("OX-*XXO*OOX"); jogada = false;}//*
		 if ( valor.toString().equals("-XO*-XO*OOX") && jogada ) { valor.setLength(0); valor.append("QXO*-QO*OOQ"); jogada = false;}
		 if ( valor.toString().equals("-X-*OXO*OOX") && jogada ) { valor.setLength(0); valor.append("QX-*OQO*OOQ"); jogada = false;}

		 if ( valor.toString().equals("OXO*XXO*OOX") && jogada ) { valor.setLength(0); valor.append("OXO*XXO*OOX"); jogada = false;}

		 //Respostas para 6,2,1*
		 if ( valor.toString().equals("OOX*-QO*XOX") && jogada ) { valor.setLength(0); valor.append("OOQ*-QO*QOX"); jogada = false;}
		 if ( valor.toString().equals("O-O*-XO*XOX") && jogada ) { valor.setLength(0); valor.append("OXO*-XO*XOX"); jogada = false;}//*
		 if ( valor.toString().equals("O-X*OQO*XOX") && jogada ) { valor.setLength(0); valor.append("O-Q*OQO*QOX"); jogada = false;}

		 if ( valor.toString().equals("OXO*OXO*XOX") && jogada ) { valor.setLength(0); valor.append("OXO*OXO*XOX"); jogada = false;}

		 //Respostas par 6,3,4*
		 if ( valor.toString().equals("O-X*-XO*OXO") && jogada ) { valor.setLength(0); valor.append("OQX*-QO*OQO"); jogada = false;}
		 if ( valor.toString().equals("-OX*-XO*OXO") && jogada ) { valor.setLength(0); valor.append("XOX*-XO*OXO"); jogada = false;}//*
		 if ( valor.toString().equals("--X*OXO*OXO") && jogada ) { valor.setLength(0); valor.append("-QX*OQO*OQO"); jogada = false;}

		 if ( valor.toString().equals("XOX*OXO*OXO") && jogada ) { valor.setLength(0); valor.append("XOX*OXO*OXO"); jogada = false;}

		 //Respostas para 7,1,1*
		 if ( valor.toString().equals("OO-*XX-*OOX") && jogada ) { valor.setLength(0); valor.append("OO-*QQQ*OOX"); jogada = false;}
		 if ( valor.toString().equals("O-O*XX-*OOX") && jogada ) { valor.setLength(0); valor.append("O-O*QQQ*OOX"); jogada = false;}
		 if ( valor.toString().equals("O--*XXO*OOX") && jogada ) { valor.setLength(0); valor.append("O-X*XXO*OOX"); jogada = false;}//*

		 if ( valor.toString().equals("OOX*XXO*OOX") && jogada ) { valor.setLength(0); valor.append("OOX*XXO*OOX"); jogada = false;}

		 //Respostas para 7,2,2*
		 if ( valor.toString().equals("OO-*-XX*OXO") && jogada ) { valor.setLength(0); valor.append("OO-*QQQ*OXO"); jogada = false;}
		 if ( valor.toString().equals("-OO*-XX*OXO") && jogada ) { valor.setLength(0); valor.append("-OO*QQQ*OXO"); jogada = false;}
		 if ( valor.toString().equals("-O-*OXX*OXO") && jogada ) { valor.setLength(0); valor.append("XO-*OXX*OXO"); jogada = false;}//*

		 if ( valor.toString().equals("XOO*OXX*OXO") && jogada ) { valor.setLength(0); valor.append("XOO*OXX*OXO"); jogada = false;}

		 //Respostas para 8,1,3*
		 if ( valor.toString().equals("O-O*-XX*XOO") && jogada ) { valor.setLength(0); valor.append("--O*QQQ*XOO"); jogada = false;}
		 if ( valor.toString().equals("-OO*-XX*XOO") && jogada ) { valor.setLength(0); valor.append("--O*QQQ*XOO"); jogada = false;}
		 if ( valor.toString().equals("--O*OXX*XOO") && jogada ) { valor.setLength(0); valor.append("X-O*OXX*XOO"); jogada = false;}//*

		 if ( valor.toString().equals("XOO*OXX*XOO") && jogada ) { valor.setLength(0); valor.append("XOO*OXX*XOO"); jogada = false;}


	}

}
