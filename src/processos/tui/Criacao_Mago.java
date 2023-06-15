package processos.tui;


import java.util.Scanner;

import processos.dao.rpg_dao;
import processos.domain.Classe_Mago;


public class Criacao_Mago {
	
	
	public static void criacao(){
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
		//Resolver tratamento de erros
		System.out.println("A escolha da raça do seu personagem te garante atributos extras:\nOrc[Força +5 Constituição +10] \nElfo das montanhas[Destreza +9 Inteligência +6]");
		System.out.println("Humano[Inteligência +4 Destreza +4]");
		System.out.println("Escolha a Raça do seu personagem");
		System.out.println("[1]Humano");
		System.out.println("[2]Orc");
		System.out.println("[3]Elfo das montanhas");
		String raca = null;
		boolean sair = false;
		int escolha1 = 0;
			
			do {
				System.out.println("---------------");
				System.out.println("Digite a raça escolhida:");
				System.out.println("---------------");
				 escolha1 = sx.nextInt();
				 switch(escolha1) {
				 
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
			
		String habEspMago = null;
		int escolha = 0;
		boolean Sair = false;
		 do {
			 System.out.println("-----------------------------------------");
     		System.out.println("Agora escolha qual será o seu elemento!");
     		System.out.println("[1]Terra");
     		System.out.println("[2]Água");
     		System.out.println("[3]Fogo");
     		System.out.println("Digite aqui:");
     		escolha = sx.nextInt();
			 switch(escolha) {
			 
			 case 1:
				 habEspMago = "Terra";
				 Sair = true;
				 break;
				 
			 case 2:	 
				 habEspMago = "Àgua";
				 Sair = true;
				 break;
			
			 case 3:
				 
				 habEspMago = "Fogo";
				 Sair = true;
				 break;
			
			default:
				System.out.println("Escolha novamente, dados invalidos!");
				break;
				
			 }

          
            	
        			
        			
               
        		
        		
		 }while (Sair != true);
		
		System.out.println("-----------------------------------------");
		
	
			
		
		
		
			Classe_Mago mago = new Classe_Mago(nome,raca,forca,des,con,inte,prec,nv,habEspMago);
			rpg_dao.adicionaMago(mago);
			
		
	

		
			
		
		
	
	
	


}
}
