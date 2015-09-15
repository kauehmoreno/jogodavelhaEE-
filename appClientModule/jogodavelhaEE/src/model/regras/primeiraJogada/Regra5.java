/**
 * 
 */
package jogodavelhaEE.src.model.regras.primeiraJogada;

import jogodavelhaEE.src.model.util.Smart;

/**
 * @author kaueh
 *
 */
public class Regra5 extends Smart{

	@Override
	public void inteligencia(StringBuilder valor, String opcao, boolean jogada) {
		if(opcao.toUpperCase().equals("x")){
			 
			 
		}else{
			
		
		}
	}

	@Override
	public void sabeTudo(StringBuilder valor, String opcao, boolean jogada) {
		if ( valor.toString().equals("X-O*XOX*---") && jogada ) { valor.setLength(0); valor.append("X-Q*XQX*Q--"); jogada = false;} //4,1,1
		 if ( valor.toString().equals("-XO*XOX*---") && jogada ) { valor.setLength(0); valor.append("-XQ*XQX*Q--"); jogada = false;} //4,1,2
		 if ( valor.toString().equals("--O*XOX*X--") && jogada ) { valor.setLength(0); valor.append("O-O*XOX*X--"); jogada = false;} //4,1,3*
		 if ( valor.toString().equals("--O*XOX*-X-") && jogada ) { valor.setLength(0); valor.append("--Q*XQX*QX-"); jogada = false;} //4,1,4
		 if ( valor.toString().equals("--O*XOX*--X") && jogada ) { valor.setLength(0); valor.append("--Q*XQX*Q-X"); jogada = false;} //4,1,5

		 if ( valor.toString().equals("OX-*XO-*X--") && jogada ) { valor.setLength(0); valor.append("QX-*XQ-*X-Q"); jogada = false;} //4,2,1
		 if ( valor.toString().equals("O-X*XO-*X--") && jogada ) { valor.setLength(0); valor.append("Q-X*XQ-*X-Q"); jogada = false;} //4,2,2
		 if ( valor.toString().equals("O--*XOX*X--") && jogada ) { valor.setLength(0); valor.append("Q--*XQX*X-Q"); jogada = false;} //4,2,3
		 if ( valor.toString().equals("O--*XO-*XX-") && jogada ) { valor.setLength(0); valor.append("Q--*XQ-*XXQ"); jogada = false;} //4,2,4
		 if ( valor.toString().equals("O--*XO-*X-X") && jogada ) { valor.setLength(0); valor.append("O--*XO-*XOX"); jogada = false;} //4,2,5*

		 if ( valor.toString().equals("X--*XO-*OX-") && jogada ) { valor.setLength(0); valor.append("X-Q*XQ-*QX-"); jogada = false;} //4,3,1
		 if ( valor.toString().equals("-X-*XO-*OX-") && jogada ) { valor.setLength(0); valor.append("-XQ*XQ-*QX-"); jogada = false;} //4,3,2
		 if ( valor.toString().equals("--X*XO-*OX-") && jogada ) { valor.setLength(0); valor.append("--X*XO-*OXO"); jogada = false;} //4,3,3*
		 if ( valor.toString().equals("---*XOX*OX-") && jogada ) { valor.setLength(0); valor.append("--Q*XQX*QX-"); jogada = false;} //4,3,4
		 if ( valor.toString().equals("---*XO-*OXX") && jogada ) { valor.setLength(0); valor.append("--Q*XQ-*QXX"); jogada = false;} //4,3,5

		 if ( valor.toString().equals("XO-*XO-*--X") && jogada ) { valor.setLength(0); valor.append("XQ-*XQ-*-QX"); jogada = false;} //4,4,1
		 if ( valor.toString().equals("-OX*XO-*--X") && jogada ) { valor.setLength(0); valor.append("-QX*XQ-*-QX"); jogada = false;} //4,4,2
		 if ( valor.toString().equals("-O-*XOX*--X") && jogada ) { valor.setLength(0); valor.append("-Q-*XQX*-QX"); jogada = false;} //4,4,3
		 if ( valor.toString().equals("-O-*XO-*X-X") && jogada ) { valor.setLength(0); valor.append("-Q-*XQ-*XQX"); jogada = false;} //4,4,4
		 if ( valor.toString().equals("-O-*XO-*-XX") && jogada ) { valor.setLength(0); valor.append("-O-*XO-*OXX"); jogada = false;} //4,4,5*

		 if ( valor.toString().equals("X--*-X-*--O") && jogada ) { valor.setLength(0); valor.append("X--*-X-*O-O"); jogada = false;} //5,1*
		 if ( valor.toString().equals("-X-*-X-*--O") && jogada ) { valor.setLength(0); valor.append("-X-*-X-*-OO"); jogada = false;} //5,2*
		 if ( valor.toString().equals("--X*-X-*--O") && jogada ) { valor.setLength(0); valor.append("--X*-X-*O-O"); jogada = false;} //5,3*
		 if ( valor.toString().equals("---*XX-*--O") && jogada ) { valor.setLength(0); valor.append("---*XXO*--O"); jogada = false;} //5,4*
		 if ( valor.toString().equals("---*-XX*--O") && jogada ) { valor.setLength(0); valor.append("---*OXX*--O"); jogada = false;} //5,5*
		 if ( valor.toString().equals("---*-X-*X-O") && jogada ) { valor.setLength(0); valor.append("--O*-X-*X-O"); jogada = false;} //5,6*
		 if ( valor.toString().equals("---*-X-*-XO") && jogada ) { valor.setLength(0); valor.append("-O-*-X-*-XO"); jogada = false;} //5,7*
		

		 if ( valor.toString().equals("XX-*-X-*O-O") && jogada ) { valor.setLength(0); valor.append("XX-*-X-*QQQ"); jogada = false;} //5,1,1
		 if ( valor.toString().equals("X-X*-X-*O-O") && jogada ) { valor.setLength(0); valor.append("X-X*-X-*QQQ"); jogada = false;} //5,1,2
		 if ( valor.toString().equals("X--*XX-*O-O") && jogada ) { valor.setLength(0); valor.append("X--*XX-*QQQ"); jogada = false;} //5,1,3
		 if ( valor.toString().equals("X--*-XX*O-O") && jogada ) { valor.setLength(0); valor.append("X--*-XX*QQQ"); jogada = false;} //5,1,4
		 if ( valor.toString().equals("X--*-X-*OXO") && jogada ) { valor.setLength(0); valor.append("XO-*-X-*OXO"); jogada = false;} //5,1,5*

		 if ( valor.toString().equals("XX-*-X-*-OO") && jogada ) { valor.setLength(0); valor.append("XX-*-X-*QQQ"); jogada = false;} //5,2,1
		 if ( valor.toString().equals("-XX*-X-*-OO") && jogada ) { valor.setLength(0); valor.append("-XX*-X-*QQQ"); jogada = false;} //5,2,2
		 if ( valor.toString().equals("-X-*XX-*-OO") && jogada ) { valor.setLength(0); valor.append("-X-*XX-*QQQ"); jogada = false;} //5,2,3
		 if ( valor.toString().equals("-X-*-XX*-OO") && jogada ) { valor.setLength(0); valor.append("-X-*-XX*QQQ"); jogada = false;} //5,2,4
		 if ( valor.toString().equals("-X-*-X-*XOO") && jogada ) { valor.setLength(0); valor.append("-XO*-X-*XOO"); jogada = false;} //5,2,5*

		 if ( valor.toString().equals("X-X*-X-*O-O") && jogada ) { valor.setLength(0); valor.append("X-X*-X-*QQQ"); jogada = false;} //5,3,1
		 if ( valor.toString().equals("-XX*-X-*O-O") && jogada ) { valor.setLength(0); valor.append("-XX*-X-*QQQ"); jogada = false;} //5,3,2
		 if ( valor.toString().equals("--X*XX-*O-O") && jogada ) { valor.setLength(0); valor.append("--X*XX-*QQQ"); jogada = false;} //5,3,3
		 if ( valor.toString().equals("--X*-XX*O-O") && jogada ) { valor.setLength(0); valor.append("--X*-XX*QQQ"); jogada = false;} //5,3,4
		 if ( valor.toString().equals("--X*-X-*OXO") && jogada ) { valor.setLength(0); valor.append("-OX*-X-*OXO"); jogada = false;} //5,3,5*

		 if ( valor.toString().equals("X--*XXO*--O") && jogada ) { valor.setLength(0); valor.append("X-Q*XXQ*--Q"); jogada = false;} //5,4,1
		 if ( valor.toString().equals("-X-*XXO*--O") && jogada ) { valor.setLength(0); valor.append("-XQ*XXQ*--Q"); jogada = false;} //5,4,2
		 if ( valor.toString().equals("--X*XXO*--O") && jogada ) { valor.setLength(0); valor.append("--X*XXO*O-O"); jogada = false;} //5,4,3*
		 if ( valor.toString().equals("---*XXO*X-O") && jogada ) { valor.setLength(0); valor.append("--Q*XXQ*X-Q"); jogada = false;} //5,4,4
		 if ( valor.toString().equals("---*XXO*-XO") && jogada ) { valor.setLength(0); valor.append("--Q*XXQ*-XQ"); jogada = false;} //5,4,5

		 if ( valor.toString().equals("X--*OXX*--O") && jogada ) { valor.setLength(0); valor.append("X--*OXX*O-O"); jogada = false;} //5,5,1*
		 if ( valor.toString().equals("-X-*OXX*--O") && jogada ) { valor.setLength(0); valor.append("-X-*OXX*-OO"); jogada = false;} //5,5,2*
		 if ( valor.toString().equals("--X*OXX*--O") && jogada ) { valor.setLength(0); valor.append("--X*OXX*O-O"); jogada = false;} //5,5,3*
		 if ( valor.toString().equals("---*OXX*X-O") && jogada ) { valor.setLength(0); valor.append("--O*OXX*X-O"); jogada = false;} //5,5,4*
		 if ( valor.toString().equals("---*OXX*-XO") && jogada ) { valor.setLength(0); valor.append("-O-*OXX*-XO"); jogada = false;} //5,5,5*

	}

	@Override
	public void inverteNao(StringBuilder valor, String opcao, boolean jogada) {
		 
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

		
	}

}
