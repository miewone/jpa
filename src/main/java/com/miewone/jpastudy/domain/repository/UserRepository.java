package com.miewone.jpastudy.domain.repository;

import com.miewone.jpastudy.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * Created by wgPark on 2021-06-18.
 */
public interface UserRepository extends JpaRepository<User,Long>{
}
