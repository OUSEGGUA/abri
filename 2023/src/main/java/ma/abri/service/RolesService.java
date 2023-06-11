package ma.abri.service;


import ma.abri.model.Roles;

import java.util.Collection;

public interface RolesService {

    void create(Roles roles);
    void deleteRoles(Integer id);
    Collection<? extends Roles> getAllRoles();
    Roles getRolesById(Integer id);


    void updateRoles(Roles roles);
}