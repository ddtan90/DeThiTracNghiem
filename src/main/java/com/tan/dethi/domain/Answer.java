package com.tan.dethi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ANSWER")
public class Answer {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "content")
    private String content;

    @Column(name = "pin")
    private boolean pin;
    
//    @ManyToOne
//    @JoinColumn(name="questionId")
//    private Question question;

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

    public boolean isPin() {
        return pin;
    }

    public void setPin(boolean pin) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "Answer [id=" + id + ", content=" + content + ", pin=" + pin + "]";
    }

}
