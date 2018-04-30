package com.blogger.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.blogger.blog.dto.BlogDto;
import com.blogger.blog.response.RESTResponse;
import com.blogger.blog.service.BlogService;

@RestController
@RequestMapping("/api")
public class BlogController {

    @Autowired
    BlogService blogService;

    @RequestMapping(value = "/blog", method = RequestMethod.POST, produces = {
            MediaType.APPLICATION_JSON_VALUE})
    public RESTResponse insertBlog(@RequestBody final BlogDto blogDto) {
        return RESTResponse.ok(blogService.insertBlog(blogDto));
    }

    @RequestMapping(value = "/blog/{blog-id}", method = RequestMethod.GET, produces = {
            MediaType.APPLICATION_JSON_VALUE})
    public RESTResponse fetchBlogById(
            @PathVariable("blog-id") final String blogId) {
        return RESTResponse.ok(blogService.fetchBlogById(blogId));
    }

    @RequestMapping(value = "/blog", method = RequestMethod.GET, produces = {
            MediaType.APPLICATION_JSON_VALUE})
    public RESTResponse fetchAllBlogs() {
        return RESTResponse.ok(blogService.fetchAllBlogs());
    }

    @RequestMapping(value = "/blog/{blog-id}", method = RequestMethod.DELETE, produces = {
            MediaType.APPLICATION_JSON_VALUE})
    public RESTResponse deleteBlog(
            @PathVariable("blog-id") final String blogId) {
        return RESTResponse.ok(blogService.deleteBlogById(blogId));
    }

    @RequestMapping(value = "/blog", method = RequestMethod.PUT, produces = {
            MediaType.APPLICATION_JSON_VALUE})
    public RESTResponse updateBlog(@RequestBody final BlogDto blogDto) {
        return RESTResponse.ok(blogService.updateBlog(blogDto));
    }

}
