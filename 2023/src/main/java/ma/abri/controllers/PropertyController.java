package ma.abri.controllers;

import ma.abri.model.Announce;
import ma.abri.model.Property;
import ma.abri.service.AnnounceService;
import ma.abri.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/property")
@CrossOrigin(origins = "*")
public class PropertyController {
    @Autowired
    private PropertyService propertyServiceImpl;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public void createNewProperty(@RequestBody Property property) {
        propertyServiceImpl.create(property);
    }

//    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
//    @ResponseBody
//    public List<Property> getAll() {
//        List<Property> announceList = new ArrayList<>();
//        announceList.addAll(propertyServiceImpl.getAllProperty());
//        return announceList;
//    }
    @RequestMapping(value = "/findById/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Property getPropertyById(@PathVariable(name = "id") Integer id) {
        return propertyServiceImpl.getPropertyById(id);
    }
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void delete(@PathVariable(name = "id") Integer id) {

        propertyServiceImpl.deleteProperty(id);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public void update(Property property) {
        propertyServiceImpl.updateProperty(property);
    }

    public PropertyService getPropertyServiceImpl() {
        return propertyServiceImpl;
    }

    public void setPropertyServiceImpl(PropertyService propertyServiceImpl) {
        this.propertyServiceImpl = propertyServiceImpl;
    }
}
