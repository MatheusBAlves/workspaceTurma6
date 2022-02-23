package br.com.fiap.aula9.beans;

public class Login {
	private String usuario;
	private String senha;
	
	// constante de acesso
	private String userAcesso = "admin";
	private String userPwd = "admin";
	
	
	public Login() {}

	public Login(String usuario, String senha) {
		super();
		this.usuario = usuario;
		this.senha = senha;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	};
	
	public boolean fazeLogin(String usuario, String senha) {
		
		// Para colocar dados fixos
		
		// if ( usuario.equalsIgnoreCase("admin") &&  senha.equalsIgnoreCase("admin"))

		
		
		// Sem uso do Try catch
		
		// if (this.userAcesso.equalsIgnoreCase(usuario) && this.userPwd.equalsIgnoreCase(senha)) {
		//	return true;
		//} else 
		//	return false;

		
		try {
			if (this.userAcesso.equalsIgnoreCase(usuario) && this.userPwd.equalsIgnoreCase(senha)) {
				return true;
			}
			throw new Exception("log: Usuario/Senha invalidados..!!" + usuario);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
	}
	
	
}
