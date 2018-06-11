package ferreira.filipe.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ferreira.filipe.entity.Unidade;
import ferreira.filipe.entity.Varejista;
import ferreira.filipe.repository.UnidadeRepository;
import ferreira.filipe.repository.VarejistaRepository;

@Service
public class VarejistaService {
	
	@Autowired
	VarejistaRepository varejistaRepository;
	
	
    public List<Varejista> listaVarejista() {
        return varejistaRepository.findAll();
    }


    public Varejista salvarVarejista(Varejista varejista) {
        return varejistaRepository.save(varejista);
    }

    public void deleteVarejista(String id) {
    	varejistaRepository.deleteById(id);
    }

    public Optional<Varejista> getById(String id) {
        return varejistaRepository.findById(id);
    }


}
