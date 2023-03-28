package com.example.springboot.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springboot.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
	List<Course> list;
	public CourseServiceImpl() {
		list = new ArrayList<>();
		list.add(new Course(145,"java","course"));
		list.add(new Course(142,"spring","course"));
	}

	@Override
	public List<Course> getCourses() {
		
		return list;
	}

}
