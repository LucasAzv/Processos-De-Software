package processos.domain;

public class Classe_Arqueiro extends Personagem {
	
	
private String habEspArqueiro;

public Classe_Arqueiro(String nome,String raca, int forca,int des,int con,int inte,int prec,int nv,String habEspArqueiro) {
		
		super(nome,raca,forca,des,con,inte,prec,nv);
		
	this.habEspArqueiro = habEspArqueiro;

}
	
	public String toString() {
		String arqueiro = "============================"+"\nDados do Personagem:\nClasse:Arqueiro"+"\nHabilidade escolhida:"+this.getHabEspArqueiro()+
				"\nNome:"+this.getNome()+"\nRa�a:"+this.getRaca()+"\nFor�a:"+this.getForca()+"\nDestreza:"+this.getDes()+
				"\nConstitui��o:"+this.getCon()+"\nIntelig�ncia:"+this.getInte()+
				"\nPrecis�o:"+this.getPrec()+"\nNivel:"+this.getNv()+"\n============================";;
		return arqueiro;
		
	}

	public String getHabEspArqueiro() {
		return habEspArqueiro;
	}

	public void setHabEspArqueiro(String habEspArqueiro) {
		this.habEspArqueiro = habEspArqueiro;
	}

}
