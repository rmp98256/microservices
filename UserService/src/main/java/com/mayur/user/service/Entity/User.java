package com.mayur.user.service.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="User")
public class User {
	
	@Id
	private String userid;
	
	private String name;
	
	private String email;
	
	private String about;
	//Other user properies you want to add 
	
	@Transient//will not store in data base 
	private List<Rating> ratings= new ArrayList<>();
	
	

}
