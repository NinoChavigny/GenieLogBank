package myPackage;

public class CompteEpargne extends Compte{
	
	private double solde_epargne;
	private double taux_interet;
	
	public CompteEpargne()
	{
		super();
		taux_interet = 0.032;
		
	}
	
	public double get_taux() {return taux_interet;}

}
