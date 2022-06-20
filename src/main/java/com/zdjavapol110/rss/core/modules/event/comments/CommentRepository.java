package com.zdjavapol110.rss.core.modules.event.comments;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
  @Query("select c from Comment c where c.event.id = ?1")
  List<Comment> findCommentsWithEventId(Long id);
}
