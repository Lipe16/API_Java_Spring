package ferreira.filipe.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import ferreira.filipe.entity.Pessoa;

public interface PessoaRepository extends MongoRepository<Pessoa, String>{

}
