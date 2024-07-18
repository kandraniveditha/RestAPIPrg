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
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="PROJECT")
public class ProjectEntity {

	@Id
	@GenericGenerator(name="myGenerator",strategy="Increment")
	@GeneratedValue(generator="myGenetaor",strategy=GenerationType.AUTO)
	private int pid;
	private String pname;
}
