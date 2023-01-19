package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import myPackage.DossierBancaire;

public class TestsDossierBancaire {

	@Test
	public void testConstructeur() {
		DossierBancaire dossier = new DossierBancaire();
		assertEquals(0, dossier.get_solde(), 0);
	}

	@Test
	public void testDeposer() {
		DossierBancaire dossier = new DossierBancaire();
		assertEquals(0, dossier.get_solde(), 0);
		
		dossier.deposer(50);
		assertEquals(50, dossier.get_solde(), 0);
		
		
	}
}
