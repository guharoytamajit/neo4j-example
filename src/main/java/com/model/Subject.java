package com.model;

import java.util.Set;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
@NodeEntity(label="Subject")
public class Subject extends Entity {
	private String name;
	 @Relationship(type="CURRICULUM", direction = Relationship.INCOMING)//direction default to OUTGOING
    private Department department;
	 @Relationship(type = "TAUGHT_BY")
    private Set<Teacher> teachers;
	 @Relationship(type = "SUBJECT_TAUGHT", direction = "INCOMING")
    private Set<Course> courses;
}
