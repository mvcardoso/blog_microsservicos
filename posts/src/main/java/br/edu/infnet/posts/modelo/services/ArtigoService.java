package br.edu.infnet.posts.modelo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.posts.modelo.entidades.Artigo;
import br.edu.infnet.posts.modelo.repository.ArtigoRepository;

@Service
public class ArtigoService {
	
	@Autowired
	ArtigoRepository artigoRepository;
	
	public List<Artigo> getAll(){
		return (List<Artigo>) artigoRepository.findAll();
	}

}
