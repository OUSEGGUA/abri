package ma.abri.service;

import ma.abri.model.Property;

import java.util.Collection;

public interface PropertyService {

    void create(Property property);
    void deleteProperty(Integer id);

    Collection<? extends Property> getAllProperty();

    Property getPropertyById(Integer id);


    void updateProperty(Property announce);
}
