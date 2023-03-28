package com.example.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot.entities.Course;

public interface CourseDao extends JpaRepository<Course, Long>{

}
