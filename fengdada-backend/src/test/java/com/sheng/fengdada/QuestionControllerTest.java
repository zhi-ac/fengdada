package com.sheng.fengdada;

import com.sheng.fengdada.controller.QuestionController;
import com.sheng.fengdada.model.dto.question.AiGenerateQuestionRequest;
import io.reactivex.Scheduler;
import io.reactivex.schedulers.Schedulers;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class QuestionControllerTest {

    @Resource
    private QuestionController questionController;

    @Test
    void aiGenerateQuestionSSEVIPTest() throws InterruptedException {
        AiGenerateQuestionRequest request = new AiGenerateQuestionRequest();
        request.setAppId(3L);
        request.setQuestionNumber(10);
        request.setOptionNumber(2);

        questionController.aiGenerateQuestionSSETest(request, false);
        questionController.aiGenerateQuestionSSETest(request, false);
        questionController.aiGenerateQuestionSSETest(request, true);

        Thread.sleep(1000000L);
    }

}
