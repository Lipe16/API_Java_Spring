package ferreira.filipe.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ferreira.filipe.entity.Cidade;
import ferreira.filipe.entity.EmpresaPrincipal;
import ferreira.filipe.service.CidadeService;
import ferreira.filipe.service.EmpresaPrincipalService;

@RestController
public class EmpresaPrincipalController {
	
	
    @Autowired
    EmpresaPrincipalService empresaPrincipalService;

    @RequestMapping(value = "/empresa", method = RequestMethod.GET)
    public List<EmpresaPrincipal> list() {
        return this.empresaPrincipalService.listaEmpresaPrincipal();
    }
    
    
    @RequestMapping(value = "/empresa", method = RequestMethod.POST)
    public EmpresaPrincipal salvar(@RequestBody EmpresaPrincipal empresa) {
        return this.empresaPrincipalService.salvar(empresa);
    }
    
    @RequestMapping(value = "/empresa", method = RequestMethod.PUT)
    public EmpresaPrincipal editar(@RequestBody EmpresaPrincipal empresa) {
        return this.empresaPrincipalService.salvar(empresa);
    }
    
    @RequestMapping(value = "/empresa/{id}", method = RequestMethod.DELETE)
    public void deletar(@PathVariable String id) {
        this.empresaPrincipalService.deleteEmpresaPrincipal(id);
    }
    
    @RequestMapping(value = "/empresa/{id}", method = RequestMethod.GET)
    public Optional<EmpresaPrincipal> consultar(@PathVariable String id) {
        return this.empresaPrincipalService.getById(id);
    }

}
