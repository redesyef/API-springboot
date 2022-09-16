package mintic.Repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import mintic.Modelo.Rol;

public interface RepositorioRol extends MongoRepository<Rol,String> {

}
