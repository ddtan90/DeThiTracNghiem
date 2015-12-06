package com.tan.dethi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tan.dethi.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
