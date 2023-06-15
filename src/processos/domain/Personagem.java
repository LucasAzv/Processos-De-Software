package processos.domain;


public class Personagem {
	
	
		
		
		
		private String nome;
		private String raca;
		private int forca;
		private int des;
		private int con;
		private int inte;
		private int prec;
		private int nv;


		public Personagem(String nome,String raca, int forca,int des,int con,int inte,int prec,int nv) {
			this.nome = nome;
			this.raca = raca;
			this.forca = forca;
			this.des = des;
			this.con = con;
			this.inte = inte;
			this.prec = prec;
			this.nv = nv;
			
			
		}
		
		
		
		

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getRaca() {
			return raca;
		}

		public void setRaca(String raca) {
			this.raca = raca;
		}

		public int getForca() {
			return forca;
		}

		public void setForca(int forca) {
			this.forca = forca;
		}

		public int getDes() {
			return des;
		}

		public void setDes(int des) {
			this.des = des;
		}

		public int getCon() {
			return con;
		}

		public void setCon(int con) {
			this.con = con;
		}

		public int getInte() {
			return inte;
		}

		public void setInte(int inte) {
			this.inte = inte;
		}

		public int getPrec() {
			return prec;
		}

		public void setPrec(int prec) {
			this.prec = prec;
		}

		public int getNv() {
			return nv;
		}

		public void setNv(int nv) {
			this.nv = nv;
		}

		
		
		
		
		
		

	}



