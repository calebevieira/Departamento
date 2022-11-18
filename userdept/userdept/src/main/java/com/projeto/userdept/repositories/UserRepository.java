package com.projeto.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
