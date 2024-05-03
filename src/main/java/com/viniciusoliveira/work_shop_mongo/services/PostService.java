package com.viniciusoliveira.work_shop_mongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viniciusoliveira.work_shop_mongo.domain.Post;
import com.viniciusoliveira.work_shop_mongo.domain.User;
import com.viniciusoliveira.work_shop_mongo.repository.PostRepository;
import com.viniciusoliveira.work_shop_mongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;

	
	public Post findById(String id) {
		Optional<Post> user = repo.findById(id);
		return user.orElseThrow(() -> new ObjectNotFoundException("Post não encontrado"));
	}
}