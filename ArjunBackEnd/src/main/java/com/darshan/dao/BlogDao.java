package com.darshan.dao;

import java.util.List;

import com.darshan.model.BlogComment;
import com.darshan.model.BlogPost;

public interface BlogDao {
void saveBlogPost(BlogPost blogPost);
public List<BlogPost> getBlogPosts(int approved);
public BlogPost getBlogPostById(int id);
void addBlogComment(BlogComment blogComment);
List<BlogComment> getBlogComments(int blogPostId);
void update(BlogPost blogPost);
}

