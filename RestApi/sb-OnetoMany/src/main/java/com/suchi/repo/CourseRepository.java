package com.suchi.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.suchi.entity.CourseEntity;
import com.suchi.helper.StudentCourse;

@Repository
public interface CourseRepository extends JpaRepository<CourseEntity, Integer> {

	@Query("select new com.suchi.helper.StudentCourse(s.sno,s.sname,s.sadd,c.cname,c.cduration,c.cfee)from CourseEntity c,StudentEntity s")
	List<StudentCourse>getStudentInfo();


}

