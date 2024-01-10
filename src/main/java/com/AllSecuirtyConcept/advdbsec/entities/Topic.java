package com.AllSecuirtyConcept.advdbsec.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Topic implements Serializable {

    //private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer topicid;

    private String topicname;

    private String category;


    public Integer getTopicid() {
        return topicid;
    }

    public void setTopicid(Integer topicid) {
        this.topicid = topicid;
    }

    public String getTopicname() {
        return topicname;
    }

    public void setTopicname(String topicname) {
        this.topicname = topicname;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public Topic() {
    }

    public Topic(Integer topicid, String topicname, String category) {
        this.topicid = topicid;
        this.topicname = topicname;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Topic{" +
                "topicid=" + topicid +
                ", topicname='" + topicname + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
