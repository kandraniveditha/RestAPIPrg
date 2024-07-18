package com.suchi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.suchi.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

	public User findByEmailAndPassword(String email,String password);
}
