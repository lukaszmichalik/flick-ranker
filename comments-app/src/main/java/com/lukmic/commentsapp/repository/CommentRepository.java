package com.lukmic.commentsapp.repository;

import com.lukmic.commentsapp.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    Set<Comment> findAllByRankingId(Long rankingId);
}
