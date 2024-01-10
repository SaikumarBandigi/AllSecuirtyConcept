package com.AllSecuirtyConcept.advdbsec.controller;

import com.AllSecuirtyConcept.advdbsec.entities.Topic;
import com.AllSecuirtyConcept.advdbsec.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;


@RestController
@RequestMapping("/user")
public class TopicController {

    @Autowired
    private TopicService topicService;

    @GetMapping("/topic/{id}")
    public ResponseEntity<Topic> getTopicById(@PathVariable("id") Integer id) {
        Topic topic = topicService.getSingleTopic(id);

        return new ResponseEntity<Topic>(topic, HttpStatus.OK);
    }

    @GetMapping("/topics")
    public ResponseEntity<List<Topic>> getAllTopics() {
        List<Topic> list = topicService.getAllTopics();
        return new ResponseEntity<List<Topic>>(list, HttpStatus.OK);
    }

    @PostMapping("/topic")
    public ResponseEntity<String> addTopic(@RequestBody Topic topic, UriComponentsBuilder builder) {


        Topic topicNew = topicService.addTopic(topic);
        if (topicNew.getTopicid()==0) {
            return new ResponseEntity<String>("This Topic already exist", HttpStatus.CONFLICT);
        }


        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(builder.path("/user/topic/{id}").
                buildAndExpand(topic.getTopicid()).toUri());

        return new ResponseEntity<String>(headers, HttpStatus.CREATED);
    }

}