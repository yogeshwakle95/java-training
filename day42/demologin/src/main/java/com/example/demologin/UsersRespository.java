package com.example.demologin;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UsersRespository extends JpaRepository<users,Integer> {


	List<users> findAll();

}
