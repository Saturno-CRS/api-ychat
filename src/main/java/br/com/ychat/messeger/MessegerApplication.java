package br.com.ychat.messeger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@SpringBootApplication
@EnableCassandraRepositories
public class MessegerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessegerApplication.class, args);
	}

}
