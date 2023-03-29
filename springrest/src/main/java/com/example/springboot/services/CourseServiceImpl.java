package com.example.springboot.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.dao.CourseDao;
import com.example.springboot.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDao courseDao;

//	List<Course> list;
	public CourseServiceImpl() {
//		list = new ArrayList<>();
//		list.add(new Course(145,"java","course"));
//		list.add(new Course(142,"spring","course"));
	}

	@Override
	public List<Course> getCourses() {
		return courseDao.findAll();
	}

	@Override
	public Optional<Course> getCourse(long courseId) {
//		Course c = null;
//		for(Course course: list) {
//			if(course.getId()==courseId) {
//				c = course;
//				break;
//			}
//		}
		return courseDao.findById(courseId);
	}

	@Override
	public Course addCourse(Course course) {
//		list.add(course);
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
//		for(Course c: list) {
//			if(c.getId()==course.getId()) {
//				c.setTitle(course.getTitle());
//				c.setDescription(course.getDescription());
//			}
//		}
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long courseId) {
//		list = this.list.stream().filter(e->e.getId()!=courseId).collect(Collectors.toList());
//		Optional<Course> entity = courseDao.findById(courseId);
		courseDao.deleteById(courseId);
	}

}
