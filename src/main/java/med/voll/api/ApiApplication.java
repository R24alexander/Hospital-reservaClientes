package med.voll.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication {
	//System.setProperty("server.port", "8000");
	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

}
