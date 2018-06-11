package ferreira.filipe.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import ferreira.filipe.entity.Produto;

public interface ProdutoRepository extends MongoRepository<Produto, String>{

}
