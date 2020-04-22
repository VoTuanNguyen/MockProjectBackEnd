package com.fpt.project.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.fpt.project.model.JwtUser;

@Component
public class JwtGenerator {
	
	@Value("${jwt.secret}")
	private String secret_key;

	public String generate(JwtUser jwtUser) {
		
		Claims claims = Jwts.claims().setSubject(jwtUser.getUserName());
		claims.put("userId", String.valueOf(jwtUser.getId()));
		claims.put("role", jwtUser.getRole());

		return Jwts.builder().setClaims(claims).signWith(SignatureAlgorithm.HS512, "").compact();
	}
}
