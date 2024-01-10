package com.AllSecuirtyConcept.advdbsec.dao;


import com.AllSecuirtyConcept.advdbsec.entities.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicDao extends JpaRepository<Topic, Integer> {


}
