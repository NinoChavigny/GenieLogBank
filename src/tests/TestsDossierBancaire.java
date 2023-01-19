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
		
		dossier.deposer(100);
		assertEquals(100, dossier.get_solde(), 0);
		assertEquals(60, dossier.get_ep(), 0);
		
		dossier.remunerer();
		assertEquals(101.92, dossier.get_solde(), 0);
		
		
	}
	
	@Test
	public void testCompteEpargne() {
		DossierBancaire dossier = new DossierBancaire();
		assertEquals(0, dossier.get_solde(), 0);
		
		dossier.deposer(100);
		
		dossier.remunerer();
		assertEquals(101.92, dossier.get_solde(), 0);
		
		
	}
}
