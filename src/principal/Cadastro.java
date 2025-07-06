package principal;

public class Cadastro {
	private String nome_usuario;
	private String senha_usuario;
	
	public Cadastro(String nome, String senha) {
		this.nome_usuario = nome;
		this.senha_usuario = senha;
	}
	
	public String getNome() {
		return this.nome_usuario;
	}
	
	public void setNome(String novo_nome_usuario) {
		this.nome_usuario = novo_nome_usuario;
	}
	
	public String getSenha() {
		return this.senha_usuario;
	}
	
	public void setSenha(String nova_senha_usuario) {
		this.senha_usuario = nova_senha_usuario;
	}
	
	public String toString() {
		return "Usuário: " + this.nome_usuario;
	}
}
