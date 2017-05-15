package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.AttributeOverride;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;
	
	public List<Topic> getAllTopics() {
		ArrayList<Topic> topics = new ArrayList<Topic>();
		topicRepository.findAll().forEach(topics::add); // SELECT * from topics
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topicRepository.findOne(id); // SELECT * from topics WHERE topics.id = id
	}

	public void addTopic(Topic topic) {
		topicRepository.save(topic); // INSERT INTO topics (id, name, description) VALUES (topic.id, topic.name, topic.descrition)
	}

	public void updateTopic(String id, Topic newTopic) {
		topicRepository.save(newTopic); // UPDATE topics SET topic = newTopic WHERE topic.id = newTopic.id
	}

	public void deleteTopic(String id) {
		topicRepository.delete(id); // DELETE FROM topics WHERE topics.id = id
	}
}
