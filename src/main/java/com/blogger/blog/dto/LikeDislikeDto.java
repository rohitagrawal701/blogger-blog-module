package com.blogger.blog.dto;

import java.io.Serializable;

public class LikeDislikeDto implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private String blogId;

    private String userId;

    public LikeDislikeDto() {
    }

    public LikeDislikeDto(final String blogId, final String userId) {
        super();
        this.blogId = blogId;
        this.userId = userId;
    }

    public String getBlogId() {
        return blogId;
    }

    public void setBlogId(final String blogId) {
        this.blogId = blogId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(final String userId) {
        this.userId = userId;
    }

}
