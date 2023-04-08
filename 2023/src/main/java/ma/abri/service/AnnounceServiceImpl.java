package ma.abri.service;

import ma.abri.dao.AnnounceRepository;
import ma.abri.model.Announce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class AnnounceServiceImpl implements AnnounceService {

    @Autowired
    private AnnounceRepository announceRepository;

    @Override
    public void create(Announce announce) {
        announceRepository.save(announce);
    }


    @Override
    public void deleteAnnounce(Integer id) {
        announceRepository.deleteById(id);
    }

    @Override
    public Collection<? extends Announce> getAllAnnounce() {
        List<Announce> announceList = new ArrayList<>();
        announceRepository.findAll().forEach(announceList::add);
        return announceList;
    }

    @Override
    public Collection<? extends Announce> getAnnounceById(Integer id) {
        List<Announce> announceList = new ArrayList<>();
        announceList.add(announceRepository.findById(id).get());
        return announceList;
    }



    @Override
    public void updateAnnounce(Announce announce) {
        announceRepository.save(announce);
    }


    /*
     **************************************************************************************************
     */
    public AnnounceRepository getAnnounceRepository() {
        return announceRepository;
    }

    public void setAnnounceRepository(AnnounceRepository announceRepository) {
        this.announceRepository = announceRepository;
    }
}