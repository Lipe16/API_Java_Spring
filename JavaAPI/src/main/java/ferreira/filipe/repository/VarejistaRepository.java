package ferreira.filipe.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import ferreira.filipe.entity.Varejista;

public interface VarejistaRepository extends MongoRepository<Varejista, String>{

}
