package ma.abri.dao;

import ma.abri.model.Announce;
import ma.abri.model.Roles;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RolesRepository extends CrudRepository<Roles, Integer> {
    List<Roles> findByRole(String role);
    List<Roles> findAll();

}
