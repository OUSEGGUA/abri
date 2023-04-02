package ma.abri.dao;

import ma.abri.model.Announce;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnnounceRepository extends JpaRepository<Announce, Integer> {
}