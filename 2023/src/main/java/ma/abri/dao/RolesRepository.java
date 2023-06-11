package ma.abri.dao;

import ma.abri.model.Announce;
import org.springframework.data.repository.CrudRepository;

public interface RolesRepository extends CrudRepository<Announce, Integer> {
}
