package myPackage;

public class Compte {
	
	private double m_solde;
	
    public Compte()
    {
    	m_solde = 0;

    }
    
    public double getSolde()
	{
		return m_solde;
	}
    
    public void addSolde(double montant)
	{ m_solde = m_solde + montant; }


}
