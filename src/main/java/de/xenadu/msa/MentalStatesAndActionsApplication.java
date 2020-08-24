package de.xenadu.msa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@RestController
public class MentalStatesAndActionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MentalStatesAndActionsApplication.class, args);
	}
	
	@GetMapping("/muh")
	public String test(@RequestParam(value = "var1", defaultValue = "Ein String") String var1,
						@RequestParam(value = "var2", defaultValue = "Zweiter String") String var2) {
		return "<h1>Muh, sagt die Kuh!</h1>"
				+ "<hr>"
				+ "var1 = " + var1
				+ "<br>"
				+ "var2 = " + var2;
	}

}
