package fr.gtm.Compte_Bancaire;

import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {
		String A = "AB";
		String B = A.replace('A', '1');
		A.replace('A', '1');
		System.out.println(B);
		BigInteger Big = new BigInteger("31"); 
		Big.add(Big);

	}

}
