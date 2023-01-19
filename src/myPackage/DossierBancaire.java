package myPackage;

public class DossierBancaire {
	
	private CompteCourant comptecourant;
	private CompteEpargne compteepargne;
	private double m_solde;
	
	//Constructeur
    public DossierBancaire()
    {
    	comptecourant = new CompteCourant(0);
    	compteepargne = new CompteEpargne(0);

    }

    public void deposer(double value) {comptecourant.addSoldeCourant(value*0.4);
    	compteepargne.addSoldeEp(value*0.6, 0);
    	m_solde = comptecourant.getSoldeCourant() + compteepargne.getSoldeEp();
    }
    
    public double get_solde() {return m_solde;}
    
    public double get_ep() {return compteepargne.getSoldeEp();} //POUR TESTS
    
    
    public void remunerer() {compteepargne.addSoldeEp(0, 1);
    m_solde = comptecourant.getSoldeCourant() + compteepargne.getSoldeEp();}
	
}
