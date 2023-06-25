package com.mayur.user.service.repositories;

import javax.websocket.server.ServerEndpoint;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.mayur.user.service.Entity.User;


public interface UserRepository extends JpaRepository<User, String> {
	
	//you can implement your sql query also here 
	
	//

}
