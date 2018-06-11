package ferreira.filipe.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;


/*
 * POR ENQUANTO DEFINI ESSES VALORES REFERENTES AO BANCO MANGO DB DIRETAMENTE NO AQUIVO AQUI
 * PORQUE ESTAVA TENDO DIFICULDADE EM LER O APPLICATION.PROPERTIES DEPOIS DE VÁRIOS COMMITS, E ISSO
 * PODE SER ALGUM PROBLEMA NA MINHA MÁQUINA MAIS SINTA-SE AVONTADE EM ALTERAR
 * 
 */

@EnableMongoRepositories(basePackages = "ferreira.filipe.repository")
@Configuration
public class MongoCliente extends AbstractMongoConfiguration {

		
			private String URI = "mongodb://administrador:laranjada1994@localhost:27017/admin";
			private String DB = "banco";
	
			@Override
			public MongoClient mongoClient() {	 
				// TODO Auto-generated method stub
				return new MongoClient(new MongoClientURI(URI));
			}
			
			
			@Bean
			public MongoDbFactory mongoDbFactory() {
				return new SimpleMongoDbFactory(mongoClient(), getDatabaseName());
			}
			
			@Bean
			public MongoTemplate mongoTemplate() throws Exception {
		 
				MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory(), mappingMongoConverter());
		 
				return mongoTemplate;
		 
			}
			

			

			@Override
			protected String getDatabaseName() {
				// TODO Auto-generated method stub
				return DB;
			}
	}
