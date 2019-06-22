package com.blogofyogi.SpringBootBackendRestService.repository;

import com.blogofyogi.SpringBootBackendRestService.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;



public interface UserRepository extends JpaRepository<User,Long> {
}
