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

import ferreira.filipe.entity.Categoria;
import ferreira.filipe.entity.Perfil;
import ferreira.filipe.service.CategoriaService;
import ferreira.filipe.service.PerfilService;

@RestController
public class CategoriaController {
	
    @Autowired
    CategoriaService categoriaService;

    @RequestMapping(value = "/categoria", method = RequestMethod.GET)
    public List<Categoria> list() {
        return this.categoriaService.listaCategoria();
    }
    
    
    @RequestMapping(value = "/categoria", method = RequestMethod.POST)
    public Categoria categoriaSave(@RequestBody Categoria categoria) {
        return this.categoriaService.salvarCategoria(categoria);
    }
    
    @RequestMapping(value = "/categoria", method = RequestMethod.PUT)
    public Categoria editarCategoria(@RequestBody Categoria categoria) {
        return this.categoriaService.salvarCategoria(categoria);
    }
    
    @RequestMapping(value = "/categoria/{id}", method = RequestMethod.DELETE)
    public void deletarCategoria(@PathVariable String id) {
        this.categoriaService.deleteCategoria(id);
    }
    
    @RequestMapping(value = "/categoria/{id}", method = RequestMethod.GET)
    public Optional<Categoria> consultarCategoria(@PathVariable String id) {
        return this.categoriaService.getById(id);
    }
    

}
