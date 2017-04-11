package com.karl.spring.boot.data.jpa.repository;

import com.karl.spring.boot.data.jpa.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by karl on 4/8/17.
 */
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findByNameLike(String name);

}
