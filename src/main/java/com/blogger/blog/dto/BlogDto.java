package com.blogger.blog.dto;

import java.io.Serializable;
import java.util.List;

public class BlogDto implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private String id;

    private String writerId;

    private String title;

    private String description;

    private List<String> usersLiked;

    private List<String> usersDisliked;

    public BlogDto() {
    }

    public BlogDto(final String id, final String writerId, final String title,
            final String description, final List<String> usersLiked,
            final List<String> usersDisliked) {
        super();
        this.id = id;
        this.writerId = writerId;
        this.title = title;
        this.description = description;
        this.usersLiked = usersLiked;
        this.usersDisliked = usersDisliked;
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

    public List<String> getUsersLiked() {
        return usersLiked;
    }

    public void setUsersLiked(final List<String> usersLiked) {
        this.usersLiked = usersLiked;
    }

    public List<String> getUsersDisliked() {
        return usersDisliked;
    }

    public void setUsersDisliked(final List<String> usersDisliked) {
        this.usersDisliked = usersDisliked;
    }

}