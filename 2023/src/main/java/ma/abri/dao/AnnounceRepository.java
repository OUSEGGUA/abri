package ma.abri.dao;

import ma.abri.model.Announce;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface AnnounceRepository extends CrudRepository<Announce, Integer> {
}