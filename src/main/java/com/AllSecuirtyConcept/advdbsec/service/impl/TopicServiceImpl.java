package com.AllSecuirtyConcept.advdbsec.service.impl;

import com.AllSecuirtyConcept.advdbsec.dao.TopicDao;
import com.AllSecuirtyConcept.advdbsec.entities.Topic;
import com.AllSecuirtyConcept.advdbsec.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TopicServiceImpl implements TopicService {

    @Autowired
    private TopicDao topicDao;

    @Override
    public Topic getSingleTopic(Integer integer) {
        return topicDao.findById(integer).orElse(new Topic());
    }

    @Override
    public Topic addTopic(Topic topic) {
        return topicDao.save(topic);
    }

    @Override
    public List<Topic> getAllTopics() {
        return topicDao.findAll();
    }

}
