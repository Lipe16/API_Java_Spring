package ferreira.filipe.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import ferreira.filipe.entity.Categoria;
import ferreira.filipe.entity.Perfil;
import ferreira.filipe.repository.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	CategoriaRepository categoriaRepository;
	
	
    public List<Categoria> listaCategoria() {
        return categoriaRepository.findAll();
    }


    public Categoria salvarCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public void deleteCategoria(String id) {
    	categoriaRepository.deleteById(id);
    }

    public Optional<Categoria> getById(String id) {
        return categoriaRepository.findById(id);
    }

}
