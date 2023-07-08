package ma.abri.service;


import ma.abri.model.Address;

import java.util.Collection;

public interface AddressService {

    Address create(Address address);
    void deleteAddress(Integer id);
    Iterable<Address> getAllAddress();
    Address getAddressById(Integer id);


    void updateAddress(Address address);
}
