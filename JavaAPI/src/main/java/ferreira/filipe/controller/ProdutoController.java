package ferreira.filipe.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ferreira.filipe.entity.Produto;

import ferreira.filipe.service.ProdutoService;

@RestController
public class ProdutoController {
	
	
	
    @Autowired
    ProdutoService produtoService;

    @RequestMapping(value = "/produto", method = RequestMethod.GET)
    public List<Produto> list() {
        return this.produtoService.listaProduto();
    }
    
    
    @RequestMapping(value = "/produto", method = RequestMethod.POST)
    public Produto salvar(@RequestBody Produto produto) {
        return this.produtoService.salvar(produto);
    }
    
    @RequestMapping(value = "/produto", method = RequestMethod.PUT)
    public Produto editar(@RequestBody Produto produto) {
        return this.produtoService.salvar(produto);
    }
    
    @RequestMapping(value = "/produto/{id}", method = RequestMethod.DELETE)
    public void deletar(@PathVariable String id) {
        this.produtoService.deleteProduto(id);
    }
    
    @RequestMapping(value = "/produto/{id}", method = RequestMethod.GET)
    public Optional<Produto> consultar(@PathVariable String id) {
        return this.produtoService.getById(id);
    }

}
