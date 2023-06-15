package processos.domain;



public class Classe_Mago extends Personagem {
	

	private String habEspMago;

	public Classe_Mago(String nome,String raca, int forca,int des,int con,int inte,int prec,int nv,String habEspMago) {
		super(nome,raca,forca,des,con,inte,prec,nv);
	this.habEspMago = habEspMago;
		
	}

	public String gethabEspMago() {
		return habEspMago;
	}

	public void setHabEspecial(String habEspMago) {
		this.habEspMago = habEspMago;
	}

	
	
	
public String toString() {
	String mago = "============================"+"\nDados do Personagem:\nClasse:Mago"+"\nElemento escolhido:"+this.gethabEspMago()+"\nNome:"+this.getNome()+"\nRaça:"+this.getRaca()+"\nForça:"+this.getForca()+"\nDestreza:"+this.getDes()+
	"\nConstituição:"+this.getCon()+"\nInteligência:"+this.getInte()+"\nPrecisão:"+this.getPrec()+"\nNivel:"+this.getNv()+"\n============================";
	return mago;
		
		
	}
}
	

