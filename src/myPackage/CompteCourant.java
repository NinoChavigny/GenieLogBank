package myPackage;

public class CompteCourant {
	
	private double solde_courant;
	
	public CompteCourant(double solde)
	{
		solde_courant = solde;
	}
	
	public void addSoldeCourant(double montant)
	{
		solde_courant = solde_courant + montant;
		
	}
	
	public double getSoldeCourant()
	{
		return solde_courant;
	}

}
