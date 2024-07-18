package com.suchi.model;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dsr {
	private long id;
	private String empName;
	private String project;
	private Date dsrdate;
	private String hrsWorked;
	private String dsrReport;
	private Date submitdate;
	private boolean visibility;

}
