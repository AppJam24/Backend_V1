package com.anys34.azalea.Repository;

import com.anys34.azalea.domain.Hashtag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HashtagRepository extends JpaRepository<Hashtag, Long> {
    Hashtag findByName(String name);
}
