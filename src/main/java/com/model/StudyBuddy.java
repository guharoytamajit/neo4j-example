package com.model;

import java.util.List;

import org.neo4j.ogm.annotation.Relationship;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StudyBuddy extends Entity {
	@Relationship(type = "BUDDY")
	List<Student> buddies;

	@JsonProperty("course")
	Course course;
}
