package jogodavelhaEE.src.controller;

import java.util.Scanner;

import jogodavelhaEE.src.model.Inteligencia;
import jogodavelhaEE.src.view.ExecutaJogo;
import jogodavelhaEE.src.view.ImprimeTabuleiro;
import jogodavelhaEE.src.view.ImprimirJogo;
import jogodavelhaEE.src.view.Opcoes;
import jogodavelhaEE.src.view.RecebeJogada;
import jogodavelhaEE.src.view.VerificaJogo;

public class Controllers {
	static boolean executaEstado= true;
	static Scanner scanner = new Scanner(System.in); // Objeto que recebe a entrada do teclado
	static StringBuilder valor = new StringBuilder("");
	static boolean jogada = true;
	static String opcao;
	
	public static void main(String[] args) {
		
		String op = Opcoes.opcoes(opcao);
		ExecutaJogo.executar(valor,executaEstado,op);
		
		while(executaEstado) {
			
			System.out.print("\r\n");
			
			ImprimeTabuleiro.imprimiTabuleiro();
			
			System.out.print("\r\n\r\nJogo atual: \r\n\r\n");
			

			ImprimirJogo.imprimiJogo(valor);
			
			
			RecebeJogada.recebeJogada(valor,op);
			
			
			Inteligencia.inteligenciaArtificial(valor, op);
			
			
			VerificaJogo.verificaJogo(valor,executaEstado);
			
		}
		
		if (!executaEstado) {
			System.out.println("\r\nTermino de jogo!\r\n");
			ImprimirJogo.imprimiJogo(valor);
		}
		
		System.exit(0);
	}

}