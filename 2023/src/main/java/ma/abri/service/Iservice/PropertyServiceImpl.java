package ma.abri.service.Iservice;

import ma.abri.dao.PropertyRepository;
import ma.abri.model.Announce;
import ma.abri.model.Property;
import ma.abri.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
@Service
public class PropertyServiceImpl implements PropertyService {

    @Autowired
    private PropertyRepository propertyRepository;

    @Override
    public void create(Property property) {
        propertyRepository.save(property);
    }

    @Override
    public void deleteProperty(Integer id) {
        propertyRepository.deleteById(id);
    }

    @Override
    public Collection<? extends Property> getAllProperty() {
        return (List<Property>) propertyRepository.findAll();
    }

    @Override
    public Property getPropertyById(Integer id) {
        return (Property) propertyRepository.findById(id).get();
    }

    @Override
    public void updateProperty(Property property) {
        propertyRepository.save(property);

    }

    public PropertyRepository getPropertyRepository() {
        return propertyRepository;
    }

    public void setPropertyRepository(PropertyRepository propertyRepository) {
        this.propertyRepository = propertyRepository;
    }
}
