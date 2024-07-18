package com.suchi.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.suchi.Entity.DsrEntity;

@Repository
public interface DSRRepository extends JpaRepository<DsrEntity, Integer> {

	@Modifying
	@Transactional
	@Query(value="update DsrEntity set visibility=false where id=?1")
	public void deleteEmployeeInfo(long id);
	
	@Query(value="select * from Dsr where visibility=true",nativeQuery = true)
	public List<DsrEntity> findAllEmployeeInfo();

}
