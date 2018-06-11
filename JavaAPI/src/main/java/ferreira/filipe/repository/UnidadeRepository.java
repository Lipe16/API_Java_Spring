package ferreira.filipe.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import ferreira.filipe.entity.Unidade;

public interface UnidadeRepository extends MongoRepository<Unidade, String>{

}
