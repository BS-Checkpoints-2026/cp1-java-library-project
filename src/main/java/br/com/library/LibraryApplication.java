package br.com.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LibraryApplication {

    record HealthStatus(String status, String message){}

	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class, args);
	}

    @GetMapping("/")
    public HealthStatus healthCheack() {
        return new HealthStatus("Ok", "Api is run");
    }
}
