package com.suchi.Entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="EMPLOYEE")
public class EmployeeEntity {
	
	@Id
	@GenericGenerator(name="myGenerator",strategy="Increment")
	@GeneratedValue(generator="myGenetaor",strategy=GenerationType.AUTO)
	private int id;
	private String empName;
	private String project;
	
	private boolean visibility;
}
