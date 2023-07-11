package ma.abri.controllers;

import ma.abri.model.Announce;
import ma.abri.service.AnnounceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/announce")
@CrossOrigin(origins = "*")
public class AnnounceController {
    @Autowired
    private AnnounceService announceServiceImpl;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public void createNewAnnounce(@RequestBody Announce announce) {
        announceServiceImpl.create(announce);
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    @ResponseBody
    public List<Announce> getAll() {
        List<Announce> announceList = new ArrayList<>();
        announceList.addAll(announceServiceImpl.getAllAnnounce());
        return announceList;
    }
    @RequestMapping(value = "/findById/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Announce getAnnounceById(@PathVariable(name = "id") Integer id) {
        return announceServiceImpl.getAnnounceById(id);
    }
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void delete(@PathVariable(name = "id") Integer id) {
        announceServiceImpl.deleteAnnounce(id);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public void update(Announce announce) {
        announceServiceImpl.updateAnnounce(announce);
    }



    public AnnounceService getAnnounceServiceImpl() {
        return announceServiceImpl;
    }

    public void setAnnounceServiceImpl(AnnounceService announceServiceImpl) {
        this.announceServiceImpl = announceServiceImpl;
    }
}