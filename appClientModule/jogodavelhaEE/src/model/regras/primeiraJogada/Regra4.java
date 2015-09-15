/**
 * 
 */
package jogodavelhaEE.src.model.regras.primeiraJogada;

import jogodavelhaEE.src.model.util.Smart;

/**
 * @author kaueh
 *
 */
public class Regra4 extends Smart{

	
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
		if ( valor.toString().equals("XX-*-OO*X--") && jogada ) { valor.setLength(0); valor.append("XX-*QQQ*X--"); jogada = false;} //2,4,1
		 if ( valor.toString().equals("-XX*-OO*X--") && jogada ) { valor.setLength(0); valor.append("-XX*QQQ*X--"); jogada = false;} //2,4,2
		 if ( valor.toString().equals("-X-*XOO*X--") && jogada ) { valor.setLength(0); valor.append("OX-*XOO*X--"); jogada = false;} //2,4,3*
		 if ( valor.toString().equals("-X-*-OO*XX-") && jogada ) { valor.setLength(0); valor.append("-X-*QQQ*XX-"); jogada = false;} //2,4,4
		 if ( valor.toString().equals("-X-*-OO*X-X") && jogada ) { valor.setLength(0); valor.append("-X-*QQQ*X-X"); jogada = false;} //2,4,5

		 if ( valor.toString().equals("XX-*-O-*-XO") && jogada ) { valor.setLength(0); valor.append("XXO*-O-*-XO"); jogada = false;} //2,5,1*
		 if ( valor.toString().equals("-XX*-O-*-XO") && jogada ) { valor.setLength(0); valor.append("QXX*-Q-*-XQ"); jogada = false;} //2,5,2
		 if ( valor.toString().equals("-X-*XO-*-XO") && jogada ) { valor.setLength(0); valor.append("QX-*XQ-*-XQ"); jogada = false;} //2,5,3
		 if ( valor.toString().equals("-X-*-OX*-XO") && jogada ) { valor.setLength(0); valor.append("QX-*-QX*-XQ"); jogada = false;} //2,5,4
		 if ( valor.toString().equals("-X-*-O-*XXO") && jogada ) { valor.setLength(0); valor.append("QX-*-Q-*XXQ"); jogada = false;} //2,5,5

		 if ( valor.toString().equals("XX-*OO-*--X") && jogada ) { valor.setLength(0); valor.append("XX-*QQQ*--X"); jogada = false;} //2,6,1
		 if ( valor.toString().equals("-XX*OO-*--X") && jogada ) { valor.setLength(0); valor.append("-XX*QQQ*--X"); jogada = false;} //2,6,2
		 if ( valor.toString().equals("-X-*OOX*--X") && jogada ) { valor.setLength(0); valor.append("-XO*OOX*--X"); jogada = false;} //2,6,3*
		 if ( valor.toString().equals("-X-*OO-*X-X") && jogada ) { valor.setLength(0); valor.append("-X-*QQQ*X-X"); jogada = false;} //2,6,4
		 if ( valor.toString().equals("-X-*OO-*-XX") && jogada ) { valor.setLength(0); valor.append("-X-*QQQ*-XX"); jogada = false;} //2,6,5

		 if ( valor.toString().equals("--X*XO-*---") && jogada ) { valor.setLength(0); valor.append("-OX*XO-*---"); jogada = false;} //3,1*
		 if ( valor.toString().equals("--X*-OX*---") && jogada ) { valor.setLength(0); valor.append("--X*-OX*--O"); jogada = false;} //3,2*
		 if ( valor.toString().equals("--X*-O-*X--") && jogada ) { valor.setLength(0); valor.append("--X*OO-*X--"); jogada = false;} //3,3*
		 if ( valor.toString().equals("--X*-O-*-X-") && jogada ) { valor.setLength(0); valor.append("--X*OO-*-X-"); jogada = false;} //3,4*
		 if ( valor.toString().equals("--X*-O-*--X") && jogada ) { valor.setLength(0); valor.append("--X*-OO*--X"); jogada = false;} //3,5*

		 if ( valor.toString().equals("XOX*XO-*---") && jogada ) { valor.setLength(0); valor.append("XQX*XQ-*-Q-"); jogada = false;} //3,1,1
		 if ( valor.toString().equals("-OX*XOX*---") && jogada ) { valor.setLength(0); valor.append("-QX*XQX*-Q-"); jogada = false;} //3,1,2
		 if ( valor.toString().equals("-OX*XO-*X--") && jogada ) { valor.setLength(0); valor.append("-QX*XQ-*XQ-"); jogada = false;} //3,1,3
		 if ( valor.toString().equals("-OX*XO-*-X-") && jogada ) { valor.setLength(0); valor.append("OOX*XO-*-X-"); jogada = false;} //3,1,4*
		 if ( valor.toString().equals("-OX*XO-*--X") && jogada ) { valor.setLength(0); valor.append("-QX*XQ-*-QX"); jogada = false;} //3,1,5

		 if ( valor.toString().equals("X-X*-OX*--O") && jogada ) { valor.setLength(0); valor.append("XOX*-OX*--O"); jogada = false;} //3,2,1*
		 if ( valor.toString().equals("-XX*-OX*--O") && jogada ) { valor.setLength(0); valor.append("QXX*-QX*--Q"); jogada = false;} //3,2,2
		 if ( valor.toString().equals("--X*XOX*--O") && jogada ) { valor.setLength(0); valor.append("Q-X*XQX*--Q"); jogada = false;} //3,2,3
		 if ( valor.toString().equals("--X*-OX*X-O") && jogada ) { valor.setLength(0); valor.append("Q-X*-QX*X-Q"); jogada = false;} //3,2,4
		 if ( valor.toString().equals("--X*-OX*-XO") && jogada ) { valor.setLength(0); valor.append("Q-X*-QX*-XQ"); jogada = false;} //3,2,5

		 if ( valor.toString().equals("X-X*-O-*X--") && jogada ) { valor.setLength(0); valor.append("X-X*QQQ*X--"); jogada = false;} //3,3,1
		 if ( valor.toString().equals("-XX*OO-*X--") && jogada ) { valor.setLength(0); valor.append("-xX*QQQ*X--"); jogada = false;} //3,3,2
		 if ( valor.toString().equals("--X*OOX*X--") && jogada ) { valor.setLength(0); valor.append("--X*OOX*X-O"); jogada = false;} //3,3,3*
		 if ( valor.toString().equals("--X*OO-*XX-") && jogada ) { valor.setLength(0); valor.append("--X*QQQ*XX-"); jogada = false;} //3,3,4
		 if ( valor.toString().equals("--X*OO-*X-X") && jogada ) { valor.setLength(0); valor.append("--X*QQQ*X-X"); jogada = false;} //3,3,5

		 if ( valor.toString().equals("X-X*OO-*-X-") && jogada ) { valor.setLength(0); valor.append("X-X*QQQ*-X-"); jogada = false;} //3,4,1
		 if ( valor.toString().equals("-XX*OO-*-X-") && jogada ) { valor.setLength(0); valor.append("-XX*QQQ*-X-"); jogada = false;} //3,4,2
		 if ( valor.toString().equals("--X*OOX*-X-") && jogada ) { valor.setLength(0); valor.append("--X*OOX*-XO"); jogada = false;} //3,4,3*
		 if ( valor.toString().equals("--X*OO-*XX-") && jogada ) { valor.setLength(0); valor.append("--X*QQQ*XX-"); jogada = false;} //3,4,4
		 if ( valor.toString().equals("--X*OO-*-XX") && jogada ) { valor.setLength(0); valor.append("--X*QQQ*-XX"); jogada = false;} //3,4,5

		 if ( valor.toString().equals("X-X*-OO*--X") && jogada ) { valor.setLength(0); valor.append("X-X*QQQ*--X"); jogada = false;} //3,5,1
		 if ( valor.toString().equals("-XX*-OO*--X") && jogada ) { valor.setLength(0); valor.append("-XX*QQQ*--X"); jogada = false;} //3,5,2
		 if ( valor.toString().equals("--X*XOO*--X") && jogada ) { valor.setLength(0); valor.append("--X*XOO*-OX"); jogada = false;} //3,5,3*
		 if ( valor.toString().equals("--X*-OO*X-X") && jogada ) { valor.setLength(0); valor.append("--X*QQQ*X-X"); jogada = false;} //3,5,4
		 if ( valor.toString().equals("--X*-OO*-XX") && jogada ) { valor.setLength(0); valor.append("--X*QQQ*-XX"); jogada = false;} //3,5,5

		 if ( valor.toString().equals("---*XOX*---") && jogada ) { valor.setLength(0); valor.append("--O*XOX*---"); jogada = false;} //4,1*
		 if ( valor.toString().equals("---*XO-*X--") && jogada ) { valor.setLength(0); valor.append("O--*XO-*X--"); jogada = false;} //4,2*
		 if ( valor.toString().equals("---*XO-*-X-") && jogada ) { valor.setLength(0); valor.append("---*XO-*OX-"); jogada = false;} //4,3*
		 if ( valor.toString().equals("---*XO-*--X") && jogada ) { valor.setLength(0); valor.append("-O-*XO-*--X"); jogada = false;} //4,4*

	}

	@Override
	public void inverteNao(StringBuilder valor, String opcao, boolean jogada) {

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
		 if ( valor.toString().equals("-OO*XX-*O--") && jogada ) { valor.setLength(0); valor.append("-OO*QQQ*O--"); jogada = false;} //3,3,2
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

	}


}
