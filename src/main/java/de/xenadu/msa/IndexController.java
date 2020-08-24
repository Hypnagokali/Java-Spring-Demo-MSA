package de.xenadu.msa;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
	
	public static String myTitle = "Mental States and Actions";

	@GetMapping("/")
	public String index(@RequestParam(value = "name", defaultValue = "Manfred") String name,
			Model model) {
		model.addAttribute("name", name);
		model.addAttribute("myHeader", IndexController.myTitle);
		return "some";
	}
}
