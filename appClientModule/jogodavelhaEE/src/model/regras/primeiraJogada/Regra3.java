/**
 * 
 */
package jogodavelhaEE.src.model.regras.primeiraJogada;

import jogodavelhaEE.src.model.util.Smart;

/**
 * @author kaueh
 *
 */
public class Regra3  extends Smart{

	@Override
	public void inteligencia(StringBuilder valor, String opcao, boolean jogada) {
		
		if(opcao.toUpperCase().equals("x")){
			
			sabeTudo(valor, opcao, jogada);
			
		}else if(opcao.toUpperCase().equals("o")){
			 
			inverteNao(valor, opcao, jogada);
		}
	}

	@Override
	public void sabeTudo(StringBuilder valor, String opcao, boolean jogada) {
		 if ( valor.toString().equals("XX-*OO-*-X-") && jogada ) { valor.setLength(0); valor.append("XX-*QQQ*-X-"); jogada = false;} //1,6,1
		 if ( valor.toString().equals("X-X*OO-*-X-") && jogada ) { valor.setLength(0); valor.append("X-X*QQQ*-X-"); jogada = false;} //1,6,2
		 if ( valor.toString().equals("X--*OOX*-X-") && jogada ) { valor.setLength(0); valor.append("X-O*OOX*-X-"); jogada = false;} //1,6,3*
		 if ( valor.toString().equals("X--*OO-*XX-") && jogada ) { valor.setLength(0); valor.append("X--*QQQ*XX-"); jogada = false;} //1,6,4
		 if ( valor.toString().equals("X--*OO-*-XX") && jogada ) { valor.setLength(0); valor.append("X--*QQQ*-XX"); jogada = false;} //1,6,5

		 if ( valor.toString().equals("XX-*-OO*--X") && jogada ) { valor.setLength(0); valor.append("XX-*QQQ*--X"); jogada = false;} //1,7,1
		 if ( valor.toString().equals("X-X*-OO*--X") && jogada ) { valor.setLength(0); valor.append("X-X*QQQ*--X"); jogada = false;} //1,7,2
		 if ( valor.toString().equals("X--*XOO*--X") && jogada ) { valor.setLength(0); valor.append("X--*XOO*O-X"); jogada = false;} //1,7,3*
		 if ( valor.toString().equals("X--*-OO*X-X") && jogada ) { valor.setLength(0); valor.append("X--*QQQ*X-X"); jogada = false;} //1,7,4
		 if ( valor.toString().equals("X--*-OO*-XX") && jogada ) { valor.setLength(0); valor.append("X--*QQQ*-XX"); jogada = false;} //1,7,5

		 if ( valor.toString().equals("-XX*-O-*---") && jogada ) { valor.setLength(0); valor.append("OXX*-O-*---"); jogada = false;} //2,1*
		 if ( valor.toString().equals("-X-*XO-*---") && jogada ) { valor.setLength(0); valor.append("OX-*XO-*---"); jogada = false;} //2,2*
		 if ( valor.toString().equals("-X-*-OX*---") && jogada ) { valor.setLength(0); valor.append("-XO*-OX*---"); jogada = false;} //2,3*
		 if ( valor.toString().equals("-X-*-O-*X--") && jogada ) { valor.setLength(0); valor.append("-X-*-OO*X--"); jogada = false;} //2,4*
		 if ( valor.toString().equals("-X-*-O-*-X-") && jogada ) { valor.setLength(0); valor.append("-X-*-O-*-XO"); jogada = false;} //2,5*
		 if ( valor.toString().equals("-X-*-O-*--X") && jogada ) { valor.setLength(0); valor.append("-X-*OO-*--X"); jogada = false;} //2,6*

		 if ( valor.toString().equals("OXX*XO-*---") && jogada ) { valor.setLength(0); valor.append("QXX*XQ-*--Q"); jogada = false;} //2,1,1
		 if ( valor.toString().equals("OXX*-OX*---") && jogada ) { valor.setLength(0); valor.append("QXX*-QX*--Q"); jogada = false;} //2,1,2
		 if ( valor.toString().equals("OXX*-O-*X--") && jogada ) { valor.setLength(0); valor.append("QXX*-Q-*X-Q"); jogada = false;} //2,1,3
		 if ( valor.toString().equals("OXX*-O-*-X-") && jogada ) { valor.setLength(0); valor.append("QXX*-Q-*-XQ"); jogada = false;} //2,1,4
		 if ( valor.toString().equals("OXX*-O-*--X") && jogada ) { valor.setLength(0); valor.append("OXX*-OO*--X"); jogada = false;} //2,1,5*

		 if ( valor.toString().equals("OXX*XO-*---") && jogada ) { valor.setLength(0); valor.append("QXX*XQ-*--Q"); jogada = false;} //2,2,1
		 if ( valor.toString().equals("OX-*XOX*---") && jogada ) { valor.setLength(0); valor.append("QX-*XQX*--Q"); jogada = false;} //2,2,2
		 if ( valor.toString().equals("OX-*XO-*X--") && jogada ) { valor.setLength(0); valor.append("QX-*XQ-*X-Q"); jogada = false;} //2,2,3
		 if ( valor.toString().equals("OX-*XO-*-X-") && jogada ) { valor.setLength(0); valor.append("QX-*XQ-*-XQ"); jogada = false;} //2,2,4
		 if ( valor.toString().equals("OX-*XO-*--X") && jogada ) { valor.setLength(0); valor.append("OXO*XO-*--X"); jogada = false;} //2,2,5*

		 if ( valor.toString().equals("XXO*-OX*---") && jogada ) { valor.setLength(0); valor.append("XXQ*-QX*Q--"); jogada = false;} //2,3,1
		 if ( valor.toString().equals("-XO*XOX*---") && jogada ) { valor.setLength(0); valor.append("-XQ*XQX*Q--"); jogada = false;} //2,3,2
		 if ( valor.toString().equals("-XO*-OX*X--") && jogada ) { valor.setLength(0); valor.append("-XO*-OX*X-O"); jogada = false;} //2,3,3*
		 if ( valor.toString().equals("-XO*-OX*-X-") && jogada ) { valor.setLength(0); valor.append("-XQ*-QX*QX-"); jogada = false;} //2,3,4
		 if ( valor.toString().equals("-XO*-OX*--X") && jogada ) { valor.setLength(0); valor.append("-XQ*-QX*Q-X"); jogada = false;} //2,3,5

	}

	@Override
	public void inverteNao(StringBuilder valor, String opcao, boolean jogada) {
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

	}
	

}
