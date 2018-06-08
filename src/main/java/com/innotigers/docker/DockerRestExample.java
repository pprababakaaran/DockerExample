package com.innotigers.docker;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerRestExample {
	
	@RequestMapping(value = "/status", method = RequestMethod.GET)
	public String test() {
		return "Docker Learning";
	}

}
