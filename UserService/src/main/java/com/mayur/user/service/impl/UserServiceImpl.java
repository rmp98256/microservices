package com.mayur.user.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mayur.user.service.Entity.Hotel;
import com.mayur.user.service.Entity.Rating;
import com.mayur.user.service.Entity.User;
import com.mayur.user.service.Exception.ResouceNotFoundException;
import com.mayur.user.service.repositories.UserRepository;
import com.mayur.user.service.service.UserService;



@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repository;

	@Autowired
	public RestTemplate restTemplate;

	@Override
	public User saveUser(User user) {
		String randomUserId = UUID.randomUUID().toString();
		user.setUserid(randomUserId);
		return repository.save(user);
	}

	@Override
	public User updateUser(User user) {

		return null;
	}

	@Override
	public List<User> getUser() {

		return this.repository.findAll();
	}

	@Override
	public User getuserbyid(String id) {

		// get user from db
		User user = repository.findById(id)
				.orElseThrow(() -> new ResouceNotFoundException(" Resource not found in database  for id " + id));
		System.out.println(user.toString());
		// fatch rating using user id
		List<Rating> ratingOfUser = restTemplate.getForObject("http://RATING-SERVICE/rating/userid/" + user.getUserid(),
				ArrayList.class);

		user.setRatings(ratingOfUser);
		return user;
	}

	@Override
	public void deletebyid(String id) {

	}

}
