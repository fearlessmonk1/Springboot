package com.v1.Pv1.controller.service;

import java.util.List;

import com.v1.Pv1.Model.Users;

public interface UserService {
	public List<Users> getAllUsers(); 
	public Users findById(int theId);
	public void save(Users users);
	public void deleteById(int theId);
}

