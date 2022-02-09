package jenkins.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class HesapController {

	@GetMapping(value = "/gets")
	public String hello() {
		System.err.println("Merhaba Savas Dede!!");
		return "Hello Savas";
	}

}
