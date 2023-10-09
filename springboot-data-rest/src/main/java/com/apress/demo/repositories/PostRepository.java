package com.apress.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.apress.demo.entities.Post;

/**
 * @author Siva
 * 
 */
//@RepositoryRestResource(exported = false)
@RepositoryRestResource(path = "posts")




//http://localhost:8080/posts/100

//http://localhost:8080/posts?size=50


//http://localhost:8080/posts?page=2&size=50&sort=createdOn,desc

//http://localhost:8080/posts/search/findByTitleLike?query=Hello













//http://localhost:8080/posts/?size=10
//http://localhost:8080/posts?page=2&size=5
//http://localhost:8080/posts?sort=createdOn,desc

//@CrossOrigin( origins = {"poste.tn", "cni.tn"})
public interface PostRepository extends JpaRepository<Post, Integer>
{
	// @RestResource(exported = false) -- not exposed as a REST
	List<Post> findByTitleLike(String query);
}
