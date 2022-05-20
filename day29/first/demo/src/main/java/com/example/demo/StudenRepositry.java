package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

//import org.springframework.context.annotation.Import;
public interface StudenRepositry extends JpaRepository<Student,Integer>{
    
}
