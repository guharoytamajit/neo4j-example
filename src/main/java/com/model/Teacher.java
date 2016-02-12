package com.model;

import java.util.Set;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
@NodeEntity(label="Teacher")
public class Teacher extends Entity {
	private String name;
	@Relationship(type="TEACHES_CLASS")
    private Set<Course> courses;
	@Relationship(type="TAUGHT_BY", direction = Relationship.INCOMING)
    private Set<Subject> subjects;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Course> getCourses() {
		return courses;
	}
	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}
	public Set<Subject> getSubjects() {
		return subjects;
	}
	public void setSubjects(Set<Subject> subjects) {
		this.subjects = subjects;
	}
	public Teacher(String name, Set<Course> courses, Set<Subject> subjects) {
		super();
		this.name = name;
		this.courses = courses;
		this.subjects = subjects;
	}
	public Teacher() {
		super();
	}
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", courses=" + courses + ", subjects="
				+ subjects + "]";
	}
	
}
