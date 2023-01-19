package myPackage;

public class DossierBancaire {
	private Compte compte;

	
	//Constructeur
    public DossierBancaire()
    {
    	comptecourant = new CompteCourant(0);
    	compteepargne = new CompteEpargne(0);

    }

    public void deposer(double value) {compte.deposer2(value);
    }
    
    public double get_solde() {return compte.get_solde();}
    
    public double get_ep() {return compteepargne.getSoldeEp();} //POUR TESTS
    
    
    public void remunerer() {compteepargne.addSoldeEp(0, 1);
    m_solde = comptecourant.getSoldeCourant() + compteepargne.getSoldeEp();}
	
}
