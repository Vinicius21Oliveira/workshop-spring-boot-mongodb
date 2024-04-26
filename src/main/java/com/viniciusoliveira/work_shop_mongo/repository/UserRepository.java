package com.viniciusoliveira.work_shop_mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.viniciusoliveira.work_shop_mongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
	
}
