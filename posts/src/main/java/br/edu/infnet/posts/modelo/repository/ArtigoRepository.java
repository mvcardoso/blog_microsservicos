package br.edu.infnet.posts.modelo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.posts.modelo.entidades.Artigo;

@Repository
public interface ArtigoRepository extends CrudRepository<Artigo, Long>{

}
