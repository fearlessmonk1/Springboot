package com.v1.Pv1.controller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.v1.Pv1.Model.Users;
import com.v1.Pv1.controller.DAO.UserRepo;


@Service
public class UserServiceImpl implements UserService {
	UserRepo userRepo;
	
	@Autowired
	public UserServiceImpl(UserRepo theUserRepo) {
		userRepo = theUserRepo;
	}

	@Override
	public List<Users> getAllUsers() {
			return userRepo.findAll();
	}

	@Override
	public Users findById(int theId) {
		return userRepo.getById(theId);
	}

	@Override
	public void save(Users users) {
		System.out.println("initializing service ");
		userRepo.save(users);
		System.out.println("Updated database " + users);		
	}

	@Override
	public void deleteById(int theId) {
		
	}

}

