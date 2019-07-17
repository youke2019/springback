package com.yoke.backend.Entity.CourseMessage.Praise;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;

/**
 * @AUTHOR: Guozhi
 * @DATE : 2019/7/17
 * @description:
 **/
@Entity
@Table(name="question_praise",schema = "yoke",catalog = "")
@JsonIgnoreProperties(value = {"handler","hibernateLazyInitializer","fieldHandler"})
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "questioin_praise_id"
)
public class CourseQuestioinPraise {
    private Integer question_praise_id;
    private Integer question_id;
    private String user_id;

    @Id
    @Column(name = "question_praise_id")
    public Integer getQuestion_praise_id() {
        return question_praise_id;
    }

    public void setQuestion_praise_id(Integer question_praise_id) {
        this.question_praise_id = question_praise_id;
    }

    @Basic
    @Column(name = "question_id")
    public Integer getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(Integer question_id) {
        this.question_id = question_id;
    }

    @Basic
    @Column(name = "ID")
    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
}
