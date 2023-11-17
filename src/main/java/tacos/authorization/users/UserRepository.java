package tacos.authorization.users;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Usuario, Long> {

  Usuario findByUsername(String username);
  
}
