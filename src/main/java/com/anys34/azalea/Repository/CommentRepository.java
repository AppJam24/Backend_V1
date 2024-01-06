package com.anys34.azalea.Repository;

import com.anys34.azalea.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
