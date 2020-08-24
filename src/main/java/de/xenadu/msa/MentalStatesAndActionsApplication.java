package de.xenadu.msa;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@RestController
public class MentalStatesAndActionsApplication {
	
	private static final Logger logger = LogManager.getLogger(MentalStatesAndActionsApplication.class);

	public static void main(String[] args) {
		logger.info("App startet in main Methode");
		SpringApplication.run(MentalStatesAndActionsApplication.class, args);
		logger.info("Spring App gestartet");
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
