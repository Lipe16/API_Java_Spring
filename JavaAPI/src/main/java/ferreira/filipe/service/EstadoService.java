package ferreira.filipe.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ferreira.filipe.entity.EmpresaPrincipal;
import ferreira.filipe.entity.Estado;
import ferreira.filipe.repository.EmpresaPrincipalRepository;
import ferreira.filipe.repository.EstadoRepository;

@Service
public class EstadoService {
	
	@Autowired
	EstadoRepository estadoRepository;
	
	
    public List<Estado> listaEstado() {
        return estadoRepository.findAll();
    }


    public Estado salvarEstado(Estado estado) {
        return estadoRepository.save(estado);
    }

    public void deleteEstado(String id) {
    	estadoRepository.deleteById(id);
    }

    public Optional<Estado> getById(String id) {
        return estadoRepository.findById(id);
    }

}
