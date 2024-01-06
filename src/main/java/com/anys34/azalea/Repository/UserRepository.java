package com.anys34.azalea.Repository;

import com.anys34.azalea.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
