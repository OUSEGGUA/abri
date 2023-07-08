package ma.abri.service.Iservice;

import ma.abri.dao.ContratRepository;
import ma.abri.model.Announce;
import ma.abri.model.Contrat;
import ma.abri.service.ContratService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class ContratServiceImpl implements ContratService {

    @Autowired
    private ContratRepository contratRepository;
    @Override
    public void create(Contrat contrat) {contratRepository.save(contrat);
    }

    @Override
    public void deleteContrat(Integer id) {contratRepository.deleteById(id);

    }

    @Override
    public Collection<? extends Contrat> getAllContrat() {
        List<Contrat> contratList = new ArrayList<>();
        contratRepository.findAll().forEach(contratList::add);
        return contratList;
    }

    @Override
    public Contrat getContratById(Integer id) {
        return contratRepository.findById(id).get();
    }

    @Override
    public void updateContrat(Contrat contrat) { contratRepository.save(contrat);
    }

    public ContratRepository getContratRepository() {
        return contratRepository;
    }

    public void setContratRepository(ContratRepository contratRepository) {
        this.contratRepository = contratRepository;
    }
}
