package aula5_Banco;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner  leitor = new Scanner(System.in);
		
		
		Conta_Banco dono1 = new Conta_Banco();
		
	
		int opcao;
		
		do {
		
		System.out.println("Escolha a opcao");
		System.out.println("[1 -ABRIR CONTA  [2-FECHAR CONTA] [3-DEPOSITAR] [4-SACAR] [5-PAGAR MENSALDADE] [6-SAIR] ");
		 opcao = leitor.nextInt();
	
	
		if(opcao == 1) {
			
			dono1.abrirConta();
		}else if(opcao == 2) {
			
			dono1.fecharConta();
		}else if(opcao == 3) {
			
			dono1.depositar();
		}else if(opcao == 4) {
			
			dono1.sacar();
		}else if(opcao == 5) {
			
			dono1.pagarMensalidade();
		}else if(opcao == 6) {
			
			System.out.println("FIM DE PROGRAMA");
		}else {
			
			System.out.println("OPÇÃO INVÁLIDA");
		}
		
		dono1.status();
		
		} while(opcao != 6);
		
			
	}

}		

