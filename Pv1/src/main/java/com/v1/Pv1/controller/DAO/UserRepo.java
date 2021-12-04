package com.v1.Pv1.controller.DAO;


import org.springframework.data.jpa.repository.JpaRepository;

import com.v1.Pv1.Model.Users;

public interface UserRepo extends JpaRepository<Users, Integer>{

}
