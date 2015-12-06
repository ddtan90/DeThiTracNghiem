package com.tan.dethi.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tan.dethi.dao.ExamRepository;
import com.tan.dethi.dao.QuestionRepositry;
import com.tan.dethi.domain.Answer;
import com.tan.dethi.domain.Exam;
import com.tan.dethi.domain.Question;

/**
 * Handles requests for the application home page.
 */
@RestController
@RequestMapping("/test")
public class HomeController {

    public HomeController() {
        logger.error("iiiiii---------");
    }

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    QuestionRepositry questionRepo;

    @Autowired
    ExamRepository examRepo;

    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String home() {
        Question q = new Question();
        q.setContent("Tân Đào Duy Thượng Tượng Trượng Mường");

        List<Answer> list = new ArrayList<Answer>();
        Answer a1 = new Answer();
        a1.setContent("Đáp án A");
        list.add(a1);

        Answer a2 = new Answer();
        a2.setContent("Đáp án B");
        list.add(a2);

        q.setAnswers(list);

        questionRepo.save(q);
        return q.getId() + q.getContent() + q.getAnswers();
    }

    @RequestMapping(value = "/exam", method = RequestMethod.GET)
    public String exam() {
        Exam e = new Exam();
        e.setName("1 2010");
        e.setDate(Calendar.getInstance().getTime());
        e.setNote("nothing here!");

        List<Question> qs = new ArrayList<Question>();
        Question s = new Question();
        s.setContent("hhehehehe");
        qs.add(s);

        e.setQuestions(qs);

        examRepo.save(e);
        return e.toString();
    }

}
