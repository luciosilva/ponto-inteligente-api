package com.lambadadigital.pontointeligente.api.security.dtos;

public class TokenDto {

	private String token; 
	
	public TokenDto() {
	}
	
	public TokenDto(String token) {
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
