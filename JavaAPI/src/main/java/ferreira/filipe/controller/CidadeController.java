package ferreira.filipe.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ferreira.filipe.entity.Cidade;
import ferreira.filipe.entity.Perfil;
import ferreira.filipe.service.CidadeService;
import ferreira.filipe.service.PerfilService;

@RestController
public class CidadeController {
	
    @Autowired
    CidadeService cidadeService;

    @RequestMapping(value = "/cidade", method = RequestMethod.GET)
    public List<Cidade> list() {
        return this.cidadeService.listaCidade();
    }
    
    
    @RequestMapping(value = "/cidade", method = RequestMethod.POST)
    public Cidade salvarCidade(@RequestBody Cidade cidade) {
        return this.cidadeService.salvarCidade(cidade);
    }
    
    @RequestMapping(value = "/cidade", method = RequestMethod.PUT)
    public Cidade editarCidade(@RequestBody Cidade cidade) {
        return this.cidadeService.salvarCidade(cidade);
    }
    
    @RequestMapping(value = "/cidade/{id}", method = RequestMethod.DELETE)
    public void deletarCidade(@PathVariable String id) {
        this.cidadeService.deleteCidade(id);
    }
    
    @RequestMapping(value = "/cidade/{id}", method = RequestMethod.GET)
    public Optional<Cidade> consultar(@PathVariable String id) {
        return this.cidadeService.getById(id);
    }
    

}
