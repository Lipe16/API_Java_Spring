package ferreira.filipe.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ferreira.filipe.entity.Marca;
import ferreira.filipe.entity.Marca;
import ferreira.filipe.service.EstadoService;
import ferreira.filipe.service.MarcaService;

@RestController
public class MarcaController {
	
    @Autowired
    MarcaService marcaService;

    @RequestMapping(value = "/marca", method = RequestMethod.GET)
    public List<Marca> list() {
        return this.marcaService.listaMarca();
    }
    
    
    @RequestMapping(value = "/marca", method = RequestMethod.POST)
    public Marca salvar(@RequestBody Marca marca) {
        return this.marcaService.salvarMarca(marca);
    }
    
    @RequestMapping(value = "/marca", method = RequestMethod.PUT)
    public Marca editar(@RequestBody Marca marca) {
        return this.marcaService.salvarMarca(marca);
    }
    
    @RequestMapping(value = "/marca/{id}", method = RequestMethod.DELETE)
    public void deletar(@PathVariable String id) {
        this.marcaService.deleteMarca(id);
    }
    
    @RequestMapping(value = "/marca/{id}", method = RequestMethod.GET)
    public Optional<Marca> consultar(@PathVariable String id) {
        return this.marcaService.getById(id);
    }

}
