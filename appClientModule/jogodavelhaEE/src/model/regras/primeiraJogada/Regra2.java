package jogodavelhaEE.src.model.regras.primeiraJogada;

import jogodavelhaEE.src.model.util.Smart;

public class Regra2 extends Smart{
	
	@Override
	public  void inteligencia(StringBuilder valor, String opcao,boolean jogada){
		
		if(opcao.toUpperCase().equals("x")){
			
			sabeTudo(valor, opcao, jogada);
			
		}else{

			inverteNao(valor, opcao, jogada);
		}

	}

	@Override
	public void sabeTudo(StringBuilder valor, String opcao, boolean jogada) {
		 if ( valor.toString().equals("XX-*-O-*---") && jogada ) { valor.setLength(0); valor.append("XXO*-O-*---"); jogada = false;} //1,1*
		 if ( valor.toString().equals("X-X*-O-*---") && jogada ) { valor.setLength(0); valor.append("XOX*-O-*---"); jogada = false;} //1,2*
		 if ( valor.toString().equals("X--*XO-*---") && jogada ) { valor.setLength(0); valor.append("X--*XO-*O--"); jogada = false;} //1,3*
		 if ( valor.toString().equals("X--*-OX*---") && jogada ) { valor.setLength(0); valor.append("XO-*-OX*---"); jogada = false;} //1,4*
		 if ( valor.toString().equals("X--*-O-*X--") && jogada ) { valor.setLength(0); valor.append("X--*OO-*X--"); jogada = false;} //1,5*
		 if ( valor.toString().equals("X--*-O-*-X-") && jogada ) { valor.setLength(0); valor.append("X--*OO-*-X-"); jogada = false;} //1,6*
		 if ( valor.toString().equals("X--*-O-*--X") && jogada ) { valor.setLength(0); valor.append("X--*-OO*--X"); jogada = false;} //1,7*

		 if ( valor.toString().equals("XXO*XO-*---") && jogada ) { valor.setLength(0); valor.append("XXQ*XQ- Q--"); jogada = false;} //1,1,1
		 if ( valor.toString().equals("XXO*-OX*---") && jogada ) { valor.setLength(0); valor.append("XXQ*-QX Q--"); jogada = false;} //1,1,2
		 if ( valor.toString().equals("XXO*-O-*X--") && jogada ) { valor.setLength(0); valor.append("XXO*OO-*X--"); jogada = false;} //1,1,3*
		 if ( valor.toString().equals("XXO*-O-*-X-") && jogada ) { valor.setLength(0); valor.append("XXQ*-Q- QX-"); jogada = false;} //1,1,4
		 if ( valor.toString().equals("XXO*-O-*--X") && jogada ) { valor.setLength(0); valor.append("XXQ*-Q- Q-X"); jogada = false;} //1,1,5

		 if ( valor.toString().equals("XOX*XO-*---") && jogada ) { valor.setLength(0); valor.append("XQX*XQ-*-Q-"); jogada = false;} //1,2,1
		 if ( valor.toString().equals("XOX*-OX*---") && jogada ) { valor.setLength(0); valor.append("XQX*-QX*-Q-"); jogada = false;} //1,2,2
		 if ( valor.toString().equals("XOX*-O-*X--") && jogada ) { valor.setLength(0); valor.append("XQX*-Q-*XQ-"); jogada = false;} //1,2,3
		 if ( valor.toString().equals("XOX*-O-*-X-") && jogada ) { valor.setLength(0); valor.append("XOX*-OO*-X-"); jogada = false;} //1,2,4*
		 if ( valor.toString().equals("XOX*-O-*--X") && jogada ) { valor.setLength(0); valor.append("XQX*-Q-*-QX"); jogada = false;} //1,2,5

		 if ( valor.toString().equals("XX-*XO-*O--") && jogada ) { valor.setLength(0); valor.append("XXQ*XQ-*Q--"); jogada = false;} //1,3,1
		 if ( valor.toString().equals("X-X*XO-*O--") && jogada ) { valor.setLength(0); valor.append("XOX*XO-*O--"); jogada = false;} //1,3,2*
		 if ( valor.toString().equals("X--*XOX*O--") && jogada ) { valor.setLength(0); valor.append("X-Q*XQX*Q--"); jogada = false;} //1,3,3
		 if ( valor.toString().equals("X--*XOX*OX-") && jogada ) { valor.setLength(0); valor.append("X-Q*XQX*QX-"); jogada = false;} //1,3,4
		 if ( valor.toString().equals("X--*XO-*O-X") && jogada ) { valor.setLength(0); valor.append("X-Q*XQ-*Q-X"); jogada = false;} //1,3,5

		
		if ( valor.toString().equals("XOx*-OX*---") && jogada ) { valor.setLength(0); valor.append("XQ-*XQX*-Q-"); jogada = false;} //1,4,1
		if ( valor.toString().equals("XO-*XOX*---") && jogada ) { valor.setLength(0); valor.append("XQ-*XQX*-Q-"); jogada = false;} //1,4,2
		if ( valor.toString().equals("XO-*-OX*X--") && jogada ) { valor.setLength(0); valor.append("XQ-*-QX*XQ-"); jogada = false;} //1,4,3
		if ( valor.toString().equals("XO-*-OX*-X-") && jogada ) { valor.setLength(0); valor.append("XO-*-OX*OX-"); jogada = false;} //1,4,4*
		if ( valor.toString().equals("XO-*-OX*--X") && jogada ) { valor.setLength(0); valor.append("XQ-*-QX*-QX"); jogada = false;} //1,4,5
		
		if ( valor.toString().equals("XX-*OO-*X--") && jogada ) { valor.setLength(0); valor.append("XX-*QQQ*X--"); jogada = false;} //1,5,1
		if ( valor.toString().equals("X-X*OO-*X--") && jogada ) { valor.setLength(0); valor.append("X-X*QQQ*X--"); jogada = false;} //1,5,2
		if ( valor.toString().equals("X--*OOX*X--") && jogada ) { valor.setLength(0); valor.append("X--*OOX*XO-"); jogada = false;} //1,5,3*
		if ( valor.toString().equals("X--*OO-*XX-") && jogada ) { valor.setLength(0); valor.append("X--*QQQ*XX-"); jogada = false;} //1,5,4
		if ( valor.toString().equals("X--*OO-*X-X") && jogada ) { valor.setLength(0); valor.append("X--*QQQ*X-X"); jogada = false;} //1,5,5
	
	}

	@Override
	public void inverteNao(StringBuilder valor, String opcao, boolean jogada) {
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

	}
	
	

}
