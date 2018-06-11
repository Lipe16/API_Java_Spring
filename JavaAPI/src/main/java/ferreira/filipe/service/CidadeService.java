package ferreira.filipe.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ferreira.filipe.entity.Cidade;
import ferreira.filipe.repository.CidadeRepository;

@Service
public class CidadeService {
	
	@Autowired
	CidadeRepository cidadeRepository;
	
	
    public List<Cidade> listaCidade() {
        return cidadeRepository.findAll();
    }


    public Cidade salvarCidade(Cidade cidade) {
        return cidadeRepository.save(cidade);
    }

    public void deleteCidade(String id) {
    	cidadeRepository.deleteById(id);
    }

    public Optional<Cidade> getById(String id) {
        return cidadeRepository.findById(id);
    }

}
