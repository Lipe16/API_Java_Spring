package ferreira.filipe.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ferreira.filipe.entity.Unidade;
import ferreira.filipe.repository.ProdutoRepository;
import ferreira.filipe.repository.UnidadeRepository;

@Service
public class UnidadeService {
	
	
	@Autowired
	UnidadeRepository unidadeRepository;
	
	
    public List<Unidade> listaProduto() {
        return unidadeRepository.findAll();
    }


    public Unidade salvarUnidade(Unidade unidade) {
        return unidadeRepository.save(unidade);
    }

    public void deleteUnidade(String id) {
    	unidadeRepository.deleteById(id);
    }

    public Optional<Unidade> getById(String id) {
        return unidadeRepository.findById(id);
    }

}
