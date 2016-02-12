package com.model;

import java.util.Set;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
@NodeEntity(label="Course")
public class Course extends Entity {
    private String name;
    @Relationship(type= "SUBJECT_TAUGHT")
    private Subject subject;
    @Relationship(type= "TEACHES_CLASS", direction=Relationship.INCOMING)
    private Teacher teacher;
    @Relationship(type= "ENROLLED", direction=Relationship.INCOMING)
    private Set<Enrollment> enrollments;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public Set<Enrollment> getEnrollments() {
		return enrollments;
	}
	public void setEnrollments(Set<Enrollment> enrollments) {
		this.enrollments = enrollments;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(String name, Subject subject, Teacher teacher,
			Set<Enrollment> enrollments) {
		super();
		this.name = name;
		this.subject = subject;
		this.teacher = teacher;
		this.enrollments = enrollments;
	}
	@Override
	public String toString() {
		return "Course [name=" + name + ", subject=" + subject + ", teacher="
				+ teacher + ", enrollments=" + enrollments + "]";
	}
    
    
}
