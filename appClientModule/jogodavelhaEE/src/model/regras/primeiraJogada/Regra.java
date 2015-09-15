/**
 * 
 */
package jogodavelhaEE.src.model.regras.primeiraJogada;

import jogodavelhaEE.src.model.util.Smart;

/**
 * @author kaueh
 *
 */
public class Regra extends Smart{
	
	@Override
	public void inteligencia(StringBuilder valor, String opcao,boolean jogada){
		
		
		if(opcao.toLowerCase().equals("x")){
			sabeTudo(valor, opcao, jogada);
		
		}else if (opcao.toLowerCase().equals("o")){
			
			inverteNao(valor, opcao, jogada);
			
		}
	}
	@Override
	public void sabeTudo(StringBuilder valor, String opcao,boolean jogada){

		 if ( valor.toString().equals("X--*---*---") && jogada ) { valor.setLength(0); valor.append("X--*-O-*---"); jogada = false;} //1*		 
		 if ( valor.toString().equals("-X-*---*---") && jogada ) { valor.setLength(0); valor.append("-X-*-O-*---"); jogada = false;} //2*
		 if ( valor.toString().equals("--X*---*---") && jogada ) { valor.setLength(0); valor.append("--X*-O-*---"); jogada = false;} //3*
		 if ( valor.toString().equals("---*X--*---") && jogada ) { valor.setLength(0); valor.append("---*XO-*---"); jogada = false;} //4*
		 if ( valor.toString().equals("---*-X-*---") && jogada ) { valor.setLength(0); valor.append("---*-X-*--O"); jogada = false;} //5*
		 if ( valor.toString().equals("---*--X*---") && jogada ) { valor.setLength(0); valor.append("---*-OX*---"); jogada = false;} //6*
		 if ( valor.toString().equals("---*---*X--") && jogada ) { valor.setLength(0); valor.append("---*-O-*X--"); jogada = false;} //7*
		 if ( valor.toString().equals("---*---*-X-") && jogada ) { valor.setLength(0); valor.append("---*-O-*-X-"); jogada = false;} //8*
		 if ( valor.toString().equals("---*---*--X") && jogada ) { valor.setLength(0); valor.append("---*-O-*--X"); jogada = false;} //9*

	}
	@Override
	public void inverteNao(StringBuilder valor, String opcao,boolean jogada){

		 if ( valor.toString().equals("O--*---*---") && jogada ) { valor.setLength(0); valor.append("O--*-X-*---"); jogada = false;} //1*		 
		 if ( valor.toString().equals("-O-*---*---") && jogada ) { valor.setLength(0); valor.append("-O-*-X-*---"); jogada = false;} //2*
		 if ( valor.toString().equals("--O*---*---") && jogada ) { valor.setLength(0); valor.append("--O*-X-*---"); jogada = false;} //3*
		 if ( valor.toString().equals("---*O--*---") && jogada ) { valor.setLength(0); valor.append("---*OX-*---"); jogada = false;} //4*
		 if ( valor.toString().equals("---*-O-*---") && jogada ) { valor.setLength(0); valor.append("---*-O-*--X"); jogada = false;} //5*
		 if ( valor.toString().equals("---*--O*---") && jogada ) { valor.setLength(0); valor.append("---*-XO*---"); jogada = false;} //6*
		 if ( valor.toString().equals("---*---*O--") && jogada ) { valor.setLength(0); valor.append("---*-X-*O--"); jogada = false;} //7*
		 if ( valor.toString().equals("---*---*-O-") && jogada ) { valor.setLength(0); valor.append("---*-X-*-O-"); jogada = false;} //8*
		 if ( valor.toString().equals("---*---*--O") && jogada ) { valor.setLength(0); valor.append("---*-X-*--O"); jogada = false;} //9*

		
	}
}
