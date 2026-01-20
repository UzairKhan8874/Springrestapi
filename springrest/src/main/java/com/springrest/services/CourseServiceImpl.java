package com.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.springrest.entity.Course;

@Service
public class CourseServiceImpl implements CourseService {

    private List<Course> list;

    public CourseServiceImpl() {
        list = new ArrayList<>();
        list.add(new Course(145, "Java Core Course", "This course contains basics of Java"));
        list.add(new Course(146, "Spring Boot Course", "Creating REST API using Spring Boot"));
    }

    @Override
    public List<Course> getCourses() {
        return list;
    }

    @Override
    public Course getCourse(long courseId) {
    	Course c= null;
        for (Course course : list) {
            if (course.getId() == courseId) {
                return course;
            }
        }
        return c;
    }

	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}
}
