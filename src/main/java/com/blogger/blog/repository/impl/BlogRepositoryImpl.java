package com.blogger.blog.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.blogger.blog.repository.BlogRepositoryCustom;

public class BlogRepositoryImpl extends BaseRepositoryImpl
        implements BlogRepositoryCustom {

    @Autowired
    MongoTemplate mongoTemplate;

}
