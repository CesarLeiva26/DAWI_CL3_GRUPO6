package cibertec.edu.pe.DAWI_CL3_GRUPO6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cibertec.edu.pe.DAWI_CL3_GRUPO6.model.bd.Usuario;

@Repository
public interface UsuarioRepository extends
 JpaRepository<Usuario, Integer>{
	
	Usuario findByEmail(String email);
	
	Usuario findByNombre(String usuario);
}