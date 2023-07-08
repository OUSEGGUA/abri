package ma.abri.service;

import ma.abri.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Collection;

public interface UserService {

    void create(User user);
    void deleteUser(Integer id);
    Collection<? extends User> getAllUser();
     User getUserByEmail(String email);


    void updateUser(User user);
}
