package ferreira.filipe.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import ferreira.filipe.entity.Categoria;

public interface CategoriaRepository extends MongoRepository<Categoria, String>{

}
