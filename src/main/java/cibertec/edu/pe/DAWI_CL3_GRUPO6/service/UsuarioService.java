package cibertec.edu.pe.DAWI_CL3_GRUPO6.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import cibertec.edu.pe.DAWI_CL3_GRUPO6.model.bd.Usuario;
import cibertec.edu.pe.DAWI_CL3_GRUPO6.repository.UsuarioRepository;
 

@Service
public class UsuarioService {
	@Autowired
	private UsuarioRepository usuarioRepository;
 
	private BCryptPasswordEncoder 
		bCryptPasswordEncoder = new BCryptPasswordEncoder();
	
	public Usuario buscarUsuarioPorNomusuario
		(String nomUsuario) {
		return usuarioRepository
				.findByNombre(nomUsuario);
	}
	
	public Usuario guardarUsuario(
			Usuario usuario) {
		usuario.setPassword(
				bCryptPasswordEncoder
					.encode(usuario.getPassword()));
		return usuarioRepository.save(usuario);
	}
}