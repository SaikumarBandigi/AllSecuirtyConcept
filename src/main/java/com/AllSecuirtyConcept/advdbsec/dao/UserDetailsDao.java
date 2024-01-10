package com.AllSecuirtyConcept.advdbsec.dao;


import com.AllSecuirtyConcept.advdbsec.entities.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDetailsDao extends JpaRepository<UserInfo, String> {

    @Query(value = "select u from UserInfo u where name=?1")
    UserInfo getActiveUser(String name);

}
