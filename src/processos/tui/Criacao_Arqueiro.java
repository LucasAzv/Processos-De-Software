package processos.tui;

import java.util.Scanner;
import processos.domain.Classe_Arqueiro;
import processos.domain.Personagem;
import processos.dao.rpg_dao;

	

public class Criacao_Arqueiro {
	
	public static void criacaoA(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Est� na hora de criar o seu personagem!");
	
		System.out.println("Nome:");
		String nome = sc.nextLine();
		
		
		
		System.out.println("====================="+"Atributos"+"=====================");
		System.out.println("For�a:");
		int forca = sc.nextInt();
			
		
		System.out.println("Destreza:");
		int des = sc.nextInt();
		
		System.out.println("Constitui��o:");
		int con = sc.nextInt();
		
		System.out.println("Intelig�ncia:");
		int inte = sc.nextInt();
		
		System.out.println("Precis�o:");
		int prec = sc.nextInt();
		System.out.println("Nivel:");
		int nv = sc.nextInt();
		Scanner sx = new Scanner(System.in);
		//Resolver tratamento de erros
		System.out.println("A escolha da ra�a do seu personagem te garante atributos extras:\nOrc[For�a +5 Constitui��o +10] \nElfo das montanhas[Destreza +9 Intelig�ncia +6]");
		System.out.println("Humano[Intelig�ncia +4 Destreza +4]");
		System.out.println("Escolha a Ra�a do seu personagem");
		System.out.println("[1]Humano");
		System.out.println("[2]Orc");
		System.out.println("[3]Elfo das montanhas");
		String raca = null;
		boolean sair = false;
		int escolhaA = 0;
			
			do {
				System.out.println("---------------");
				System.out.println("Digite a ra�a escolhida:");
				System.out.println("---------------");
				 escolhaA = sx.nextInt();
				 switch(escolhaA) {
				 
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
			
	
		
			
			String habEspArqueiro = null;
			int escolha = 0;
			boolean Sair = false;
			 do {
		System.out.println("-----------------------------------------");
		System.out.println("Agora escolha qual ser� a sua habilidade!");
		System.out.println("[1]Rastreador Eficaz");
		System.out.println("[2]Ricochete");
		System.out.println("[3]Flecha M�stica");
		System.out.println("Digite aqui:");
		escolha = sx.nextInt();
		 switch(escolha) {
		 
		 case 1:
			 habEspArqueiro = "Rastreador Eficaz";
			 Sair = true;
			 break;
			 
		 case 2:	 
			 habEspArqueiro = "Ricochete";
			 Sair = true;
			 break;
		
		 case 3:
			 
			 habEspArqueiro = "Flecha M�stica";
			 Sair = true;
			 break;
		
		default:
			System.out.println("Escolha novamente, dados invalidos!");
			break;
			
		 }

		System.out.println("-----------------------------------------");
			
			}while(Sair != true);
			Classe_Arqueiro arqueiro = new Classe_Arqueiro(nome,raca,forca,des,con,inte,prec,nv,habEspArqueiro);
			rpg_dao.adicionaArqueiro(arqueiro);
			
		
	

		
			
		
		
	}
	

}

