package ferreira.filipe.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ferreira.filipe.entity.Pessoa;
import ferreira.filipe.service.PessoaService;

@RestController
public class PessoaController {
	
	
    @Autowired
    PessoaService pessoaService;

    @RequestMapping(value = "/pessoa", method = RequestMethod.GET)
    public List<Pessoa> list() {
        return this.pessoaService.listaPessoa();
    }
    
    
    @RequestMapping(value = "/pessoa", method = RequestMethod.POST)
    public Pessoa salvar(@RequestBody Pessoa pessoa) {
        return this.pessoaService.salvarPessoa(pessoa);
    }
    
    @RequestMapping(value = "/pessoa", method = RequestMethod.PUT)
    public Pessoa editar(@RequestBody Pessoa pessoa) {
        return this.pessoaService.salvarPessoa(pessoa);
    }
    
    @RequestMapping(value = "/pessoa/{id}", method = RequestMethod.DELETE)
    public void deletar(@PathVariable String id) {
        this.pessoaService.deletePessoa(id);
    }
    
    @RequestMapping(value = "/pessoa/{id}", method = RequestMethod.GET)
    public Optional<Pessoa> consultar(@PathVariable String id) {
        return this.pessoaService.getById(id);
    }

}
