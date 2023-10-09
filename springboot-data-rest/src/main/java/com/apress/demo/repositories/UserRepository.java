package com.apress.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.apress.demo.entities.User;

/**
 * @author Siva
 * 
 */
//@RepositoryRestResource(path = "people")

//@CrossOrigin
public interface UserRepository extends JpaRepository<User, Integer>
{
	//@RestResource(path = "nom")
	//List <User> findByNomContains(String nom);
}
