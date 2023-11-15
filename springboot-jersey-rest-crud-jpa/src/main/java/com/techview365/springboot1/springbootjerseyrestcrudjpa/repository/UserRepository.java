package com.techview365.springboot1.springbootjerseyrestcrudjpa.repository;

import com.techview365.springboot1.springbootjerseyrestcrudjpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


}
