package com.suchi.Entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="DSR")
public class DsrEntity {

	@Id
	@GenericGenerator(name="myGenerator",strategy="Increment")
	@GeneratedValue(generator="myGenetaor",strategy=GenerationType.AUTO)
	private int id;
	private String empName;
	private String project;
	private Date dsrdate;
	private String hrsWorked;
	private String dsrReport;
	private Date submitdate;
	
	@CreationTimestamp
	@Column(name="create_at",updatable=false)
	private Date createdAt;
	@UpdateTimestamp
	@Column(name="updated_at",insertable=false)
	
	private Date updatedAt;

	private boolean visibility;
}
