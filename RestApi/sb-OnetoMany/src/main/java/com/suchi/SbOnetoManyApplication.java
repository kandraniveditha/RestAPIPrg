package com.suchi;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.suchi.entity.CourseEntity;
import com.suchi.entity.StudentEntity;
import com.suchi.helper.StudentCourse;
import com.suchi.repo.CourseRepository;
import com.suchi.repo.StudentRepository;

@SpringBootApplication
public class SbOnetoManyApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext ctx=	SpringApplication.run(SbOnetoManyApplication.class, args);
	
	CourseRepository courseImpl=ctx.getBean(CourseRepository.class);	
	
	StudentRepository stuImpl=	ctx.getBean(StudentRepository.class);
	
	/*
	 * StudentEntity stu=new StudentEntity(); stu.setSname("nive");
	 * stu.setSadd("bng");
	 * 
	 * StudentEntity stu1=new StudentEntity(); stu1.setSname("kalpana");
	 * stu1.setSadd("mys"); Set<StudentEntity>addStudents=new
	 * HashSet<StudentEntity>(); addStudents.add(stu1); addStudents.add(stu);
	 */
	
	/*
	 * CourseEntity cus=new CourseEntity(); cus.setCname("SpringBoot");
	 * cus.setCduration("80days"); cus.setCfee(200000);
	 * cus.setStudents(addStudents);
	 * 
	 * courseImpl.save(cus);
	 */
	/*
	 * StudentEntity stu=new StudentEntity(); stu.setSname("lakshmi");
	 * stu.setSadd("tmk"); stu.setCourseId(2);
	 * 
	 * stuImpl.save(stu);
	 */
	
	List<StudentCourse>studentInfo=courseImpl.getStudentInfo();
	for(StudentCourse stu:studentInfo) {
		System.out.println(stu.getSno() +"\t"+ stu.getSname()+"\t"+ stu.getSadd() +"\t"+ stu.getCname() +"\t"+ stu.getCduration() +"\t"+ stu.getCfee());
	}
	
	}

}
