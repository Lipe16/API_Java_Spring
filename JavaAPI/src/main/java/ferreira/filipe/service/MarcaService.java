package ferreira.filipe.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ferreira.filipe.entity.Estado;
import ferreira.filipe.entity.Marca;
import ferreira.filipe.repository.EstadoRepository;
import ferreira.filipe.repository.MarcaRepository;

@Service
public class MarcaService {
	
	@Autowired
	MarcaRepository marcaRepository;
	
	
    public List<Marca> listaMarca() {
        return marcaRepository.findAll();
    }


    public Marca salvarMarca(Marca marca) {
        return marcaRepository.save(marca);
    }

    public void deleteMarca(String id) {
    	marcaRepository.deleteById(id);
    }

    public Optional<Marca> getById(String id) {
        return marcaRepository.findById(id);
    }

}
