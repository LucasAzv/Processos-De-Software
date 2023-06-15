package processos.tui;

import java.util.Scanner;

import processos.dao.rpg_dao;
import processos.domain.Classe_Cavaleiro;



public class Criacao_Cavaleiro {

	public static void criacaoC(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Está na hora de criar o seu personagem!");
	
		System.out.println("Nome:");
		String nome = sc.nextLine();
		
		
		
		System.out.println("====================="+"Atributos"+"=====================");
		System.out.println("Força:");
		int forca = sc.nextInt();
			
		
		System.out.println("Destreza:");
		int des = sc.nextInt();
		
		System.out.println("Constituição:");
		int con = sc.nextInt();
		
		System.out.println("Inteligência:");
		int inte = sc.nextInt();
		
		System.out.println("Precisão:");
		int prec = sc.nextInt();
		System.out.println("Nivel:");
		int nv = sc.nextInt();
		Scanner sx = new Scanner(System.in);
		System.out.println("A escolha da raça do seu personagem te garante atributos extras:\nOrc[Força +5 Constituição +10] \nElfo das montanhas[Destreza +9 Inteligência +6]");
		System.out.println("Humano[Inteligência +4 Destreza +4]");
		System.out.println("[1]Humano");
		System.out.println("[2]Orc");
		System.out.println("[3]Elfo das montanhas");
		String raca = null;
		boolean sair = false;
		int escolhaC = 0;
			
			do {
				System.out.println("---------------");
				System.out.println("Digite a raça escolhida:");
				System.out.println("---------------");
				 escolhaC = sx.nextInt();
				 switch(escolhaC) {
				 
				 case 1:
					 raca = "Humano";
					 inte = (inte + 4);
					 des = (des + 4);
					 sair = true;
					 break;
					 
				 case 2:	 
					raca = "Orc";
					con = (con + 10);
					forca = (forca + 5);
					 sair = true;
					 break;
				
				 case 3:
					 
					 raca = "Elfo das montanhas";
					 des = (des + 9);
					 inte = (inte + 6);
					 sair = true;
					 break;
				
				default:
					System.out.println("Escolha novamente, dados invalidos!");
					System.out.println("[1]Humano");
					System.out.println("[2]Orc");
					System.out.println("[3]Elfo das montanhas");
					break;
					
				 }
			}while(sair != true);
			
			
			
			String habEspCavaleiro = null;
			int escolha = 0;
			boolean Sair = false;
			 do {
					System.out.println("-----------------------------------------");
					System.out.println("Agora escolha qual será a sua habilidade!");
					System.out.println("[1]Rigidez do Veterano");
					System.out.println("[2]Segundo Golpe");
					System.out.println("[3]Retaliação Imediata");
					System.out.println("Digite aqui:");
					escolha = sx.nextInt();
					 switch(escolha) {
					 
					 case 1:
						 habEspCavaleiro = "Rigidez do Veterano";
						 Sair = true;
						 break;
						 
					 case 2:	 
						 habEspCavaleiro = "Segundo Golpe";
						 Sair = true;
						 break;
					
					 case 3:
						 
						 habEspCavaleiro = "Retaliação Imediata";
						 Sair = true;
						 break;
					
					default:
						System.out.println("Escolha novamente, dados invalidos!");
						break;
						
			}
			 }while(Sair != true);
					 
					 System.out.println("-----------------------------------------");
					 
			Classe_Cavaleiro cavaleiro = new Classe_Cavaleiro(nome,raca, forca,des,con,inte,prec,nv,habEspCavaleiro);
			rpg_dao.adicionaCavaleiro(cavaleiro);
			
		}
	}
	
		
	


