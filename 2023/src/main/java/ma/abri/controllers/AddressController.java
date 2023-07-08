package ma.abri.controllers;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import ma.abri.model.Address;
import ma.abri.model.Announce;
import ma.abri.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Controller
@RequestMapping(
        value = "/address")
@CrossOrigin(origins = "*")
public class AddressController {

    @Autowired private AddressService addressServiceImpl;

    @PostMapping("/add")
    public ResponseEntity<Void> createNewAddress(@RequestBody Address address, HttpServletRequest request) {
        log.info("Adding address  {}", address);
        final var addressEntity = addressServiceImpl.create(address);
        final var uri =
                ServletUriComponentsBuilder.fromContextPath(request)
                        .path("/address/findById/{id}")
                        .buildAndExpand(addressEntity.getId())
                        .toUri();

        return ResponseEntity.noContent().location(uri).build();
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    @ResponseBody
    public Iterable<Address> getAll() {

        log.info("Retrieving all addresses");
        return addressServiceImpl.getAllAddress();
    }

    @RequestMapping(value = "/findById/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity getAddressById(@PathVariable(name = "id") Integer id) {

        log.info("Retrieve address by id {}", id);

        final var address = addressServiceImpl.getAddressById(id);
        log.info("Address found {}", address);
        return ResponseEntity.ok(address);
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
