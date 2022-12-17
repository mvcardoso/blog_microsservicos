package br.edu.infnet.posts.resources;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.posts.modelo.entidades.Artigo;
import br.edu.infnet.posts.modelo.services.ArtigoService;

@RestController
@RequestMapping("/artigos")
public class ArtigoResource {
	
	private static Logger log = LoggerFactory.getLogger(ArtigoResource.class);

	@Autowired
	private ArtigoService artigoService;
	
	@GetMapping
	public ResponseEntity<List<Artigo>> getArtigos(){
		log.info("Carregando lista de artigos");
		return ResponseEntity.ok(artigoService.getAll());
	}
}
