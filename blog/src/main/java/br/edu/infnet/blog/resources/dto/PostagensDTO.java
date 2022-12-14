package br.edu.infnet.blog.resources.dto;

import java.util.List;

public class PostagensDTO {

	private Integer usuarioId;
	
	private List<ArtigoDTO> artigos;

	public Integer getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Integer usuarioId) {
		this.usuarioId = usuarioId;
	}

	public List<ArtigoDTO> getArtigos() {
		return artigos;
	}

	public void setArtigos(List<ArtigoDTO> artigos) {
		this.artigos = artigos;
	}

	@Override
	public String toString() {
		return "PostagensDTO [usuarioId=" + usuarioId + ", artigos=" + artigos + "]";
	}
	
	
}
