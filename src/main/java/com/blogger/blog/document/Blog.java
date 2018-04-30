package com.blogger.blog.document;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "blog")
public class Blog extends BaseDocument {

    private String writerId;

    private String title;

    private String description;

    private Date createdOn;

    private Date updatedOn;

    private int likes;

    private int dislikes;

    public Blog() {
        super();
    }

    public Blog(final String writerId, final String title,
            final String description, final Date createdOn,
            final Date updatedOn, final int likes, final int dislikes) {
        super();
        this.writerId = writerId;
        this.title = title;
        this.description = description;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
        this.likes = likes;
        this.dislikes = dislikes;
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
