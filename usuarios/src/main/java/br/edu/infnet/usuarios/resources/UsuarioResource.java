package br.edu.infnet.usuarios.resources;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.usuarios.modelo.entidades.Usuario;
import br.edu.infnet.usuarios.services.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioResource {

	private static Logger log = LoggerFactory.getLogger(UsuarioResource.class);
	
	@Autowired
	UsuarioService usuarioService;
	
	@GetMapping("/{codigo}")
	public Usuario getUsuario(@PathVariable Long codigo) {
		log.info("Carregando usuário do código: " + codigo);
		return usuarioService.getByCodigo(codigo);
	}
}
