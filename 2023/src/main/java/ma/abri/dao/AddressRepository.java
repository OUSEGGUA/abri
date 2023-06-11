package ma.abri.dao;

import ma.abri.model.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Integer> {
}
