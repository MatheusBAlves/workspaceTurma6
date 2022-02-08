package implementacao;

import beans.Televisor;

public class ExecutarTV {

	public static void main(String[] args) {
		
		Televisor sansung = new Televisor();
		
		sansung.ligar();
		sansung.aumentarVolume();
		sansung.mostrarStatus();

		sansung.diminuirVolume();
		sansung.diminuirVolume();
		sansung.diminuirVolume();
		sansung.mostrarStatus();

		
		sansung.aumentarVolume();
		sansung.aumentarVolume();
		sansung.aumentarVolume();
		sansung.aumentarVolume();
	    sansung.aumentarVolume();
	    sansung.aumentarVolume();	    
	    sansung.aumentarVolume();
		//sansung.mostrarStatus();

		sansung.diminuirVolume();
		sansung.mostrarStatus();

		
	}

}
