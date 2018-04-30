package com.blogger.blog.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.blogger.blog.document.Blog;

public interface BlogRepository
        extends MongoRepository<Blog, String>, BlogRepositoryCustom {

}
