package mintic.Repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;

import mintic.Modelo.Usuario;
public interface RepositorioUsuario extends MongoRepository<Usuario,String> {

}
