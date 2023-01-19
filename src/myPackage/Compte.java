package myPackage;

public class Compte {
	
	private CompteCourant comptecourant;
	private CompteEpargne compteepargne;
	private double m_solde;
	
    public Compte()
    {
    	comptecourant = new CompteCourant(0);
    	compteepargne = new CompteEpargne(0);

    }
    
    public void deposer2(double value) {comptecourant.addSoldeCourant(value*0.4);
	compteepargne.addSoldeEp(value*0.6, 0);
	m_solde = comptecourant.getSoldeCourant() + compteepargne.getSoldeEp();
}
    
    public double get_solde() {return m_solde;}


}
