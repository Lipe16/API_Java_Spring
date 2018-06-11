package ferreira.filipe.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ferreira.filipe.entity.Pessoa;
import ferreira.filipe.entity.Produto;
import ferreira.filipe.repository.PessoaRepository;
import ferreira.filipe.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	
	@Autowired
	ProdutoRepository produtoRepository;
	
	
    public List<Produto> listaProduto() {
        return produtoRepository.findAll();
    }


    public Produto salvar(Produto produto) {
        return produtoRepository.save(produto);
    }

    public void deleteProduto(String id) {
    	produtoRepository.deleteById(id);
    }

    public Optional<Produto> getById(String id) {
        return produtoRepository.findById(id);
    }

}
