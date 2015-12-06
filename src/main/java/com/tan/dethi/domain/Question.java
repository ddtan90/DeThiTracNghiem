package com.tan.dethi.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "QUESTION")
public class Question {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "content")
    private String content;

    @ManyToOne
    private QuestionType type;

    @Column(name = "mixQuestion")
    private boolean mixQuestion;

    @Column(name = "mixAnswer")
    private boolean mixAnswer;

    @Column(name = "image")
    private String image;

    @Column(name = "status")
    private String status;

    @OneToMany(/* mappedBy = "question", */ orphanRemoval = true, cascade = { CascadeType.ALL })
    @JoinColumn(name = "questionId")
    private List<Answer> answers;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public QuestionType getType() {
        return type;
    }

    public void setType(QuestionType type) {
        this.type = type;
    }

    public boolean isMixQuestion() {
        return mixQuestion;
    }

    public void setMixQuestion(boolean mixQuestion) {
        this.mixQuestion = mixQuestion;
    }

    public boolean isMixAnswer() {
        return mixAnswer;
    }

    public void setMixAnswer(boolean mixAnswer) {
        this.mixAnswer = mixAnswer;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

}
