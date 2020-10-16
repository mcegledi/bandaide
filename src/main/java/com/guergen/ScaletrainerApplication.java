package com.guergen;

import com.guergen.bandaide.Instrument;
import com.guergen.bandaide.song.SongRepository;
import com.guergen.bandaide.user.Person;
import com.guergen.bandaide.user.PersonRepository;
import com.guergen.bandaide.song.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@Configuration
@EnableMongoRepositories
@ImportResource("bandaide-spring.xml")
public class ScaletrainerApplication implements CommandLineRunner {

	@Autowired
	private SongRepository songRepository;

	@Autowired
	private PersonRepository personRepository;

	public static void main(String[] args) {
		SpringApplication.run(ScaletrainerApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {


//		try {
//			songRepository.save(new Song("id", "Fortunate Son", "Credence Clearwater Revival", "1976", "nothing"));
//		} catch (DuplicateKeyException dke) {
//			System.out.println("foo! Exception caught!");
//		}


		try {
			personRepository.save(new Person("Mirko", Instrument.BASS));
		} catch( DuplicateKeyException dke) {
			System.out.println("foo! Exception caught while creating a new person!");
		}

		// fetch all songs
		System.out.println("Songs found with findAll():");
		System.out.println("-------------------------------");
		for (Song song : songRepository.findAll()) {
			System.out.println(song);
		}
		System.out.println();

		Song result = songRepository.findBySongname("Learn to fly");

		System.out.println(result);

		Song result2 = songRepository.findBySongname("Learn*");

		System.out.println("----------------------------");
		System.out.println(result2);
	}

}
