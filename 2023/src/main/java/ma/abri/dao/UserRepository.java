package ma.abri.dao;

import ma.abri.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
    User findByEmail(String email);
    User findByFirstName(String userName);
}
