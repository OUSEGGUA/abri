package ma.abri.service;

import ma.abri.dao.AddressRepository;
import ma.abri.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
@Service
public class AddressServiceImpl implements AddressService{
    @Autowired
    private AddressRepository addressRepository;


    @Override
    public void create(Address address) {
                addressRepository.save(address);
    }

    @Override
    public void deleteAddress(Integer id) {

    }

    @Override
    public Collection<? extends Address> getAllAddress() {
        return null;
    }

    @Override
    public Address getAddressById(Integer id) {
        return null;
    }

    @Override
    public void updateAddress(Address address) {

    }
}
