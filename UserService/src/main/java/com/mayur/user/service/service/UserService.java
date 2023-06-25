package com.mayur.user.service.service;

import java.util.List;

import com.mayur.user.service.Entity.User;

public interface UserService {
	
	//User operation
			
   //create	
	User saveUser(User user);
	
	//update user 
	User updateUser(User user);
	
	//get all user 
	
	List<User> getUser();
	
	//get single user 
	
	User getuserbyid(String id );
	
	//delete by id 
	
	void deletebyid(String id);
}
