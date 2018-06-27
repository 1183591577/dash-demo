package futurera.jar.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/menu")

public class mainpage {
	@RequestMapping("/first_page")
	public static String main(String[] args) {
		return ("this is first page");
}
}