package com.AllSecuirtyConcept.advdbsec.service.impl;

import com.AllSecuirtyConcept.advdbsec.Dao.TopicDAO;
import com.AllSecuirtyConcept.advdbsec.entities.Topic;
import com.AllSecuirtyConcept.advdbsec.service.TopicService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicServiceImpl implements TopicService {

	@Autowired
	private TopicDAO topicDAO;

	@Override
	public Topic getTopicById(int topicId) {
		Topic topic = topicDAO.findById(topicId).orElse(new Topic());
		return topic;
	}

	@Override
	public List<Topic> getAllTopics() {
		return topicDAO.findAll();
	}

	@Override
	public Topic addTopic(Topic topic) {
		return topicDAO.save(topic);
	}

	@Override
	public Topic updateTopic(Topic topic) {

		Topic topicDbObj = getTopicById(topic.getTopicId());
		if (topic.getTitle() != null) {
			topicDbObj.setTitle(topic.getTitle());
		}

		if (topic.getCategory() != null) {
			topicDbObj.setCategory(topic.getCategory());
		}
		return topicDAO.save(topicDbObj);
	}

	@Override
	public void deleteTopic(int topicId) {
		topicDAO.deleteById(topicId);
	}
}
