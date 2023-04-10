package com.anshuman.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

	public boolean authenticate(String user, String passwrod) {

		boolean username = user.equalsIgnoreCase("Anshuman");
		boolean password = user.equalsIgnoreCase("anshuman");
		return username && password;
	}

}
