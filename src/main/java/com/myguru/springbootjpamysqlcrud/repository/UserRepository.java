package com.myguru.springbootjpamysqlcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myguru.springbootjpamysqlcrud.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
