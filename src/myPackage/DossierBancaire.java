package myPackage;

public class DossierBancaire {
	private CompteCourant comptecourant;
	private CompteEpargne compteepargne;
	private double m_solde;
	
    public DossierBancaire()
    {
    	comptecourant = new CompteCourant();
    	compteepargne = new CompteEpargne();

    }
    
    public void deposer(double value) {comptecourant.addSolde(value*0.4);
	compteepargne.addSolde(value*0.6);
	m_solde = comptecourant.getSolde() + compteepargne.getSolde();
}
    
    public double get_ep() {return compteepargne.getSolde();} //POUR TESTS
    
    public double get_solde() {
    	m_solde = comptecourant.getSolde() + compteepargne.getSolde();
    	return m_solde;}
    
    public void remunerer() {compteepargne.addSolde(compteepargne.get_taux()* compteepargne.getSolde());}
    


}
	

