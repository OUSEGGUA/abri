package ma.abri.controllers;

import ma.abri.model.Client;
import ma.abri.model.Owner;
import ma.abri.model.User;
import ma.abri.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserService userServiceImpl;

    @RequestMapping(value = "/add-client", method = RequestMethod.POST)
    @ResponseBody
    public void createNewClient(@RequestBody Client client) {
        userServiceImpl.create(client);
    }

    @RequestMapping(value = "/add-owner", method = RequestMethod.POST)
    @ResponseBody
    public void createNewOwner(@RequestBody Owner owner) {
        userServiceImpl.create(owner);
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    @ResponseBody
    public List<User> getAll() {
        List<User> userList = new ArrayList<>();
        userList.addAll(userServiceImpl.getAllUser());
        return userList;
    }
    @RequestMapping(value = "/find/{email}", method = RequestMethod.GET)
    @ResponseBody
    public User getUserByEmail(@PathVariable(name = "email") String email) {
        return userServiceImpl.getUserByEmail(email);
    }
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void delete(@PathVariable(name = "id") Integer id) {
        userServiceImpl.deleteUser(id);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public void update(User user) {
        userServiceImpl.updateUser(user);
    }

    public void setUserServiceImpl(UserService userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }
}
