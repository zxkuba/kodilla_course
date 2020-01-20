package com.kodilla.testing.forum;

import java.util.Objects;

public class ForumPost {

    String author;
    String postBody;


    public ForumPost(String author, String postBody) {
        this.author = author;
        this.postBody = postBody;
    }

    public String getPostBody() {
        return postBody;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForumPost forumPost = (ForumPost) o;
        return Objects.equals(postBody, forumPost.postBody) &&
                Objects.equals(author, forumPost.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postBody, author);
    }
}
