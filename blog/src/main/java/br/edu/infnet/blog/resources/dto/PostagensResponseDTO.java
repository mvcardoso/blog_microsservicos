package br.edu.infnet.blog.resources.dto;

import java.util.List;

public class PostagensResponseDTO {
	
	private UsuarioDTO usuario;
	
	private List<ArtigoPostsDTO> listArtigosPostDTO;
	
	
	public PostagensResponseDTO() {}

	public PostagensResponseDTO(UsuarioDTO usuario, List<ArtigoPostsDTO> listArtigosPostDTO) {
		super();
		this.usuario = usuario;
		this.listArtigosPostDTO = listArtigosPostDTO;
	}


	public UsuarioDTO getUsuario() {
		return usuario;
	}


	public List<ArtigoPostsDTO> getListArtigosPostDTO() {
		return listArtigosPostDTO;
	}



}
