package com.blogger.blog.dto;

import java.io.Serializable;

public class BlogDto implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private String id;

    private String writerId;

    private String title;

    private String description;

    private int likes;

    private int dislikes;

    public BlogDto() {
    }

    public BlogDto(final String id, final String writerId, final String title,
            final String description, final int likes, final int dislikes) {
        super();
        this.id = id;
        this.writerId = writerId;
        this.title = title;
        this.description = description;
        this.likes = likes;
        this.dislikes = dislikes;
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getWriterId() {
        return writerId;
    }

    public void setWriterId(final String writerId) {
        this.writerId = writerId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(final int likes) {
        this.likes = likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public void setDislikes(final int dislikes) {
        this.dislikes = dislikes;
    }
}