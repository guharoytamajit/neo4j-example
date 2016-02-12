package com.model;

import java.util.Set;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
@NodeEntity(label="Department")
public class Department extends Entity  {
	private String name;
	@Relationship(type = "CURRICULUM")
    private Set<Subject> subjects;
}
