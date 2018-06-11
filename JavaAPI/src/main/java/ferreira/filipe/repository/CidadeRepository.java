package ferreira.filipe.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import ferreira.filipe.entity.Categoria;
import ferreira.filipe.entity.Cidade;

public interface CidadeRepository  extends MongoRepository<Cidade, String>{

}
