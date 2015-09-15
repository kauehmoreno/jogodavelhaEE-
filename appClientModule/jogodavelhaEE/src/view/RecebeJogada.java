/**
 * 
 */
package jogodavelhaEE.src.view;

import java.util.Scanner;





/**
 * @author kaueh
 *
 */
public class RecebeJogada {
	static Scanner scanner = new Scanner(System.in);
	public static void recebeJogada(StringBuilder valor,String opcao) {
		boolean jogada_valida = false;
		String jogada;
		int _jogada;
		
		System.out.println("Esse eh o valor da opcao: "+opcao);
		System.out.print("oi: "+opcao.toLowerCase().equals("o"));
		System.out.print("\r\nEscolha a sua jogada: ");
		
		jogada = scanner.nextLine();
		jogada = jogada.trim(); //.trim = tira o espaço do começo e do final da palavra
		
		if (jogada.equals("1") || jogada.equals("2") || jogada.equals("3") || jogada.equals("4") || jogada.equals("5") ||
			jogada.equals("6") || jogada.equals("7") || jogada.equals("8") || jogada.equals("9") ) {
			
			_jogada = Integer.parseInt(jogada);
			
			if (_jogada <= 3) {
				_jogada = _jogada - 1;
				
			} else if(_jogada > 6 && _jogada <= 9) {
				_jogada = _jogada + 1;
			} 
			
			if(valor.charAt(_jogada) == '-') {
				valor.setCharAt(_jogada,opcao.charAt(0));
				jogada_valida = true;
			} 
		}
		
		if (!jogada_valida) {
			System.out.println("\r\nMovimento invalido, favor tentar novamente.");
			RecebeJogada.recebeJogada(valor,opcao);
		}
		
	}
	
	
	

}
