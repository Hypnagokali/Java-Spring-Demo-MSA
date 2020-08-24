package de.xenadu.msa;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
	
	public static String myTitle = "Mental States and Actions";
	public static Logger logger = LogManager.getLogger(IndexController.class); 

	@GetMapping("/")
	public String index(@RequestParam(value = "name", required=false) String name,
			Model model) {
		if (name == null) {
			name = "Manfred";
		}
		logger.info("Route: '/' aufgerufen");
		logger.info("Parameter: name = " + name);
		model.addAttribute("name", name);
		model.addAttribute("myHeader", IndexController.myTitle);
		return "some";
	}
}
