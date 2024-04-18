package com.kirian.wail.azure.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The Class AliveController.
 *
 * @author Kirian Wail
 */
@RestController
public class AliveController {

	/**
	 * Checks if application is alive.
	 *
	 * @return the string
	 */
	@GetMapping(value = "/alive")
	public String isAlive() {

		return HttpStatus.OK.toString() + " Spring Boot + Docker + Azure example";
	}
}
