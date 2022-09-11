package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class Karakterer {

	public static void main(String[] args) {
		
		int karakter = parseInt(showInputDialog("Antall poeng: "));
		
		final char charA = 'A', charB = 'B', charC = 'C' , charD = 'D' , charE = 'E' , charF = 'F';
		
		final int karakterF = 39, karakterE = 49, karakterD = 59, karakterC = 79, karakterB = 89; 
		String karakterUt = "Karakteren ble: ";
		
		if(karakter < 0 || karakter > 100) {
			
			karakterUt = "Tallet du har skrevet er ugyldig";
			
		} else if (karakter <= karakterF) {
			
			karakterUt += charF;
			
		} else if (karakter <= karakterE) {
			
			karakterUt += charE;
			
		} else if (karakter <= karakterD) {
			
			karakterUt += charD;
		
		} else if (karakter <= karakterC) {
			
			karakterUt += charC;
			
		} else if (karakter <= karakterB) {
			
			karakterUt += charB;
			
		} else { 
			karakterUt += charA;
				
			
		} 
		
		showMessageDialog(null, karakterUt);
		
		
	}

}
