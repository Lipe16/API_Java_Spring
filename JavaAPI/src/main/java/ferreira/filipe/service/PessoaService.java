package ferreira.filipe.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ferreira.filipe.entity.Estado;
import ferreira.filipe.entity.Pessoa;
import ferreira.filipe.repository.EstadoRepository;
import ferreira.filipe.repository.PessoaRepository;

@Service
public class PessoaService {
	
	
	@Autowired
	PessoaRepository pessoaRepository;
	
	
    public List<Pessoa> listaPessoa() {
        return pessoaRepository.findAll();
    }


    public Pessoa salvarPessoa(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    public void deletePessoa(String id) {
    	pessoaRepository.deleteById(id);
    }

    public Optional<Pessoa> getById(String id) {
        return pessoaRepository.findById(id);
    }

}
