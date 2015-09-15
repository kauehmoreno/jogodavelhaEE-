/**
 * 
 */
package jogodavelhaEE.src.model.regras.primeiraJogada;

import jogodavelhaEE.src.model.util.Smart;

/**
 * @author kaueh
 *
 */
public class Regra7 extends Smart{

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
		//Respostas para 1,6,3*
		 if ( valor.toString().equals("XXO*OOX*-X-") && jogada ) { valor.setLength(0); valor.append("XXQ*OQX*QX-"); jogada = false;}
		 if ( valor.toString().equals("X-O*OOX*XX-") && jogada ) { valor.setLength(0); valor.append("X-O*OOX*XXO"); jogada = false;}//*
		 if ( valor.toString().equals("X-O*OOX*-XX") && jogada ) { valor.setLength(0); valor.append("X-Q*OQX*QXX"); jogada = false;}

		 if ( valor.toString().equals("XXO*OOX*XXO") && jogada ) { valor.setLength(0); valor.append("XXO*OOX*XXO"); jogada = false;}

		 //Respostas para 1,7,3*
		 if ( valor.toString().equals("XX-*XOO*O-X") && jogada ) { valor.setLength(0); valor.append("XXQ*XQO*Q-X"); jogada = false;}
		 if ( valor.toString().equals("X-X*XOO*O-X") && jogada ) { valor.setLength(0); valor.append("XOX*XOO*O-X"); jogada = false;}//*
		 if ( valor.toString().equals("X--*XOO*OXX") && jogada ) { valor.setLength(0); valor.append("X-Q*XQO*QXX"); jogada = false;}

		 if ( valor.toString().equals("XOX*XOO*OXX") && jogada ) { valor.setLength(0); valor.append("XOX*XOO*OXX"); jogada = false;}

		 //Respostas para 2,1,5*
		 if ( valor.toString().equals("OXX*XOO*--X") && jogada ) { valor.setLength(0); valor.append("OXX*XOO*O-X"); jogada = false;}//*
		 if ( valor.toString().equals("OXX*-OO*X-X") && jogada ) { valor.setLength(0); valor.append("OXX*QQQ*X-X"); jogada = false;}
		 if ( valor.toString().equals("OXX*-OO*-XX") && jogada ) { valor.setLength(0); valor.append("OXX*QQQ*-XX"); jogada = false;}

		 if ( valor.toString().equals("OXX*XOO*OXX") && jogada ) { valor.setLength(0); valor.append("OXX*XOO*OXX"); jogada = false;}

		 //Respostas para 2,2,5*
		 if ( valor.toString().equals("OXO*XOX*--X") && jogada ) { valor.setLength(0); valor.append("OXQ*XQX*Q-X"); jogada = false;}
		 if ( valor.toString().equals("OXO*XO-*X-X") && jogada ) { valor.setLength(0); valor.append("OXO*XO-*XOX"); jogada = false;}//*
		 if ( valor.toString().equals("OXO*XO-*-XX") && jogada ) { valor.setLength(0); valor.append("OXQ*XQ-*QXX"); jogada = false;}

		 if ( valor.toString().equals("OXO*XOX*XOX") && jogada ) { valor.setLength(0); valor.append("OXO*XOX*XOX"); jogada = false;}

		 //Respostas para 2,3,3*
		 if ( valor.toString().equals("XXO*-OX*X-O") && jogada ) { valor.setLength(0); valor.append("XXO*OOX*X-O"); jogada = false;}//*
		 if ( valor.toString().equals("-XO*XOX*X-O") && jogada ) { valor.setLength(0); valor.append("QXO*XQX*X-Q"); jogada = false;}
		 if ( valor.toString().equals("-XO*-OX*XXO") && jogada ) { valor.setLength(0); valor.append("QXO*-QX*XXQ"); jogada = false;}

		 if ( valor.toString().equals("XXO*OOX*XXO") && jogada ) { valor.setLength(0); valor.append("XXO*OOX*X-O"); jogada = false;}

		 //Respostas para 2,4,3*
		 if ( valor.toString().equals("OXX*XOO*X--") && jogada ) { valor.setLength(0); valor.append("QXX*XQO*X-Q"); jogada = false;}
		 if ( valor.toString().equals("OX-*XOO*XX-") && jogada ) { valor.setLength(0); valor.append("QX-*XQO*XXQ"); jogada = false;}
		 if ( valor.toString().equals("OX-*XOO*X-X") && jogada ) { valor.setLength(0); valor.append("OX-*XOO*XOX"); jogada = false;}//*

		 if ( valor.toString().equals("OXX*XOO*XOX") && jogada ) { valor.setLength(0); valor.append("OXX*XOO*XOX"); jogada = false;}

		 //Respostas para 2,5,1*
		 if ( valor.toString().equals("XXO*XO-*-XO") && jogada ) { valor.setLength(0); valor.append("XXQ*XQ-*QXO"); jogada = false;}
		 if ( valor.toString().equals("XXO*-OX*-XO") && jogada ) { valor.setLength(0); valor.append("XXQ*-QX*QXO"); jogada = false;}
		 if ( valor.toString().equals("XXO*-O-*XXO") && jogada ) { valor.setLength(0); valor.append("XXQ*-OQ*XXQ"); jogada = false;}

		 //Respostas para 2,6,3*
		 if ( valor.toString().equals("XXO*OOX*--X") && jogada ) { valor.setLength(0); valor.append("XXQ*OQX*Q-X"); jogada = false;}
		 if ( valor.toString().equals("-XO*OOX*X-X") && jogada ) { valor.setLength(0); valor.append("-XO*OOX*XOX"); jogada = false;}//*
		 if ( valor.toString().equals("-XO*OOX*-XX") && jogada ) { valor.setLength(0); valor.append("-XQ*OQX*QXX"); jogada = false;}

		 if ( valor.toString().equals("XXO*OOX*X-X") && jogada ) { valor.setLength(0); valor.append("-XO*OOX*XOX"); jogada = false;}

		 //Respostas para 3,1,4*
		 if ( valor.toString().equals("OOX*XOX*-X-") && jogada ) { valor.setLength(0); valor.append("QOX*XQX*-XQ"); jogada = false;}
		 if ( valor.toString().equals("OOX*XO-*XX-") && jogada ) { valor.setLength(0); valor.append("QOX*XQ-*XXQ"); jogada = false;}
		 if ( valor.toString().equals("OOX*XO-*-XX") && jogada ) { valor.setLength(0); valor.append("OOX*XO-*OXX"); jogada = false;}//*

		 if ( valor.toString().equals("OOX*XOX*OXX") && jogada ) { valor.setLength(0); valor.append("OOX*XOX*OXX"); jogada = false;}

		 //Respostas para 3,2,1*
		 if ( valor.toString().equals("XOX*XOX*--O") && jogada ) { valor.setLength(0); valor.append("XQX*XQX*-QO"); jogada = false;}
		 if ( valor.toString().equals("XOX*-OX*X-O") && jogada ) { valor.setLength(0); valor.append("XQX*-QX*XQO"); jogada = false;}
		 if ( valor.toString().equals("XOX*-OX*-XO") && jogada ) { valor.setLength(0); valor.append("XOX*-OX*OXO"); jogada = false;}//*

		 if ( valor.toString().equals("XOX*XOX*-XO") && jogada ) { valor.setLength(0); valor.append("XOX*XOX*OXO"); jogada = false;}

		 //Respostas para 3,3,3*
		 if ( valor.toString().equals("X-X*OOX*X-O") && jogada ) { valor.setLength(0); valor.append("XOX*OOX*X-O"); jogada = false;}//*
		 if ( valor.toString().equals("-XX*OOX*X-O") && jogada ) { valor.setLength(0); valor.append("QXX*OQX*X-Q"); jogada = false;}
		 if ( valor.toString().equals("--X*OOX*XXO") && jogada ) { valor.setLength(0); valor.append("Q-X*OQX*XXQ"); jogada = false;}

		 if ( valor.toString().equals("XOX*OOX*XXO") && jogada ) { valor.setLength(0); valor.append("XOX*OOX*XXO"); jogada = false;}

	}

	@Override
	public void inverteNao(StringBuilder valor, String opcao, boolean jogada) {
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

		
	}
	
	

}
