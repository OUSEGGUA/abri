package ma.abri.service;

import ma.abri.model.Announce;

import java.util.Collection;
import java.util.function.LongFunction;

public interface AnnounceService {
    void create(Announce announce);
    void deleteAnnounce(Integer id);
    Collection<? extends Announce> getAllAnnounce();
    Collection<? extends Announce> getAnnounceById(Integer id);
    void updateAnnounce(Integer id);
}