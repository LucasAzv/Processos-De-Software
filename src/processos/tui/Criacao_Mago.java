package processos.tui;


import java.util.Scanner;

import processos.dao.rpg_dao;
import processos.domain.Classe_Mago;


public class Criacao_Mago {
	
	
	public static void criacao(){
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
		int escolha1 = 0;
			
			do {
				System.out.println("---------------");
				System.out.println("Digite a ra�a escolhida:");
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
     		System.out.println("Agora escolha qual ser� o seu elemento!");
     		System.out.println("[1]Terra");
     		System.out.println("[2]�gua");
     		System.out.println("[3]Fogo");
     		System.out.println("Digite aqui:");
     		escolha = sx.nextInt();
			 switch(escolha) {
			 
			 case 1:
				 habEspMago = "Terra";
				 Sair = true;
				 break;
				 
			 case 2:	 
				 habEspMago = "�gua";
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
