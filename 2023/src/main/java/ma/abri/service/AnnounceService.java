package ma.abri.service;

import ma.abri.model.Announce;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.function.LongFunction;

public interface AnnounceService {
    void create(Announce announce);
    void deleteAnnounce(Integer id);
    Collection<? extends Announce> getAllAnnounce();
    Announce getAnnounceById(Integer id);


    void updateAnnounce(Announce announce);
}