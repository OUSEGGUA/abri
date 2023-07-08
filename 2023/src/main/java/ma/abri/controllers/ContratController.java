package ma.abri.controllers;


import ma.abri.model.Contrat;
import ma.abri.service.ContratService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/contrat")
@CrossOrigin(origins = "*")
public class ContratController {

    @Autowired
    private ContratService contratServiceImpl;




    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public void createNewContrat(@RequestBody Contrat contrat) {
        contratServiceImpl.create(contrat);
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    @ResponseBody
    public List<Contrat> getAll() {
        List<Contrat> contratListList = new ArrayList<>();
        contratListList.addAll(contratServiceImpl.getAllContrat());
        return contratListList;
    }
    @RequestMapping(value = "/findById/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Contrat getContratById(@PathVariable(name = "id") Integer id) {
        return contratServiceImpl.getContratById(id);
    }
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void delete(@PathVariable(name = "id") Integer id) {
        contratServiceImpl.deleteContrat(id);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public void update(Contrat contrat) {
        contratServiceImpl.updateContrat(contrat);
    }

    public ContratService getContratServiceImpl() {
        return contratServiceImpl;
    }

    public void setContratServiceImpl(ContratService contratServiceImpl) {
        this.contratServiceImpl = contratServiceImpl;
    }
}
