/**
 * 
 */
package jogodavelhaEE.src.model.regras.primeiraJogada;

import jogodavelhaEE.src.model.util.Smart;

/**
 * @author kaueh
 *
 */
public class Regra9 extends Smart{

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
		 //Resposta para 5,5,5*
		 if ( valor.toString().equals("XO-*OXX*-XO") && jogada ) { valor.setLength(0); valor.append("XOO*OXX*-XO"); jogada = false;}//*
		 if ( valor.toString().equals("-OX*OXX*-XO") && jogada ) { valor.setLength(0); valor.append("-OX*OXX*OXO"); jogada = false;}//*
		 if ( valor.toString().equals("-O-*OXX*XXO") && jogada ) { valor.setLength(0); valor.append("-OO*OXX*XXO"); jogada = false;}//*

		 if ( valor.toString().equals("XOO*OXX*XXO") && jogada ) { valor.setLength(0); valor.append("XOO*OXX*XXO"); jogada = false;}
		 if ( valor.toString().equals("XOX*OXX*OXO") && jogada ) { valor.setLength(0); valor.append("XOX*OXX*OXO"); jogada = false;}
		 if ( valor.toString().equals("XOO*OXX*XXO") && jogada ) { valor.setLength(0); valor.append("XOO*OXX*XXO"); jogada = false;}

		 //Repostas para 5,6,4*
		 if ( valor.toString().equals("X-O*OXX*X-O") && jogada ) { valor.setLength(0); valor.append("XOO*OXX*X-O"); jogada = false;}//*
		 if ( valor.toString().equals("-XO*OXX*X-O") && jogada ) { valor.setLength(0); valor.append("-XO*OXX*XOO"); jogada = false;}//*
		 if ( valor.toString().equals("--O*OXX*XXO") && jogada ) { valor.setLength(0); valor.append("-OO*OXX*XXO"); jogada = false;}//*

		 if ( valor.toString().equals("XOO*OXX*XXO") && jogada ) { valor.setLength(0); valor.append("XOO*OXX*XXO"); jogada = false;}
		 if ( valor.toString().equals("XXO*OXX*XOO") && jogada ) { valor.setLength(0); valor.append("XXO*OXX*XOO"); jogada = false;}
		 if ( valor.toString().equals("XOO*OXX*XXO") && jogada ) { valor.setLength(0); valor.append("-OO*OXX*XXO"); jogada = false;}

		 //Repostas para 5,7,1*
		 if ( valor.toString().equals("XOO*XX-*-XO") && jogada ) { valor.setLength(0); valor.append("XOQ*XXQ*-XQ"); jogada = false;}
		 if ( valor.toString().equals("XOO*-XX*-XO") && jogada ) { valor.setLength(0); valor.append("XOO*OXX*-XO"); jogada = false;}//*
		 if ( valor.toString().equals("XOO*-X-*XXO") && jogada ) { valor.setLength(0); valor.append("XOQ*-XQ*XXQ"); jogada = false;}

		 if ( valor.toString().equals("XOO*OXX*XXO") && jogada ) { valor.setLength(0); valor.append("XOO*OXX*XXO"); jogada = false;}

		 //Repostas para 5,7,2*
		 if ( valor.toString().equals("XOX*-X-*OXO") && jogada ) { valor.setLength(0); valor.append("XOX*OX-*OXO"); jogada = false;}//*
		 if ( valor.toString().equals("-OX*XX-*OXO") && jogada ) { valor.setLength(0); valor.append("-OX*XXO*OXO"); jogada = false;}//*
		 if ( valor.toString().equals("-OX*-XX*OXO") && jogada ) { valor.setLength(0); valor.append("-OX*OXX*OXO"); jogada = false;}//*

		 if ( valor.toString().equals("XOX*OXX*OXO") && jogada ) { valor.setLength(0); valor.append("XOX*OXX*OXO"); jogada = false;}
		 if ( valor.toString().equals("XOX*XXO*OXO") && jogada ) { valor.setLength(0); valor.append("XOX*XXO*OXO"); jogada = false;}
		 if ( valor.toString().equals("XOX*OXX*OXO") && jogada ) { valor.setLength(0); valor.append("XOX*OXX*OXO"); jogada = false;}

		 //Repostas para 5,7,3*
		 if ( valor.toString().equals("XO-*XXO*-XO") && jogada ) { valor.setLength(0); valor.append("XOQ*XXQ*-XQ"); jogada = false;}
		 if ( valor.toString().equals("-OX*XXO*-XO") && jogada ) { valor.setLength(0); valor.append("-OX*XXO*OXO"); jogada = false;}//*
		 if ( valor.toString().equals("-O-*XXO*XXO") && jogada ) { valor.setLength(0); valor.append("-OQ*XXQ*XXQ"); jogada = false;}

		 if ( valor.toString().equals("XOX*XXO*OXO") && jogada ) { valor.setLength(0); valor.append("XOX*XXO*OXO"); jogada = false;}

		 //Repostas para 5,7,4*
		 if ( valor.toString().equals("XO-*OXX*-XO") && jogada ) { valor.setLength(0); valor.append("XOO*OXX*-XO"); jogada = false;}//*
		 if ( valor.toString().equals("-OX*OXX*-XO") && jogada ) { valor.setLength(0); valor.append("-OX*OXX*OXO"); jogada = false;}//*
		 if ( valor.toString().equals("-O-*OXX*XXO") && jogada ) { valor.setLength(0); valor.append("-OO*OXX*XXO"); jogada = false;}//*

		 if ( valor.toString().equals("XOO*OXX*XXO") && jogada ) { valor.setLength(0); valor.append("XOO*OXX*OXO"); jogada = false;}
		 if ( valor.toString().equals("XOX*OXX*OXO") && jogada ) { valor.setLength(0); valor.append("XOX*OXX*OXO"); jogada = false;}
		 if ( valor.toString().equals("XOO*OXX*XXO") && jogada ) { valor.setLength(0); valor.append("XOO*OXX*XXO"); jogada = false;}

		 //Repostas para 5,7,5*
		 if ( valor.toString().equals("XOO*-X-*XXO") && jogada ) { valor.setLength(0); valor.append("XOQ*-XQ*XXQ"); jogada = false;}
		 if ( valor.toString().equals("-OO*XX-*XXO") && jogada ) { valor.setLength(0); valor.append("QQQ*XX-*XXO"); jogada = false;}
		 if ( valor.toString().equals("-OO*-XX*XXO") && jogada ) { valor.setLength(0); valor.append("QQQ*-XX*XXO"); jogada = false;}

		 //Respostas para 6,1,4*
		 if ( valor.toString().equals("XO-*-OX*XXO") && jogada ) { valor.setLength(0); valor.append("XO-*OOX*XXO"); jogada = false;}//*
		 if ( valor.toString().equals("-OX*-OX*XXO") && jogada ) { valor.setLength(0); valor.append("QOX*-QX*XXQ"); jogada = false;}
		 if ( valor.toString().equals("-O-*XOX*XXO") && jogada ) { valor.setLength(0); valor.append("QO-*XQX*XXQ"); jogada = false;}

		 if ( valor.toString().equals("XOX*OOX*XXO") && jogada ) { valor.setLength(0); valor.append("XOX*OOX*XXO"); jogada = false;}

		 //Respostas para 6,2,1*
		 if ( valor.toString().equals("XXO*-QX*OXO") && jogada ) { valor.setLength(0); valor.append("XXQ*-QX*QXO"); jogada = false;}
		 if ( valor.toString().equals("X-X*-OX*OXO") && jogada ) { valor.setLength(0); valor.append("XOX*-OX*OXO"); jogada = false;}//*
		 if ( valor.toString().equals("X-O*XQX*OXO") && jogada ) { valor.setLength(0); valor.append("X-Q*XQX*QXO"); jogada = false;}

		 if ( valor.toString().equals("XOX*XOX*OXO") && jogada ) { valor.setLength(0); valor.append("XOX*XOX*OXO"); jogada = false;}

		 //Respostas par 6,3,4*
		 if ( valor.toString().equals("X-O*-OX*XOX") && jogada ) { valor.setLength(0); valor.append("XQO*-QX*XQX"); jogada = false;}
		 if ( valor.toString().equals("-XO*-OX*XOX") && jogada ) { valor.setLength(0); valor.append("OXO*-OX*XOX"); jogada = false;}//*
		 if ( valor.toString().equals("--O*XOX*XOX") && jogada ) { valor.setLength(0); valor.append("-QO*XQX*XQX"); jogada = false;}

		 if ( valor.toString().equals("OXO*XOX*XOX") && jogada ) { valor.setLength(0); valor.append("OXO*XOX*XOX"); jogada = false;}

		 //Respostas para 7,1,1*
		 if ( valor.toString().equals("XX-*OO-*XXO") && jogada ) { valor.setLength(0); valor.append("XX-*QQQ*XXO"); jogada = false;}
		 if ( valor.toString().equals("X-X*OO-*XXO") && jogada ) { valor.setLength(0); valor.append("X-X*QQQ*XXO"); jogada = false;}
		 if ( valor.toString().equals("X--*OOX*XXO") && jogada ) { valor.setLength(0); valor.append("X-O*OOX*XXO"); jogada = false;}//*

		 if ( valor.toString().equals("XXO*OOX*XXO") && jogada ) { valor.setLength(0); valor.append("XXO*OOX*XXO"); jogada = false;}

		 //Respostas para 7,2,2*
		 if ( valor.toString().equals("XX-*-OO*XOX") && jogada ) { valor.setLength(0); valor.append("XX-*QQQ*XOX"); jogada = false;}
		 if ( valor.toString().equals("-XX*-OO*XOX") && jogada ) { valor.setLength(0); valor.append("-XX*QQQ*XOX"); jogada = false;}
		 if ( valor.toString().equals("-X-*XOO*XOX") && jogada ) { valor.setLength(0); valor.append("OX-*XOO*XOX"); jogada = false;}//*

		 if ( valor.toString().equals("OXX*XOO*XOX") && jogada ) { valor.setLength(0); valor.append("OXX*XOO*XOX"); jogada = false;}

		 //Respostas para 8,1,3*
		 if ( valor.toString().equals("X-X*-OO*OXX") && jogada ) { valor.setLength(0); valor.append("--X*QQQ*OXX"); jogada = false;}
		 if ( valor.toString().equals("-XX*-OO*OXX") && jogada ) { valor.setLength(0); valor.append("--X*QQQ*OXX"); jogada = false;}
		 if ( valor.toString().equals("--X*XOO*OXX") && jogada ) { valor.setLength(0); valor.append("O-X*XOO*OXX"); jogada = false;}//*

		 if ( valor.toString().equals("OXX*XOO*OXX") && jogada ) { valor.setLength(0); valor.append("OXX*XOO*OXX"); jogada = false;}

	}

	@Override
	public void inverteNao(StringBuilder valor, String opcao, boolean jogada) {

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
