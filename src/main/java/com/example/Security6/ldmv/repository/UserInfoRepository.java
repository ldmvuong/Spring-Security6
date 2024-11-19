package com.example.Security6.ldmv.repository;

import com.example.Security6.ldmv.entity.UserInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserInfoRepository extends CrudRepository<UserInfo, Integer> {
    Optional<UserInfo> findByName(String username);
}
