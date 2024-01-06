package com.anys34.azalea.Repository;

import com.anys34.azalea.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
