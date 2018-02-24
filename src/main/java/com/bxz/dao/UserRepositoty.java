package com.bxz.dao;

import com.bxz.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by SQ_BXZ on 2018-02-24.
 */
@Repository
public interface UserRepositoty extends JpaRepository<User,Long> {

    @Query("select t from User t where t.name = :name")
    User findByUserName(@Param("name") String name);
}
