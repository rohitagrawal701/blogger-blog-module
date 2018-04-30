package com.blogger.blog.service.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blogger.blog.document.Blog;
import com.blogger.blog.dto.BlogDto;
import com.blogger.blog.repository.BlogRepository;
import com.blogger.blog.service.BlogService;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogRepository blogRepository;

    @Autowired
    private DozerBeanMapper dozerBeanMapper;

    @Override
    public List<BlogDto> fetchAllBlogs() {
        final List<BlogDto> blogDtoList = new ArrayList<>();
        final List<Blog> blogList = blogRepository.findAll();
        dozerBeanMapper.map(blogList, blogDtoList, "blog");
        return blogDtoList;
    }

    @Override
    public BlogDto fetchBlogById(final String blogId) {
        final BlogDto blogDto = new BlogDto();
        final Blog blog = blogRepository.findOne(blogId);
        dozerBeanMapper.map(blog, blogDto, "blog");
        return blogDto;
    }

    @Override
    public boolean deleteBlogById(final String blogId) {
        blogRepository.delete(blogId);
        return true;
    }

    @Override
    public BlogDto updateBlog(final BlogDto blogDto) {
        final Blog blog = new Blog();
        dozerBeanMapper.map(blogDto, blog, "blog");
        blog.setUpdatedOn(Calendar.getInstance().getTime());
        blogRepository.save(blog);
        return blogDto;
    }

    @Override
    public BlogDto insertBlog(final BlogDto blogDto) {
        final Blog blog = new Blog();
        dozerBeanMapper.map(blogDto, blog, "blog-create-dto-to-entity");
        blog.setCreatedOn(Calendar.getInstance().getTime());
        blog.setUpdatedOn(Calendar.getInstance().getTime());
        blogRepository.insert(blog);
        blogDto.setId(blog.getId());
        return blogDto;
    }

}
