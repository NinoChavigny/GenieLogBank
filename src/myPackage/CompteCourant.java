package myPackage;

public class CompteCourant extends Compte {
	
	public CompteCourant()
	{
		super();
	}
	
	
	public void retrait(double montant) throws Exception
	{
		try {
		if(montant <= this.getSolde())
		{
			this.addSolde(-montant);
		}
		else throw new Exception();
		}
		catch(Exception e){};
		
	}
	

}
