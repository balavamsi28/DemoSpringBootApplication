package com.example.DemoApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.DemoApplication.Entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
