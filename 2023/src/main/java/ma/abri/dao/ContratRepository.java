package ma.abri.dao;

import ma.abri.model.Announce;
import ma.abri.model.Contrat;
import org.springframework.data.repository.CrudRepository;

public interface ContratRepository  extends CrudRepository<Contrat, Integer> {
}
