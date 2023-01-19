package myPackage;

public class CompteEpargne {
	
	private double solde_epargne;
	private double taux_interet;
	
	public CompteEpargne(double solde)
	{
		solde_epargne = solde;
		taux_interet = 0.032;
	}
	
	public void addSoldeEp(double montant, int indice)
	{
		if(indice == 0)
		{
			solde_epargne = solde_epargne + montant;
		}
		else { solde_epargne = solde_epargne + solde_epargne*taux_interet;}
		
		
	}
	
	public double getSoldeEp()
	{
		return solde_epargne;
	}

}
