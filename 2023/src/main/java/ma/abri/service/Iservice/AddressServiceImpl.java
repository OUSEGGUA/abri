package ma.abri.service.Iservice;

import jakarta.persistence.EntityNotFoundException;
import ma.abri.dao.AddressRepository;
import ma.abri.model.Address;
import ma.abri.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired private AddressRepository addressRepository;

    @Override
    public Address create(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public void deleteAddress(Integer id) {}

    @Override
    public Iterable<Address> getAllAddress() {
        return addressRepository.findAll();
    }

    @Override
    public Address getAddressById(Integer id) {
        return addressRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public void updateAddress(Address address) {}
}
