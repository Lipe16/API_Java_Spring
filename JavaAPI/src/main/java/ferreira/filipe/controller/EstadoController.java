package ferreira.filipe.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ferreira.filipe.entity.EmpresaPrincipal;
import ferreira.filipe.entity.Estado;
import ferreira.filipe.service.EmpresaPrincipalService;
import ferreira.filipe.service.EstadoService;

@RestController
public class EstadoController {
	
    @Autowired
    EstadoService estadoService;

    @RequestMapping(value = "/estado", method = RequestMethod.GET)
    public List<Estado> list() {
        return this.estadoService.listaEstado();
    }
    
    
    @RequestMapping(value = "/estado", method = RequestMethod.POST)
    public Estado salvar(@RequestBody Estado estado) {
        return this.estadoService.salvarEstado(estado);
    }
    
    @RequestMapping(value = "/estado", method = RequestMethod.PUT)
    public Estado editar(@RequestBody Estado estado) {
        return this.estadoService.salvarEstado(estado);
    }
    
    @RequestMapping(value = "/estado/{id}", method = RequestMethod.DELETE)
    public void deletar(@PathVariable String id) {
        this.estadoService.deleteEstado(id);
    }
    
    @RequestMapping(value = "/estado/{id}", method = RequestMethod.GET)
    public Optional<Estado> consultar(@PathVariable String id) {
        return this.estadoService.getById(id);
    }

}
