package com.blogger.blog.document;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "blog")
public class Blog extends BaseDocument {

    private String writerId;

    private String title;

    private String description;

    private Date createdOn;

    private Date updatedOn;

    private List<String> usersLiked;

    private List<String> usersDisliked;

    public Blog() {
        super();
    }

    public Blog(final String writerId, final String title,
            final String description, final Date createdOn,
            final Date updatedOn, final List<String> usersLiked,
            final List<String> usersDisliked) {
        super();
        this.writerId = writerId;
        this.title = title;
        this.description = description;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
        this.usersLiked = usersLiked;
        this.usersDisliked = usersDisliked;
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

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(final Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(final Date updatedOn) {
        this.updatedOn = updatedOn;
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