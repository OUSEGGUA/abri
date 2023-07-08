package ma.abri.service;

import ma.abri.model.Contrat;

import java.util.Collection;

public interface ContratService {

    void create(Contrat contrat);
    void deleteContrat(Integer id);
    Collection<? extends Contrat> getAllContrat();
    Contrat getContratById(Integer id);


    void updateContrat(Contrat contrat);
}
