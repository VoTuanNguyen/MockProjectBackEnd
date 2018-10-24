package com.fpt.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fpt.project.model.JwtUser;
import com.fpt.project.security.JwtGenerator;
import com.fpt.project.security.JwtValidator;

@RestController
@RequestMapping("/token")
public class Token {

	private JwtGenerator jwtGenerator;
	private JwtValidator jwtValidator;

	public Token(JwtGenerator jwtGenerator) {
		this.jwtGenerator = jwtGenerator;
	}

	@PostMapping("/")
	public String generate(@RequestBody JwtUser jwtUser) {
		return jwtGenerator.generate(jwtUser);
	}
	
	@GetMapping("/get")
	public String validate() {
		String t = "eyJhbGciOiJIUzUxMiJ9.eyJ1c2VySWQiOiIxMjMiLCJyb2xlIjoiYWRtaW4ifQ.p436Gt5QQqiFgWz3f8wPYidUZGeYKE4S_vju8YZPkFOR7nw4glGYMgJyfTKpnZ7p3-90bB3zV0DgS9t7NCRUmg";
//		System.out.println(jwtValidator.validate(t).getUserName());
		return jwtValidator.validate(t).getUserName();
	}
}
