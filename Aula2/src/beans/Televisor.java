package beans;

public class Televisor {
	// atributos
	
	private Short canal;
	private Short volume;
	private boolean ligado;
	
	
	// getters 
	public Short getCanal() {
		return canal;
	}
	public void setCanal(Short canal) {
		this.canal = canal;
	}
	
	public Short getVolume() {
		return volume;
	}
	public void setVolume(Short volume) {
		this.volume = volume;
	}
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}


	// Metodos
	
	public void ligar() {
		this.ligado = true;
	}
	
	public void desligar() {
		this.ligado = false;
	}
	
	
}
