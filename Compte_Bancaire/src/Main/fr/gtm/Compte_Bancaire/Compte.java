package fr.gtm.Compte_Bancaire;
import java.math.BigInteger;

public class Compte {

//	private int numero_Banque;
//	private int code_Etablissement;
//	private String numero_compte;
//	private int RIB;
	private String numero_Banque,code_Etablissement,numero_compte,RIB;
	
//----------------------------------------------
//	BigInteger
//	--------------------------------------------
	public BigInteger make_Big(String s) {
		BigInteger Big = new BigInteger(s);
		return Big;
	}
	public BigInteger do_Big() {
		String s = "";
		s.concat(numero_Banque);
		s.concat(code_Etablissement);
		s.concat(numero_compte);
		s.concat(RIB);
		BigInteger Big = new BigInteger(s);
		return Big;
	}
	
	public BigInteger Verif_Big(BigInteger B, String modulo) {
		
		return B.remainder(make_Big(modulo));
	}
//----------------------------------------------
//	getter - setter
//	--------------------------------------------
	
	public String getNumero_Banque() {
		return numero_Banque;
	}
	public void setNumero_Banque(String numero_Banque) {
		this.numero_Banque = numero_Banque;
	}
	public String getCode_Etablissement() {
		return code_Etablissement;
	}
	public void setCode_Etablissement(String code_Etablissement) {
		this.code_Etablissement = code_Etablissement;
	}
	public String getNumero_compte() {
		return numero_compte;
	}
	public void setNumero_compte(String num_compte) {
		char tampon_char;
		String tampon_String = num_compte;
        for(int i=0 ; i< num_compte.length() ; i++) {
        	tampon_char = num_compte.charAt(i);
        	if(tampon_char == 'A' || tampon_char == ('J')) {
        		tampon_String = num_compte.replace(num_compte.charAt(i),'1');
        	}
        	if(tampon_char == 'B' || tampon_char == ('K') || tampon_char == ('S')) {
        		tampon_String = num_compte.replace(num_compte.charAt(i),'2');
        	}
        	if(tampon_char == 'C' || tampon_char == ('L') || tampon_char == ('T')) {
        		tampon_String = num_compte.replace(num_compte.charAt(i),'3');
        	}
        	if(tampon_char == 'D' || tampon_char == ('M') || tampon_char == ('U')) {
        		tampon_String = num_compte.replace(num_compte.charAt(i),'4');
        	}
        	if(tampon_char == 'E' || tampon_char == ('N') || tampon_char == ('V')) {
        		tampon_String = num_compte.replace(num_compte.charAt(i),'5');
        	}
        	if(tampon_char == 'F' || tampon_char == ('O') || tampon_char == ('W')) {
        		tampon_String = num_compte.replace(num_compte.charAt(i),'6');
        	}
        	if(tampon_char == 'G' || tampon_char == ('P') || tampon_char == ('X')) {
        		tampon_String = num_compte.replace(num_compte.charAt(i),'7');
        	}
        	if(tampon_char == 'H' || tampon_char == ('Q') || tampon_char == ('Y')) {
        		tampon_String = num_compte.replace(num_compte.charAt(i),'8');
        	}
        	if(tampon_char == 'I' || tampon_char == ('R') || tampon_char == ('Z')) {
        		tampon_String = num_compte.replace(num_compte.charAt(i),'9');
        	}
        }
		if(tampon_String.length() < 11) {
			String tampon = "0"; 
			for(int i = tampon_String.length() ; i < 11 ; i++) {
				tampon.concat("0");
			}
			tampon = tampon.concat(tampon_String);
			this.numero_compte = tampon;
		}
		else {
			this.numero_compte = tampon_String;
		}
	}
	public String getRIB() {
		return RIB;
	}
	public void setRIB(String rIB) {
		RIB = rIB;
	}
	
//      --------------------------------------------
//		Constructeurs
//		--------------------------------------------
	
	public Compte(){
		
	}
	
	public Compte(String num_compte){
		this.setNumero_compte(num_compte);
	}
	
}
