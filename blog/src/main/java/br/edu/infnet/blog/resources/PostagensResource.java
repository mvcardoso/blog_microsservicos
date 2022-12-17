package br.edu.infnet.blog.resources;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import br.edu.infnet.blog.clients.ArtigoClient;
import br.edu.infnet.blog.resources.dto.ArtigoPostsDTO;
import br.edu.infnet.blog.resources.dto.PostagensDTO;
import br.edu.infnet.blog.resources.dto.PostagensResponseDTO;
import br.edu.infnet.blog.resources.dto.UsuarioDTO;

@RestController
@RequestMapping("/postagens")
public class PostagensResource {
	
	private static Logger log = LoggerFactory.getLogger(PostagensResource.class);
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${usuario.endpoint.url}")
	private String usuarioApiUrl;
	
	@Autowired
	private ArtigoClient artigoClient;
	
	@PostMapping
	public PostagensResponseDTO criarPostagem(@RequestBody PostagensDTO postagensDTO) {
		
		log.info("SOLICITACAO PARA POSTAGEM: {}", postagensDTO);
		
		UsuarioDTO usuarioDTO = restTemplate.getForObject(usuarioApiUrl + postagensDTO.getUsuarioId(), UsuarioDTO.class);
		
		ResponseEntity<List<ArtigoPostsDTO>> artigos = artigoClient.getArtigos();
		
		return new PostagensResponseDTO(usuarioDTO, artigos.getBody());
	}

}
