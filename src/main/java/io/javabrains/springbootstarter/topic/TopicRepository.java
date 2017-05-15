package io.javabrains.springbootstarter.topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> { // <Topic class, Id from Topic class>

	// getAllTopics()
	// getTopic(String id)
	// updateTopic(Topic topic)
	// deleteTopic(String id)
}
