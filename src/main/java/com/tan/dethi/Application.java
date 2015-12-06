package com.tan.dethi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import com.tan.dethi.domain.Question;

@SpringBootApplication
public class Application implements InitializingBean {
    // @Autowired
    // QuestionRepositry qsRepo;

    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        logger.info("Hệ thống khởi động thành công!");
        // Question q = new Question();
        // q.setContent("Taan Taans T");
        // qsRepo.save(q);
    }
}