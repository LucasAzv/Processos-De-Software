package processos.domain;

public class Classe_Cavaleiro extends Personagem {
	
	
private String habEspCavaleiro;

public Classe_Cavaleiro(String nome,String raca, int forca,int des,int con,int inte,int prec,int nv,String habEspCavaleiro) {
		
		super(nome,raca,forca,des,con,inte,prec,nv);
		
	this.habEspCavaleiro = habEspCavaleiro;

}
	
	public String toString() {
		String cavaleiro = "============================"+"\nDados do Personagem:\nClasse:Cavaleiro"+"\nHabilidade escolhida:"+this.getHabEspCavaleiro()+
				"\nNome:"+this.getNome()+"\nRaça:"+this.getRaca()+"\nForça:"+this.getForca()+"\nDestreza:"+this.getDes()+
				"\nConstituição:"+this.getCon()+"\nInteligência:"+this.getInte()+
				"\nPrecisão:"+this.getPrec()+"\nNivel:"+this.getNv()+"\n============================";;
		return cavaleiro;
		
	}

	public String getHabEspCavaleiro() {
		return habEspCavaleiro;
	}

	public void setHabEspCavaleiro(String habEspCavaleiro) {
		this.habEspCavaleiro = habEspCavaleiro;
	}

}
