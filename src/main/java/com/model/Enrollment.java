package com.model;

import java.util.Date;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;
import org.neo4j.ogm.annotation.typeconversion.DateLong;

@RelationshipEntity(type = "ENROLLED")
public class Enrollment {
	private Long id;
	@StartNode
	private Student student;

	@EndNode
	private Course course;
	@DateLong
	@Property(name="enrolledDate")
	private Date enrolledDate;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Date getEnrolledDate() {
		return enrolledDate;
	}
	public void setEnrolledDate(Date enrolledDate) {
		this.enrolledDate = enrolledDate;
	}
	public Enrollment(Long id, Student student, Course course, Date enrolledDate) {
		super();
		this.id = id;
		this.student = student;
		this.course = course;
		this.enrolledDate = enrolledDate;
	}
	public Enrollment() {
		super();
	}
	@Override
	public String toString() {
		return "Enrollment [id=" + id + ", student=" + student + ", course="
				+ course + ", enrolledDate=" + enrolledDate + "]";
	}
	
	
	
}
