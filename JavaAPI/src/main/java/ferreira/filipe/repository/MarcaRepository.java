package ferreira.filipe.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import ferreira.filipe.entity.Marca;

public interface MarcaRepository extends MongoRepository<Marca, String>{

}
