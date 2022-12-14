package br.edu.infnet.blog.resources.dto;


public class UsuarioDTO {


	private Long codigo;
	
	private String email;
	
	private String senha;
	
	private String nome;
	
	public UsuarioDTO() {}

	public UsuarioDTO(Long codigo, String email,  String senha, String nome) {
		super();
		this.codigo = codigo;
		this.email = email;
		this.senha = senha;
		this.nome = nome;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "UsuarioDTO [codigo=" + codigo + ", email=" + email + ", senha=" + senha + ", nome=" + nome + "]";
	}
}