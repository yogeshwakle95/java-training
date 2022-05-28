package com.example.jpaweb;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

//import com.example.demo36.user;

//import com.example.demo36.Student;

public interface userRepository extends JpaRepository<Users,Integer> {

	void save(User users);

}
