package br.edu.infnet.usuarios.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.usuarios.modelo.entidades.Usuario;
import br.edu.infnet.usuarios.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public Usuario getByCodigo(Long codigo) {
		Usuario usuario = usuarioRepository.findById(codigo).get();
		usuario.setNome(usuario.getNome() + "Instancia 2");
		return usuario;
	}
}
