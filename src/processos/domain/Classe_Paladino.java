package processos.domain;

public class Classe_Paladino extends Personagem {
	

	private String habEspPaladino;

	public Classe_Paladino(String nome,String raca, int forca,int des,int con,int inte,int prec,int nv,String habEspPaladino) {
		
		super(nome,raca,forca,des,con,inte,prec,nv);
		
	this.habEspPaladino = habEspPaladino;

}
	
	public String toString() {
		String paladino = "============================"+"\nDados do Personagem:\nClasse:Paladino"+"\nAura escolhida:"+this.getHabEspPaladino()+
				"\nNome:"+this.getNome()+"\nRaça:"+this.getRaca()+"\nForça:"+this.getForca()+"\nDestreza:"+this.getDes()+
				"\nConstituição:"+this.getCon()+"\nInteligência:"+this.getInte()+
				"\nPrecisão:"+this.getPrec()+"\nNivel:"+this.getNv()+"\n============================";;
		return paladino;
		
	}
	
	

	public String getHabEspPaladino() {
		return habEspPaladino;
	}

	public void setHabEspPaladino(String habEspPaladino) {
		this.habEspPaladino = habEspPaladino;
	}
}