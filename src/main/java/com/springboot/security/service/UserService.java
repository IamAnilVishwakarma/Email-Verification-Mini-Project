package com.springboot.security.service;

import com.springboot.security.entity.User;

public interface UserService {

	public User saveUser(User user, String url);
	public void removeSessionMessage();
	public void sendEmail(User user,String path);
	public boolean verifyAccount(String verificationCode);
	

	
}
