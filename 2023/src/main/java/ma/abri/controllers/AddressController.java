package ma.abri.controllers;

import ma.abri.model.Address;
import ma.abri.model.Announce;
import ma.abri.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/address")
@CrossOrigin(origins = "*")
public class AddressController {

    @Autowired
    private AddressService addressServiceImpl;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public void createNewAddress(@RequestBody Address address) {
        addressServiceImpl.create(address);
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    @ResponseBody
    public List<Address> getAll() {
        List<Address> addressesList = new ArrayList<>();
        addressesList.addAll(addressServiceImpl.getAllAddress());
        return addressesList;
    }
    @RequestMapping(value = "/findById/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Address getAddressById(@PathVariable(name = "id") Integer id) {
        return addressServiceImpl.getAddressById(id);
    }
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void delete(@PathVariable(name = "id") Integer id) {
        addressServiceImpl.deleteAddress(id);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public void update(Address address) {
        addressServiceImpl.updateAddress(address);
    }
}
