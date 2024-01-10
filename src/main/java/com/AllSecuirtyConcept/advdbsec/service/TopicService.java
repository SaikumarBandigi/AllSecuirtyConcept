package com.AllSecuirtyConcept.advdbsec.service;


import com.AllSecuirtyConcept.advdbsec.dao.TopicDao;
import com.AllSecuirtyConcept.advdbsec.entities.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TopicService {


    @Secured({"ROLE_ADMIN", "ROLE_USER"})
    Topic getSingleTopic(Integer integer);

    @Secured({"ROLE_ADMIN"})
    Topic addTopic(Topic topic);

    @Secured({"ROLE_ADMIN", "ROLE_USER"})
    List<Topic> getAllTopics();


}
