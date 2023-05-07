package ma.abri.dao;

import ma.abri.model.Announce;
import org.springframework.data.repository.CrudRepository;

public interface AnnounceRepository extends CrudRepository<Announce, Integer> {
}