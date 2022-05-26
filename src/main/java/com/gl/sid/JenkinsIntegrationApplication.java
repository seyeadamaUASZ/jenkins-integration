package com.gl.sid;

import com.gl.sid.entities.Student;
import com.gl.sid.repositories.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JenkinsIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsIntegrationApplication.class, args);
	}

	@Bean
	CommandLineRunner start (StudentRepository rep){
		return args -> {
		  rep.save(new Student(null,"Adama seye","aseye@gmail.com","M","778094925"));
		  rep.save(new Student(null,"Baba Gueye","agueye@gmail.com","M","778094125"));
		  rep.save(new Student(null,"Ouleye Ndiaye","ouleye@gmail.com","F","776382838"));
		};
	}

}
