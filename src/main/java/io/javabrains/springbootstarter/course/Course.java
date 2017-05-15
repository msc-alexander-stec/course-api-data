package io.javabrains.springbootstarter.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import io.javabrains.springbootstarter.topic.Topic;

@Entity
public class Course {

	@Id // PrimaryKey
	private String id;
	private String name;
	private String description;
	@ManyToOne // [Topic] 1 --- has ---> * [Course]
	private Topic topic;

	public Course() {
	}
	
	public Course(String id, String name, String decription, String topicId) {
		super();
		this.id = id;
		this.name = name;
		this.description = decription;
		this.topic = new Topic(topicId, "", "");
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDecription() {
		return description;
	}
	public void setDecription(String decription) {
		this.description = decription;
	}
	
	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}
}
