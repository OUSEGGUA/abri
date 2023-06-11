package ma.abri.service;


import ma.abri.model.Address;

import java.util.Collection;

public interface AddressService {

    void create(Address address);
    void deleteAddress(Integer id);
    Collection<? extends Address> getAllAddress();
    Address getAddressById(Integer id);


    void updateAddress(Address address);
}
