package myPackage;

public class DossierBancaire {
	
	private CompteCourant comptecourant;
	private double m_solde;
	
	//Constructeur
    public DossierBancaire()
    {
    	comptecourant = new CompteCourant(0);
    }

    public void deposer(double value) {comptecourant.addSoldeCourant(value);
    	m_solde = comptecourant.getSoldeCourant();
    }
    
    public double get_solde() {return m_solde;}
    
    public void remunerer() {}
	
}
