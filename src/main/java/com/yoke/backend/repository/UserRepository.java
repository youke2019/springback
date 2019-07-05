package com.yoke.backend.repository;

import com.yoke.backend.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findUserByJaccount(String jaccount);

    User findUserById(String id);

}
