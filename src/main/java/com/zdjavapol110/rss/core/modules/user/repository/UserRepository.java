package com.zdjavapol110.rss.core.modules.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends
        JpaRepository<UserEntity, Long>, JpaSpecificationExecutor<UserEntity> {

    UserEntity getByUuid(String uuid);
    @Query("SELECT u FROM UserEntity u WHERE u.email = ?1")
     UserEntity findByEmail(String email);

    @Query("SELECT u FROM UserEntity u WHERE u.username = ?1")
    UserEntity findByUserName(String username);



}
