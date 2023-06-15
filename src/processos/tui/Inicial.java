package processos.tui;

import java.util.InputMismatchException;
import java.util.Scanner;

import processos.dao.rpg_dao;
import processos.domain.Personagem;


public class Inicial {

	public static void main(String[] args) {
	try {
			iniciar();
	}
	catch (InputMismatchException e) {
		System.out.println("Dado invalido, escolha sua opção do menu novamente, insira os dados corretamente!");
		e.printStackTrace();
		iniciar();
	}
	
	finally {
		iniciar();
	}

	
	}
	
	public static void iniciar() {
		Scanner sc = new Scanner(System.in);
		int escolha = 0;
		System.out.println("Bem vindo ao menu de criação de personagem!, escolha a sua classe e continue a sua aventura.");
		
		do {
			menu();
			System.out.println("Informe a sua opção:");
			escolha = sc.nextInt();
		switch(escolha) {
		case 1:
			try {
				Criacao_Mago.criacao();
			} catch (InputMismatchException e) {
				System.out.println("Dado invalido, escolha sua opção do menu novamente, insira os dados corretamente!");
				e.printStackTrace();
			} 
			
		break;
		
		case 2:
			try {
				Criacao_Paladino.criacaoP();
			} catch (InputMismatchException p) {
				System.out.println("Dado invalido, escolha sua opção do menu novamente, insira os dados corretamente!");
				p.printStackTrace();
			} 
			break;
			
		case 3:
			try {
				Criacao_Cavaleiro.criacaoC();
			} catch (InputMismatchException c) {
				System.out.println("Dado invalido, escolha sua opção do menu novamente, insira os dados corretamente!");
				c.printStackTrace();
			} 
			break;
			
		case 4:
			
			try {
				Criacao_Arqueiro.criacaoA();
			} catch (InputMismatchException a) {
				System.out.println("Dado invalido, escolha sua opção do menu novamente, insira os dados corretamente!");
				a.printStackTrace();
			} 
			
		break;
		case 5:
			mostraLista();
			break;
			
		case 6:
			System.out.println("Saindo do sistema");
			System.exit(0);
		}
			
			
			
			
		}while(escolha != 7);
		
		
		
		
		
		
	}
	private static void mostraLista() {
		for(Personagem a : rpg_dao.mostraLista()) {
			print(a);
		}
	}
	
	private static void print(Personagem a) {
		System.out.println(a);
	}
	private static void menu() {
		System.out.println("[1]Criar um Mago");
		System.out.println("[2]Criar um Paladino");
		System.out.println("[3]Criar um Cavaleiro");
		System.out.println("[4]Criar um Arqueiro");
		System.out.println("[5]Lista dos personagens criados");
		System.out.println("[6]Selecionar folha por indice");
		System.out.println("[7]Sair");
	}
	
	

}
