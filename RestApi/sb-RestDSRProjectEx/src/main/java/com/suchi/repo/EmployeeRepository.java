package com.suchi.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.suchi.Entity.EmployeeEntity;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {

	@Modifying
	@Transactional
	@Query(value="update EmployeeEntity set visibility=false where eid=?1")
	public void deleteEmployee(long id);
	
	@Query(value="select * from Employee1 where visibility=true",nativeQuery = true)
	public List<EmployeeEntity> findAllEmployee();
}
