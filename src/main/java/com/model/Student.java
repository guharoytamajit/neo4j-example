package com.model;

import java.util.Set;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity(label = "Student")
public class Student extends Entity {
	private String name;
	@Relationship(type = "ENROLLED")
	private Set<Enrollment> enrollments;
	@Relationship(type = "BUDDY", direction = Relationship.INCOMING)
	private Set<StudyBuddy> studyBuddies;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Enrollment> getEnrollments() {
		return enrollments;
	}
	public void setEnrollments(Set<Enrollment> enrollments) {
		this.enrollments = enrollments;
	}
	public Set<StudyBuddy> getStudyBuddies() {
		return studyBuddies;
	}
	public void setStudyBuddies(Set<StudyBuddy> studyBuddies) {
		this.studyBuddies = studyBuddies;
	}
	public Student(String name, Set<Enrollment> enrollments,
			Set<StudyBuddy> studyBuddies) {
		super();
		this.name = name;
		this.enrollments = enrollments;
		this.studyBuddies = studyBuddies;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", enrollments=" + enrollments
				+ ", studyBuddies=" + studyBuddies + "]";
	}
}
