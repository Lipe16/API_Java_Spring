package ferreira.filipe.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ferreira.filipe.entity.Unidade;
import ferreira.filipe.service.ProdutoService;
import ferreira.filipe.service.UnidadeService;

@RestController
public class UnidadeController {
	
	
	
    @Autowired
    UnidadeService unidadeService;

    @RequestMapping(value = "/unidade", method = RequestMethod.GET)
    public List<Unidade> list() {
        return this.unidadeService.listaProduto();
    }
    
    
    @RequestMapping(value = "/unidade", method = RequestMethod.POST)
    public Unidade salvar(@RequestBody Unidade unidade) {
        return this.unidadeService.salvarUnidade(unidade);
    }
    
    @RequestMapping(value = "/unidade", method = RequestMethod.PUT)
    public Unidade editar(@RequestBody Unidade unidade) {
        return this.unidadeService.salvarUnidade(unidade);
    }
    
    @RequestMapping(value = "/unidade/{id}", method = RequestMethod.DELETE)
    public void deletar(@PathVariable String id) {
        this.unidadeService.deleteUnidade(id);
    }
    
    @RequestMapping(value = "/unidade/{id}", method = RequestMethod.GET)
    public Optional<Unidade> consultar(@PathVariable String id) {
        return this.unidadeService.getById(id);
    }

}
