package fr.gtm.Compte_Bancaire;

import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.Test;

public class Test_Compte {

	@Test
	public void test_num_compte() {
			Compte Compte1 = new Compte();
			Compte1.setNumero_compte("00001000607");
			assertEquals("coucou", "00001000607", Compte1.getNumero_compte());
			Compte Compte2 = new Compte();
			Compte2.setNumero_compte("0001000607");
			assertEquals("coucou", "00001000607", Compte2.getNumero_compte());
			Compte Compte = new Compte();
			Compte.setNumero_compte("0000A000607");
			assertEquals("coucou", "00001000607", Compte.getNumero_compte());
		}

	
	public void test_RIB() {
		Compte Compte1 = new Compte();
		Compte1.setRIB("22");
		assertEquals("coucou", "22", Compte1.getRIB());
	}
	
	public void test_code_Etablissement() {
		Compte Compte1 = new Compte();
		Compte1.setCode_Etablissement("12345");
		assertEquals("coucou", "12345", Compte1.getCode_Etablissement());
	}
	
	public void test_numero_Banque() {
		Compte Compte1 = new Compte();
		Compte1.setNumero_Banque("12345");
		assertEquals("coucou", "12345", Compte1.getNumero_Banque());
	}
	
	public void test_class() {
		Compte Compte1 = new Compte(), Compte2= new Compte();
		BigInteger B, BV,B0 = new BigInteger("0");
		
		Compte1.setRIB("22");
		Compte1.setNumero_compte("0000A000607");
		Compte1.setCode_Etablissement("12345");
		Compte1.setNumero_Banque("12345");
		B = Compte1.do_Big();
		BV = Compte1.Verif_Big(B,"97");
		assertEquals("coucou", B0, BV);
		Compte2.setRIB("22");
		Compte2.setNumero_compte("K000607");
		Compte2.setCode_Etablissement("12345");
		Compte2.setNumero_Banque("12345");
		B = Compte2.do_Big();
		BV = Compte2.Verif_Big(B,"97");
		assertEquals("coucou", B0, BV);
	}
}
