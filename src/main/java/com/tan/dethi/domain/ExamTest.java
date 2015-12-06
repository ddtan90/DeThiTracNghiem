package com.tan.dethi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EXAM_TEST")
public class ExamTest {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "testCode")
    private String testCode;

}
