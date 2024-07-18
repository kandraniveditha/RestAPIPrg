package com.suchi.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="COURSE")
public class CourseEntity {

	@Id
	@GenericGenerator(name="myGenerator",strategy="increment")
	@GeneratedValue(strategy=GenerationType.AUTO,generator="myGenerator")
	private int cid;
	private String cname;
	private String cduration;
	private int cfee;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="cid")
	private Set<StudentEntity>students;
    

}
