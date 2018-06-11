package ferreira.filipe.controller;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ferreira.filipe.entity.Varejista;
import ferreira.filipe.entity.Varejista;
import ferreira.filipe.service.UsuarioService;
import ferreira.filipe.service.VarejistaService;

@RestController
public class VarejistaController {
	
    @Autowired
    VarejistaService varejistaService;
   

    @RequestMapping(value = "/varejista", method = RequestMethod.GET)
    public List<Varejista> list() {
        return this.varejistaService.listaVarejista();
    }
    
    
    @RequestMapping(value = "/varejista", method = RequestMethod.POST)
    public Varejista salvar(@RequestBody Varejista varejista) {
        return this.varejistaService.salvarVarejista(varejista);
    }
    
    @RequestMapping(value = "/varejista", method = RequestMethod.PUT)
    public Varejista editar(@RequestBody Varejista varejista) {
        return this.varejistaService.salvarVarejista(varejista);
    }
    
    @RequestMapping(value = "/vajerista/{id}", method = RequestMethod.DELETE)
    public void deletarUsuario(@PathVariable String id) {
        this.varejistaService.deleteVarejista(id);
    }
    
    @RequestMapping(value = "/varejista/{id}", method = RequestMethod.GET)
    public Optional<Varejista> consultarVarejista(@PathVariable String id) {
        return this.varejistaService.getById(id);
    }

    
	

}
