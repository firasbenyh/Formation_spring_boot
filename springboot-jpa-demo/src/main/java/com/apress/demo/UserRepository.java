/**
 * 
 */
package com.apress.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @author Siva
 *
 */
public interface UserRepository extends JpaRepository<User, Integer>
{
	User findByName(String name);
	
	List<User> findByIdBetween(int a, int b);
	
	List<User> findByNameLike(String name);
	
	@Query("select u from User u where u.name like %?1%")
	List<User> searchByName(String name);
}

