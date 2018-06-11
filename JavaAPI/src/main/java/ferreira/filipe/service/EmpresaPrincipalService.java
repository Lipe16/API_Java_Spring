package ferreira.filipe.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ferreira.filipe.entity.Cidade;
import ferreira.filipe.entity.EmpresaPrincipal;
import ferreira.filipe.repository.CidadeRepository;
import ferreira.filipe.repository.EmpresaPrincipalRepository;

@Service
public class EmpresaPrincipalService {
	
	@Autowired
	EmpresaPrincipalRepository empresaPrincipalRepository;
	
	
    public List<EmpresaPrincipal> listaEmpresaPrincipal() {
        return empresaPrincipalRepository.findAll();
    }


    public EmpresaPrincipal salvar(EmpresaPrincipal empresaPrincipal) {
        return empresaPrincipalRepository.save(empresaPrincipal);
    }

    public void deleteEmpresaPrincipal(String id) {
    	empresaPrincipalRepository.deleteById(id);
    }

    public Optional<EmpresaPrincipal> getById(String id) {
        return empresaPrincipalRepository.findById(id);
    }

}
