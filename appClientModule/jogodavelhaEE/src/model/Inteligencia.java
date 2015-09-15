/**
 * 
 */
package jogodavelhaEE.src.model;

import jogodavelhaEE.src.model.regras.primeiraJogada.Regra;
import jogodavelhaEE.src.model.regras.primeiraJogada.Regra2;
import jogodavelhaEE.src.model.regras.primeiraJogada.Regra3;
import jogodavelhaEE.src.model.regras.primeiraJogada.Regra4;
import jogodavelhaEE.src.model.regras.primeiraJogada.Regra5;
import jogodavelhaEE.src.model.regras.primeiraJogada.Regra6;
import jogodavelhaEE.src.model.regras.primeiraJogada.Regra7;
import jogodavelhaEE.src.model.regras.primeiraJogada.Regra8;
import jogodavelhaEE.src.model.regras.primeiraJogada.Regra9;

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
		
		Regra regra = new Regra();
		Regra2 regra2 = new Regra2();
		Regra3 regra3 = new Regra3();
		Regra4 regra4 = new Regra4();
		Regra5 regra5 = new Regra5();
		Regra6 regra6 = new Regra6();
		Regra7 regra7 = new Regra7();
		Regra8 regra8 = new Regra8();
		Regra9 regra9 = new Regra9();
		
		regra.inteligencia(valor, opcao, jogada);
		regra2.inteligencia(valor, opcao, jogada);
		regra3.inteligencia(valor, opcao, jogada);
		regra4.inteligencia(valor, opcao, jogada);
		regra5.inteligencia(valor, opcao, jogada);
		regra6.inteligencia(valor, opcao, jogada);
		regra7.inteligencia(valor, opcao, jogada);
		regra8.inteligencia(valor, opcao, jogada);
		regra9.inteligencia(valor, opcao, jogada);
		
	}

}
