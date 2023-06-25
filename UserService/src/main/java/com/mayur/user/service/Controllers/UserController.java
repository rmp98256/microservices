package com.mayur.user.service.Controllers;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mayur.user.service.Entity.User;
import com.mayur.user.service.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	//object of user service 
	
	
	@Autowired
	private UserService userService;
	//create
	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody User user) {
		
	
		
		//return  ResponseEntity.status(HttpStatus.CREATED).body(user);
		System.out.println("User created ");
		return  ResponseEntity.status(HttpStatus.CREATED).body(userService.saveUser(user));
		
	}
	
	
	
	//all users 
	@GetMapping()
    public ResponseEntity<List<User>> getUser() {
		
		return  ResponseEntity.ok(userService.getUser());
		
	}
	
	
	//single user get 
	@GetMapping("/{userid}")
	public ResponseEntity<User> getSingleUser(@PathVariable String userid )
	{
		
		return ResponseEntity.ok(userService.getuserbyid(userid));
	}
	
	
	

}
