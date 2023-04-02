package ma.abri.service;

import ma.abri.dao.AnnounceRepository;
import ma.abri.model.Announce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnnounceServiceImpl implements AnnounceService {

    @Autowired
    private AnnounceRepository announceRepository;

    @Override
    public void create(Announce announce) {
        announceRepository.save(announce);
    }

    public AnnounceRepository getAnnounceRepository() {
        return announceRepository;
    }

    public void setAnnounceRepository(AnnounceRepository announceRepository) {
        this.announceRepository = announceRepository;
    }
}
