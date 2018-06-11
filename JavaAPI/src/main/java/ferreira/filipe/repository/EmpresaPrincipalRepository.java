package ferreira.filipe.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import ferreira.filipe.entity.EmpresaPrincipal;


public interface EmpresaPrincipalRepository extends MongoRepository<EmpresaPrincipal, String>{

}
