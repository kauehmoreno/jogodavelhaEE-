/**
 * 
 */
package jogodavelhaEE.src.model;


import jogodavelhaEE.src.model.regras.primeiraJogada.Intel;
import jogodavelhaEE.src.model.regras.primeiraJogada.IntelOposto;

/**
 * @author kaueh
 *
 */
public abstract class Inteligencia {
	
	/*
	 * instanciando as regras , sobrescrevendo o metodo da superclasse e passando os parametros necessarios para avaliar cada jogada
	 */
	
public static void inteligenciaArtificial(StringBuilder valor, String opcao) {
		
		boolean jogada = true;
		
		if(opcao.toLowerCase().equals("x")){
			
			Intel.inteligencia(valor, opcao, jogada);
			
		}else if(opcao.toLowerCase().equals("o")){
			
			IntelOposto.inteligencia(valor, opcao, jogada);
			
		}
		
		//Teste.inteligenciaArtificial(valor, opcao,jogada);
		
	}

}
