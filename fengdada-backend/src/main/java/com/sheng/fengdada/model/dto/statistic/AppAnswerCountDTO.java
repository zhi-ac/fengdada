package com.sheng.fengdada.model.dto.statistic;

import lombok.Data;

/**
 * 用户提交答案数统计
 */
@Data
public class AppAnswerCountDTO {

    private Long appId;
    private Long answerCount;
}
