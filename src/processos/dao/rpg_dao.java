package processos.dao;

import java.util.ArrayList;
import java.util.List;

import processos.domain.Personagem;

public class rpg_dao {
	
	private static List<Personagem> persona = new ArrayList<>();
	
	public static void adicionapersona(Personagem personagem) {
		persona.add(personagem);
	}
	public static void adicionaMago(Personagem mago) {
		persona.add(mago);
	}
	public static void adicionaPaladino(Personagem paladino) {
		persona.add(paladino);
	}
	public static void adicionaCavaleiro(Personagem cavaleiro) {
		persona.add(cavaleiro);
	}
	public static void adicionaArqueiro(Personagem arqueiro) {
		persona.add(arqueiro);
	}
	
	public static List<Personagem> mostraLista(){
		return persona;
		
	}
	
	

}
