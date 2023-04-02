package ma.abri.controllers;

import ma.abri.model.Announce;
import ma.abri.service.AnnounceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


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


    public AnnounceService getAnnounceServiceImpl() {
        return announceServiceImpl;
    }

    public void setAnnounceServiceImpl(AnnounceService announceServiceImpl) {
        this.announceServiceImpl = announceServiceImpl;
    }
}