package io.javabrains.springbootstarter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> { // <Course class, Id from Course class>

	// Only Declaration. Spring Data JPA will implement this method for me
	//public List<Course> findByName(String name);
	//public List<Course> findByDescription(String description);
	public List<Course> findByTopicId(String topicId);
}
