package beans;

public class Televisor {
	// atributos
	
	private short canal;
	private short volume = 0;
	private boolean ligado;
	
	
	// getters 
	public short getCanal() {
		return canal;
	}
	public void setCanal(short canal) {
		this.canal = canal;
	}
	
	public short getVolume() {
		return volume;
	}
	
	public void setVolume(short volume) {
		if (this.volume > 0 && this.volume < 10) 
			this.volume = volume;
	}
	
	public void reduzirVolume() {
		setVolume((short) (getVolume() - 1));
	}
	
	
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}


	// Metodos
	
	public void ligar() {
		System.out.println("Ligando a TV...");
		this.ligado = true;
	}
	
	public void desligar() {
		System.out.println("Desligando a TV...");
		this.ligado = false;
	}
	
	public void mostrarStatus() {
		System.out.println("Canal: " + this.canal +
				           " / Vol: " + this.volume + 
				           " / Ligado: " + this.ligado );
	}
	
	
	
	public void aumentarVolume() {
		if (this.volume < 10) {
		    this.volume = (short) (this.volume + 1);
		    this.volume++; 
		} 
		System.out.println("Volume ++");
	}
	
	public void diminuirVolume() {
		short volumeAtual = getVolume();
		short novoVolume = (short) (volumeAtual - 1);
		setVolume(novoVolume);
		
		setVolume((short) (getVolume() - 1));
		System.out.println("Volume --");
	}

	
	
	
}
