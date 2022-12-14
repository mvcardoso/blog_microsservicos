package br.edu.infnet.blog.resources.dto;

public class ArtigoPostsDTO {

	private Long codigo;
	
	private String titulo;
	
	private String conteudo;
	
	private String categoria;
	

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "ArtigoPostsDTO [codigo=" + codigo + ", titulo=" + titulo + ", conteudo=" + conteudo + ", categoria="
				+ categoria + "]";
	}
	
	
}
