package processos.tui;

import java.util.Scanner;

import processos.dao.rpg_dao;
import processos.domain.Classe_Paladino;



public class Criacao_Paladino {
	
	public static void criacaoP(){
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
		System.out.println("[1]Humano");
		System.out.println("[2]Orc");
		System.out.println("[3]Elfo das montanhas");
		String raca = null;
		boolean sair = false;
		int escolhaP = 0;
			
			do {
				System.out.println("---------------");
				System.out.println("Digite a ra�a escolhida:");
				System.out.println("---------------");
				 escolhaP = sx.nextInt();
				 switch(escolhaP) {
				 
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
			
	
			String habEspPaladino = null;
			int escolha = 0;
			boolean Sair = false;
			 do {
			System.out.println("-----------------------------------------");
			System.out.println("Agora escolha qual ser� a sua aura de paladino!");
			System.out.println("[1]Aura da coragem");
			System.out.println("[2]Gra�a Divina");
			System.out.println("[3]Ben��o da justi�a");
			System.out.println("Digite aqui:");
			escolha = sx.nextInt();
			 switch(escolha) {
			 
			 case 1:
				 habEspPaladino = "Aura da coragem";
				 Sair = true;
				 break;
				 
			 case 2:	 
				 habEspPaladino = "Gra�a Divina";
				 Sair = true;
				 break;
			
			 case 3:
				 
				 habEspPaladino = "Ben��o da justi�a";
				 Sair = true;
				 break;
			
			default:
				System.out.println("Escolha novamente, dados invalidos!");
				break;
				
			 }

			
				
				}while(Sair != true);
			 System.out.println("-----------------------------------------");
			 
			 Classe_Paladino paladino = new Classe_Paladino(nome,raca,forca,des,con,inte,prec,nv,habEspPaladino);
				rpg_dao.adicionaPaladino(paladino);
				
			
		

}
}
