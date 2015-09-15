/**
 * 
 */
package jogodavelhaEE.src.model.regras.primeiraJogada;

import jogodavelhaEE.src.model.util.Smart;

/**
 * @author kaueh
 *
 */
public class Regra8 extends Smart{

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
		//Respostas para 5,2,5*
		 if ( valor.toString().equals("XXO*-X-*XOO") && jogada ) { valor.setLength(0); valor.append("XXQ*-XQ*XOQ"); jogada = false;}
		 if ( valor.toString().equals("-XO*XX-*XOO") && jogada ) { valor.setLength(0); valor.append("-XQ*XXQ*XOQ"); jogada = false;}
		 if ( valor.toString().equals("-XO*-XX*XOO") && jogada ) { valor.setLength(0); valor.append("-XO*OXX*XOO"); jogada = false;}//*

		 if ( valor.toString().equals("XXO*OXX*XOO") && jogada ) { valor.setLength(0); valor.append("XXO*OXX*XOO"); jogada = false;}

		 //Respostas para 5,3,5*
		 if ( valor.toString().equals("XOX*-X-*OXO") && jogada ) { valor.setLength(0); valor.append("XOX*OX-*OXO"); jogada = false;}//*
		 if ( valor.toString().equals("-OX*XX-*OXO") && jogada ) { valor.setLength(0); valor.append("-OX*XXO*OXO"); jogada = false;}//*
		 if ( valor.toString().equals("-OX*-XX*OXO") && jogada ) { valor.setLength(0); valor.append("-OX*OXX*OXO"); jogada = false;}//*

		 if ( valor.toString().equals("XOX*OXX*OXO") && jogada ) { valor.setLength(0); valor.append("XOX*OXX*OXO"); jogada = false;}
		 if ( valor.toString().equals("XOX*XXO*OXO") && jogada ) { valor.setLength(0); valor.append("XOX*XXO*OXO"); jogada = false;}
		 if ( valor.toString().equals("XOX*OXX*OXO") && jogada ) { valor.setLength(0); valor.append("XOX*OXX*OXO"); jogada = false;}

		 //Respostas para 5,4,3*
		 if ( valor.toString().equals("X-X*XXO*O-O") && jogada ) { valor.setLength(0); valor.append("X-X*XXO*QQQ"); jogada = false;}
		 if ( valor.toString().equals("-XX*XXO*O-O") && jogada ) { valor.setLength(0); valor.append("-XX*XXO*QQQ"); jogada = false;}
		 if ( valor.toString().equals("--X*XXO*OXO") && jogada ) { valor.setLength(0); valor.append("-OX*XXO*OXO"); jogada = false;}//*

		 if ( valor.toString().equals("XOX*XXO*OXO") && jogada ) { valor.setLength(0); valor.append("XOX*XXO*OXO"); jogada = false;}

		 //Respostas para 5,5,1*
		 if ( valor.toString().equals("XX-*OXX*O-O") && jogada ) { valor.setLength(0); valor.append("X--*OXX*QQQ"); jogada = false;}
		 if ( valor.toString().equals("X-X*OXX*O-O") && jogada ) { valor.setLength(0); valor.append("X--*OXX*QQQ"); jogada = false;}
		 if ( valor.toString().equals("X--*OXX*OXO") && jogada ) { valor.setLength(0); valor.append("XO-*OXX*OXO"); jogada = false;}//*

		 if ( valor.toString().equals("XOX*OXX*OXO") && jogada ) { valor.setLength(0); valor.append("XOX*OXX*OXO"); jogada = false;}

		 //Resposta para 5,5,2*
		 if ( valor.toString().equals("XX-*OXX*-OO") && jogada ) { valor.setLength(0); valor.append("XX-*OXX*QQQ"); jogada = false;}
		 if ( valor.toString().equals("-XX*OXX*-OO") && jogada ) { valor.setLength(0); valor.append("-XX*OXX*QQQ"); jogada = false;}
		 if ( valor.toString().equals("-X-*OXX*XOO") && jogada ) { valor.setLength(0); valor.append("-XO*OXX*XOO"); jogada = false;}//*

		 if ( valor.toString().equals("XXO*OXX*XOO") && jogada ) { valor.setLength(0); valor.append("XXO*OXX*XOO"); jogada = false;}

		 //Respostas para 5,5,3*
		 if ( valor.toString().equals("X-X*OXX*O-O") && jogada ) { valor.setLength(0); valor.append("X-X*OXX*QQQ"); jogada = false;}
		 if ( valor.toString().equals("-XX*OXX*O-O") && jogada ) { valor.setLength(0); valor.append("-XX*OXX*QQQ"); jogada = false;}
		 if ( valor.toString().equals("--X*OXX*OXO") && jogada ) { valor.setLength(0); valor.append("Q-X*QXX*QXO"); jogada = false;}

		 //Respostas para 5,5,4*
		 if ( valor.toString().equals("X-O*OXX*X-O") && jogada ) { valor.setLength(0); valor.append("XOO*OXX*X-O"); jogada = false;}//*
		 if ( valor.toString().equals("-XO*OXX*X-O") && jogada ) { valor.setLength(0); valor.append("-XO*OXX*XOO"); jogada = false;}//*
		 if ( valor.toString().equals("--O*OXX*XXO") && jogada ) { valor.setLength(0); valor.append("-OO*OXX*XXO"); jogada = false;}//*

		 if ( valor.toString().equals("XOO*OXX*XXO") && jogada ) { valor.setLength(0); valor.append("XOO*OXX*XXO"); jogada = false;}
		 if ( valor.toString().equals("XXO*OXX*XOO") && jogada ) { valor.setLength(0); valor.append("XXO*OXX*XOO"); jogada = false;}
		 if ( valor.toString().equals("XOO*OXX*XXO") && jogada ) { valor.setLength(0); valor.append("XOO*OXX*XXO"); jogada = false;}

	}

	@Override
	public void inverteNao(StringBuilder valor, String opcao, boolean jogada) {
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

		
	}
	
	

}
