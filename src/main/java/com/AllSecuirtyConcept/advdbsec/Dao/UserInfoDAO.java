package com.AllSecuirtyConcept.advdbsec.Dao;

import com.AllSecuirtyConcept.advdbsec.entities.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoDAO extends JpaRepository<UserInfo, Integer> {

    @Query(value = "SELECT u FROM UserInfo u WHERE userName=?1")
    UserInfo getActiveUser(String userName);
}
