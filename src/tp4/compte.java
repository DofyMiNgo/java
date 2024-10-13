package tp4;

public class compte {
	private int numero;
	private personne titulaire;
	private double solde;
	private double decomax;
	private double debitmax;
	private boolean deco;
	private static int compteur;
	
	public compte (personne titulaire) {
		compteur++;
	    this.numero=compteur;
		this.titulaire=titulaire;
		this.decomax=800;
		this.debitmax=1000;
			
	}
	
	public compte(personne titulaire, double decomax, double debitmax) {
		compteur++;
	    this.numero=compteur;
		this.titulaire = titulaire;
		this.decomax = decomax;
		this.debitmax = debitmax;
	}

	
	@Override
	public String toString() {
		return "compte [numero=" + numero + ", titulaire=" + titulaire + ", solde=" + solde + ", decomax=" + decomax
				+ ", debitmax=" + debitmax + ", deco=" + deco + "]";
	}

	public int getnum() {
		return numero;
	}
	public void setnum(int num) {
		 this.numero=num;
	}
	
	
	public personne getTitulaire() {
		return titulaire;
	}

	public void setTitulaire(personne titulaire) {
		this.titulaire = titulaire;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public double getDecomax() {
		return decomax;
	}

	public void setDecomax(double decomax) {
		this.decomax = decomax;
	}

	public double getDebitmax() {
		return debitmax;
	}

	public void setDebitmax(double debitmax) {
		this.debitmax = debitmax;
	}

	public boolean isDeco() {
		return deco;
	}

	public void setDeco(boolean deco) {
		this.deco = deco;
	}

	public void crediter(double s ) {
		if(s>0)
		solde+=s;
		
	}
	public boolean débiter(double s ) {
		if((debitmax<= s) && (this.solde-s<this.decomax)){
		this.solde-=s;
		return true;
	}
		else {
			return false;
		}
	}
	/*public void retrait(double r , compte c1
		, compte c2) {
		if(r>c.debitmax) {
			System.out.println("probleme")
			
		}
		else {
			c1.débiter(r,c1);
			c2.crediter(r, c2);
			
			
		}
	}*/
	
	public boolean estadecouvert() {
		if (this.solde>=0) {
			return false;
		}
		else {
			return true;
		}
		
	}
	
	public double montantdeco() {
		if (this.solde>=0) {
			return 0 ;
		}
		else {
			double s=Math.abs(solde);
			return s ;
		}
	
	
	

}
	
	public void virement1(double m , compte c) {
		
		if(	this.débiter(m))
			c.crediter(m);
			
		}
	
	
	
	public void virement2(double r , compte c1 , compte c2) {
			if(c1.débiter(r)) {
				c2.crediter(r);
				
				
			}
		}
}
