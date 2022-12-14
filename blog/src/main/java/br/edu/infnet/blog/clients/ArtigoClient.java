package br.edu.infnet.blog.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.blog.resources.dto.ArtigoPostsDTO;

@FeignClient("artigo")
public interface ArtigoClient {
	
	@GetMapping("/artigos")
	ResponseEntity<List<ArtigoPostsDTO>> getArtigos();
}
