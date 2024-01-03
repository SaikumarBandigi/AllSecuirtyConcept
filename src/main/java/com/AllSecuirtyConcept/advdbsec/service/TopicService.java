package com.AllSecuirtyConcept.advdbsec.service;

import com.AllSecuirtyConcept.advdbsec.entities.Topic;
import org.springframework.security.access.annotation.Secured;

import java.util.List;

public interface TopicService {
	
	 @Secured ({"ROLE_ADMIN", "ROLE_USER"})
	//@PreAuthorize("hasAnyRole('ADMIN','GUEST')")
	 public abstract List<Topic> getAllTopics();
	 
	 @Secured ({"ROLE_ADMIN", "ROLE_USER"})
	 public abstract Topic getTopicById(int topicId);
	 
	 @Secured ({"ROLE_ADMIN"})
	 public abstract Topic addTopic(Topic topic);
	 
	 @Secured ({"ROLE_ADMIN"})
	 public abstract Topic updateTopic(Topic topic);
	 
	 @Secured ({"ROLE_ADMIN"})
	 public abstract void deleteTopic(int topicId);
}
