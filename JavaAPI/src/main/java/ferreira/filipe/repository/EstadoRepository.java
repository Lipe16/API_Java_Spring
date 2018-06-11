package ferreira.filipe.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import ferreira.filipe.entity.Estado;

public interface EstadoRepository extends MongoRepository<Estado, String>{

}
