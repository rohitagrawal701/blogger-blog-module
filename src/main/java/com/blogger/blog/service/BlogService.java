package com.blogger.blog.service;

import java.util.List;

import com.blogger.blog.dto.BlogDto;

public interface BlogService {

    List<BlogDto> fetchAllBlogs();

    BlogDto fetchBlogById(String blogId);

    boolean deleteBlogById(String blogId);

    BlogDto updateBlog(BlogDto blogDto);

    BlogDto insertBlog(BlogDto blogDto);

}
