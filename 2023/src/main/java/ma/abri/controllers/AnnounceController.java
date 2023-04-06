package ma.abri.controllers;

import ma.abri.model.Announce;
import ma.abri.service.AnnounceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/announce")
public class AnnounceController {
    @Autowired
    private AnnounceService announceServiceImpl;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public void createNewAnnounce(Announce announce) {
        announceServiceImpl.create(announce);
    }

    @RequestMapping(value = "/getAllAnnounce", method = RequestMethod.GET)
    @ResponseBody
    public List<Announce> getAllAnnounce() {
        List<Announce> announceList = new ArrayList<>();
        announceList.addAll(announceServiceImpl.getAllAnnounce());
        return announceList;
    }
    @RequestMapping(value = "/getAnnounceById/{id}", method = RequestMethod.GET)
    @ResponseBody
    public List<Announce> getAnnounceById(@PathVariable(name = "id") Integer id) {
        List<Announce> announceListId = new ArrayList<>();
        announceListId.addAll(announceServiceImpl.getAnnounceById(id));
        return announceListId;
    }
    @RequestMapping(value = "delete/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public String delete(@PathVariable(name = "id") Integer id) {
        announceServiceImpl.deleteAnnounce(id);
        return "redirect:/announce";
    }



    @RequestMapping(value = "update/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public String update(@PathVariable(name = "id") Integer id) {
        announceServiceImpl.updateAnnounce(id);

        return "redirect:getAnnounceById/{id}";

    }




    /*
     **************************************************************************************************
     */
    public AnnounceService getAnnounceServiceImpl() {
        return announceServiceImpl;
    }

    public void setAnnounceServiceImpl(AnnounceService announceServiceImpl) {
        this.announceServiceImpl = announceServiceImpl;
    }
}