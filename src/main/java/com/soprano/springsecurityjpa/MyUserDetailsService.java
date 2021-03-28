package com.soprano.springsecurityjpa;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService
{
//	@Autowired
//	UserRepository userRepository;
	
	public UserDetails loadUserByUserName(String s) throws UsernameNotFoundException
	{
		return new MyUserDetails(s);
	}
	
}
