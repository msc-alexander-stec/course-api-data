package io.javabrains.springbootstarter.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;
	
	public List<Course> getAllCourses(String topicId) {
		ArrayList<Course> courses = new ArrayList<Course>();
		courseRepository.findByTopicId(topicId).forEach(courses::add); // SELECT * from courses WHERE Topic.id = topicId
		return courses;
	}
	
	public Course getCourse(String id) {
		return courseRepository.findOne(id); // SELECT * from courses WHERE courses.id = id
	}

	public void addCourse(Course course) {
		courseRepository.save(course); // INSERT INTO courses (id, name, description) VALUES (course.id, course.name, course.descrition)
	}

	public void updateCourse(Course newCourse) {
		courseRepository.save(newCourse); // UPDATE courses SET course = newTopic WHERE courses.id = newCourse.id
	}

	public void deleteCourse(String id) {
		courseRepository.delete(id); // DELETE FROM courses WHERE courses.id = id
	}
}
