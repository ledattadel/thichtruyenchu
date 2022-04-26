package com.thichdoctruyen.thichdoctruyen.Entity;

import javax.persistence.*;

@Entity
@Table(name = "user_intereaction")
public class UserInteractionEntity extends BaseEntity {

    @Column(name = "content", nullable = false)
    private String content;

    @Column(name = "star", nullable = false)
    private Long star;

    @Column(name = "follow", nullable = false)
    private boolean follow = false;

    @Column(name = "liked", nullable = false)
    private boolean liked = false;



    //book n - 1
    @ManyToOne
    @JoinColumn(name = "bookid")
    private BookEntity book;


    // user n - 1
    @ManyToOne
    @JoinColumn(name = "userid")
    private UserEntity user;


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getStar() {
        return star;
    }

    public void setStar(Long star) {
        this.star = star;
    }

    public boolean isFollow() {
        return follow;
    }

    public void setFollow(boolean follow) {
        this.follow = follow;
    }

    public boolean isLiked() {
        return liked;
    }

    public void setLiked(boolean liked) {
        this.liked = liked;
    }

    public BookEntity getBook() {
        return book;
    }

    public void setBook(BookEntity book) {
        this.book = book;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }
}